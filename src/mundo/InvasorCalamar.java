package mundo;

/**
 *
 * @author Manuel Alejandro Coral Lozano - Juan Sebasti�n Quintero Yoshioka
 *         Proyecto final - Algoritmos y programaci�n II.
 */
public class InvasorCalamar extends Enemigo {

	private static final long serialVersionUID = 1L;
	// ---------------------------Constructor---------------------------

	public InvasorCalamar(double velocidad, int posX, int posY, int vida, int ancho, int alto, int direccion, String rutaImage, String ruta) {
		super(velocidad, posX, posY, vida, ancho, alto, direccion, rutaImage, ruta);
		
		rutaImage = ("./data/imagenes/Naves/s0.png");
		setPuntosPorMuerte(30);
		
	}
}
