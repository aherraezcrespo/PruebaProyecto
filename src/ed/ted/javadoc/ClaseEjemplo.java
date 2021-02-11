package ed.ted.javadoc;

/**
 * Esta es una clase de practica para demostrar como funciona JavaDoc	
 * @author Alejandro
 * @version 1.0
 * @since 16/01/21
 */
public class ClaseEjemplo {
	/**
	 * @deprecated  -- NUNCA NUNCA BORREIS O CAMBIEIS UNA CLASE O METODO -- 
	 */
	public void saludar() {
		System.out.println("Hola!");
	}
	
	/**
	 * Muestra un saludo en la consola de comandos
	 * 
	 * @param x es el nombre que se va a mostrar en el saludo
	 */
	public void saludo(String x) {
		System.out.println("Hola " + x);
	}
	/**
	 * Este metodo no hace nada
	 * @return Devuelve un cero
	 * @param x no se usa
	 * @param y tampoco se usa
	 */
	public int metodo(int x, int y) {
		return 0;
	}
	
	

}
