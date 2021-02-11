package ed.ted.javadoc;

public class TestJavaDoc {

	public static void main(String[] args) {
		ClaseEjemplo ce = new ClaseEjemplo();
		ce.saludar();
		ce.saludo("Ale");
		ce.metodo(2,3);
		
		System.out.println(ce.metodo(1,2));

	}

}
