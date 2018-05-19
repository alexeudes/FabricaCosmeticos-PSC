package negocio;

public class Fachada {

	private static Fachada instancia;
	
	private Fachada() {
		super();
	}
	
	public static Fachada getInstancia() {
        if (instancia == null) {
            instancia = new Fachada();
        }
        return instancia;
	}
	
}
