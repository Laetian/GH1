package metodosString;

public class metodoEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String hola = "hola";
		String hola1 = "Hola";
		String hola2 = new String("hola");

		System.out.println(hola.equals(hola1));// Devolverá false , uno masyucula otro no
		System.out.println(hola.equals(hola2));// Devolvera true, al tener el mismo contenido
		System.out.println(hola == hola1);// Devolvera false diferente referencia, por la mayuscula en este caso
		System.out.println(hola == hola2);// Devolvera false diferente referencia
		System.out.println(hola.equalsIgnoreCase(hola1)); // Devolvera true, pues ignora als mayusculas

		// Siempre usar equals apra comparar Strings.

	}

}
