package mundo;

/**
 *
 * @author Manuel Alejandro Coral Lozano - Juan Sebasti�n Quintero Yoshioka
 *         Proyecto final - Algoritmos y programaci�n II.
 */
public abstract class Enemigo extends Nave {

	// ----------------------------Constantes---------------------------
	
	private static final long serialVersionUID = 1L;
	public final static int IZQUIERDA = 0;
	public final static int DERECHA = 1;

	// ----------------------------Atributos----------------------------

	private int direccion;
	private String rutaImagen2;
	private int puntosPorMuerte;
	
	// ---------------------------Constructor---------------------------

	public Enemigo(double velocidad, int posX, int posY, int vida, int ancho, int alto, int direccion, String rutaImage, String rutaImage2) {
		super(velocidad, posX, posY, vida, ancho, alto, rutaImage);
		this.direccion = direccion;
		rutaImagen2 = rutaImage2;
	}

	// -----------------------------M�todos-----------------------------

	public void setDireccion(int direccion) {
		this.direccion = direccion;
	}

	public int getDireccion() {
		return direccion;
	}

	public String getRutaImagen2() {
		return rutaImagen2;
	}

	public void setRutaImagen2(String rutaImagen2) {
		this.rutaImagen2 = rutaImagen2;
	}
	
	public int getPuntosPorMuerte() {
		return puntosPorMuerte;
	}

	public void setPuntosPorMuerte(int puntosPorMuerte) {
		this.puntosPorMuerte = puntosPorMuerte;
	}

	public boolean edge (){
		return (posX > 599 || posX < 0);
	}
	
	@Override
	public void mover(int dir) {
		// TODO Auto-generated method stub
		super.mover(dir);
		
		posX += dir*getVelocidad();
	}
	
	public void moverAbajo (int dir) {
		posY += dir*10;
	}
	
}
