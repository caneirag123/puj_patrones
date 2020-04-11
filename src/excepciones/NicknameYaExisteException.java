package excepciones;

public class NicknameYaExisteException extends Exception {
	private static final long serialVersionUID = 1L;

	public NicknameYaExisteException(String nombre) {
		super("El jugador con el nombre " + nombre + " ya existe");
	}
}
