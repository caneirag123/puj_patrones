package mundo;

import java.io.Serializable;

/**
 * 
 * @author Manuel Alejandro Coral Lozano - Juan Sebasti�n Quintero Yoshioka
 *         Proyecto final - Algoritmos y programaci�n II.
 */

public abstract class Nave implements Serializable {

	// ---------------------------Asociaciones--------------------------

	Disparo disparoUno;

	// ----------------------------Atributos----------------------------
	
	private static final long serialVersionUID = 1L;
	private double velocidad;
	protected int posX;
	protected int posY;
	private int vida;
	private int ancho;
	private int alto;
	private String rutaImage;

	// ---------------------------Constructor---------------------------

	public Nave() {
		this.velocidad = 0;
		this.posX = 0;
		this.posY = 0;
		this.vida = 0;
		this.ancho = 0;
		this.alto = 0;
	}

	public Nave(double velocidad, int posX, int posY, int vida, int ancho, int alto, String ruta) {
		this.velocidad = velocidad;
		this.posX = posX;
		this.posY = posY;
		this.vida = vida;
		this.ancho = ancho;
		this.alto = alto;
		rutaImage = ruta;
	}

	// -----------------------------M�todos-----------------------------

	public String getRutaImage() {
		return rutaImage;
	}

	public void setRutaImage(String rutaImage) {
		this.rutaImage = rutaImage;
	}

	public double getVelocidad() {
		return this.velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	public int getPosX() {
		return this.posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return this.posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getVida() {
		return this.vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public void golpe (int da�o) {
		this.vida = this.vida - da�o;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getAncho() {
		return this.ancho;
	}

	public int getAlto() {
		return this.alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public Disparo getDisparoUno() {
		return disparoUno;
	}

	public void setDisparoUno(Disparo disparoUno) {
		this.disparoUno = disparoUno;
	}

	public boolean estaViva() {
		return vida != 0;
	}

	public void mover(int dir) {
	}

	public void resetear() {
	}
	
	public void eliminarDisparo() {
		disparoUno = null;
	}
	
	public void disparar (int posX, int posY) {
		
		if (disparoUno == null) {
			disparoUno = new Disparo(posX, posY);
		}
		
	}

}