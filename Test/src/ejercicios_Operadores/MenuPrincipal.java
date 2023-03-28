/**
 * 
 */
package ejercicios_Operadores;

import java.util.Scanner;

/**
 * @author Alumno
 *
 */
public class MenuPrincipal {

	/**
	 * 
	 */
	public MenuPrincipal() {
		super();
	}

	private Scanner sc = new Scanner(System.in);
	private int opcion;
	private double ent1, ent2;

	public void mPrincipal() {
		System.out.println(
				"Introduzca 1 para calcular el area /n de un cuadrado o 2 para calcular el area de un /n rectangulo");
		opcion = sc.nextInt();

		switch (opcion) {

		case 1:
			System.out.println("Introduzca el valor del lado: ");
			ent1 = sc.nextDouble();
			AreaCuadrado areaCuadrado = new AreaCuadrado();
			areaCuadrado.areaCuadrado(ent1);
			break;
		case 2:
			System.out.println("Introduzca el valor de la base: ");
			ent1 = sc.nextDouble();
			System.out.println("Introduzca el valor de la altura");
			ent2 = sc.nextDouble();
			AreaRectangulo areaRectangulo = new AreaRectangulo();
			areaRectangulo.areaRectangulo(ent1, ent2);
			break;
		}
	}

}
