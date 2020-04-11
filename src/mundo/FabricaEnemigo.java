package mundo;

//CANG FACTORY METHOD

public class FabricaEnemigo {
	
	public Enemigo creaEnemigo (String tipoEnemigo, double velocidad, int posX, int posY, int vida, int ancho, int alto, int direccion, String rutaImage, String ruta) {
		if (tipoEnemigo.equalsIgnoreCase("CALAMAR")) {  
            return new InvasorCalamar(velocidad, posX, posY, vida, ancho, alto, direccion, rutaImage, ruta);  
          }   
		else if(tipoEnemigo.equalsIgnoreCase("CANGREJO")){  
           return new InvasorCangrejo(velocidad, posX, posY, vida, ancho, alto, direccion, rutaImage, ruta);  
		}   
    	else if(tipoEnemigo.equalsIgnoreCase("PULPO")) {  
           return new InvasorPulpo(velocidad, posX, posY, vida, ancho, alto, direccion, rutaImage, ruta);  
    	}  
		return null;
	}
}
