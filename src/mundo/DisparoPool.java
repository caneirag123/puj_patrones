package mundo;

public class DisparoPool extends ObjectPool<Disparo> {
	 
	public JDBCConnectionPool(String driver, String url, String usr, String pwd) {
        super();
        try {
            Class.forName(driver).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.url = url;
        this.usr = usr;
        this.pwd = pwd;
    }
 
    @Override
    protected Disparo create() {
        return new Disparo(0,0);
    }
 
    @Override
    public void expire(Connection o) {
        try {
            ((Connection) o).close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
 
    @Override
    public boolean validate(Connection o) {
        try {
            return (!((Connection) o).isClosed());
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }
}