package metodosString;

public class MetodoSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String hola = "hola";
		String hola1 = "Hola";

		System.out.println(hola.substring(2)); // Con un solo para metro imprime desde donde le indicamos hasta el final
		System.out.println(hola.substring(2, 3));// Con dos parametros imprime desde donde le indicamos en el 1 hasta
													// donde el indicamos en el 2
		System.out.println(hola.substring(1, 4));// Tener en cuenta que para que empiece desde el principio es 0, no 1,
													// no incluye la letra indicada en el primer parametro

	}

}
