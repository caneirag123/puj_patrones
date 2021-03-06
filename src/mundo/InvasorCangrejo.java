package mundo;

/**
 *
 * @author Manuel Alejandro Coral Lozano - Juan Sebastián Quintero Yoshioka
 *         Proyecto final - Algoritmos y programación II.
 */
public class InvasorCangrejo extends Enemigo {

	private static final long serialVersionUID = 1L;
	
	// ---------------------------Constructor---------------------------
	
	public InvasorCangrejo(double velocidad, int posX, int posY, int vida, int ancho, int alto, int direccion, String rutaImage, String ruta) {
		super(velocidad, posX, posY, vida, ancho, alto, direccion, rutaImage, ruta);
		
		rutaImage = ("./data/imagenes/Naves/p0.png");
		setPuntosPorMuerte(20);
		
	}
	
}