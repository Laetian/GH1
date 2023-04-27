package metodosString;

public class metodoCompareTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String hola = "hola";
		String hola1 = "Hola";
		
		System.out.println(hola.compareTo(hola)); //Dará 0 pues dan lo mismo
		System.out.println(hola.compareTo(hola1));//Da un valor positivo, al ser la mayuscula mayor que la minuscula.
		System.out.println(hola1.compareTo(hola));//Valor negativo al ser la mayúscula mayor que la minúscula.
	}

}
