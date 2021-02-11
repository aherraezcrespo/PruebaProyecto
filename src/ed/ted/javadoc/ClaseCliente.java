package ed.ted.javadoc;

/**
 * Esta clase hace algo pero aun no sabes que Utiliza la {@link ClaseEjemplo}
 * para saludar
 * 
 * @author Alejandro
 * @see ClaseEjemplo
 * 
 */

public class ClaseCliente {

	public void usarClaseEjemplo() {
		ClaseEjemplo ce = new ClaseEjemplo();
		ce.saludar();
		ce.saludo("Ale");
		ce.metodo(2, 3);

	}

}
