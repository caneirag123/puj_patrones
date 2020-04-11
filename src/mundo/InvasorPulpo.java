package mundo;

/**
 *
 * @author Manuel Alejandro Coral Lozano - Juan Sebastián Quintero Yoshioka
 *         Proyecto final - Algoritmos y programación II.
 */
public class InvasorPulpo extends Enemigo {

	private static final long serialVersionUID = 1L;
	
	// ---------------------------Constructor---------------------------

	public InvasorPulpo(double velocidad, int posX, int posY, int vida, int ancho, int alto, int direccion, String rutaImage, String ruta) {
		super(velocidad, posX, posY, vida, ancho, alto, direccion, rutaImage, ruta);
		
		rutaImage = ("./data/imagenes/Naves/r0.png");
		setPuntosPorMuerte(10);
	}
	
}