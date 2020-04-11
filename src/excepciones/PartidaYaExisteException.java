package excepciones;

public class PartidaYaExisteException extends Exception {
	private static final long serialVersionUID = 1L;

	public PartidaYaExisteException(String nombrePartida) {
		super("La partida con el nombre: " + nombrePartida + " ya existe");

	}

}
