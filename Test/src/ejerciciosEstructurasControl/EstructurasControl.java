/**
 * 
 */
package ejerciciosEstructurasControl;

import java.util.Scanner;

/**
 * @author Alumno
 *
 */

public class EstructurasControl {

	/**
	 * @param args
	 */

	public static void main(String[] args) {

		ifSimple();

		ifDouble();

		ifAnidado();

		switchCase();

		bucleWhile();

	}

	// El uso de static es para poder utilizar las funciones/parametros sin la
	// necesidad de llamar a un objeto.
	static int nota = 7;

	// Método de uso del if...
	// El if evalua una condición boleana, si la cumple ejecuta la acción del
	// interior del parentesis
	// en caso contrario no ejecuta nada y continua bajando por el código
	static void ifSimple() {
		if (nota >= 5) {
			System.out.println("Aprobado!(ifSimple)");
		}
		System.out.println("\n");
	}

	// En el método anterior si no entraba en la condición se salía de la función,
	// si añadimos un else recogemos cuando no entra en la condición y ejecutamos el
	// else
	static void ifDouble() {
		if (nota >= 5) {
			System.out.println("Aprobado!(ifDouble)");
		} else {
			System.out.println("Suspenso!(ifDouble)");
		}
		System.out.println("\n");
	}

	// Podemos ejecutar varios if, poniendo if else, recogiendo entonces
	// multiples posibilidades y realizando opciones diferentes para cada uno.
	static void ifAnidado() {
		if (nota == 5) {
			System.out.println("Suficiente!(ifAnidado)");
		} else if (nota == 6) {
			System.out.println("Bien!(ifAnidado)");
		} else if (nota == 7 || nota == 8) {
			System.out.println("Notable(ifAnidado)");
		} else if (nota == 9) {
			System.out.println("Sobresaliente(ifAnidado)");
		} else if (nota == 10) {
			System.out.println("Matrícula!(ifAnidado)(ifAnidado)");
		} else {
			System.out.println("Suspenso!(ifAnidado)");
		}
		System.out.println("\n");
	}

	// Switch
	// El operador de control switch utiliza el valor que le damos para compararlo
	// con los valores
	// que hayamos creado. una vez el valor de entrada coincide con el valor de
	// alguno de los casos
	// pasaría por default en caso de existir o saldría del bucle. Es importante
	// utilizar el break
	// para salir del bucle una vez se cumple la condición, sino continuara
	// ejecutando el resto de casos
	static void switchCase() {
		switch (nota) {
		case (1):
		case (2):
		case (3):
		case (4):
			System.out.println("Suspenso!(switch)");
			break;
		case (5):
			System.out.println("Suficiente!(switch)");
			break;
		case (6):
			System.out.println("Bien!(switch)");
			break;
		case (7):
		case (8):
			System.out.println("Notable!(switch)");
			break;
		case (9):
			System.out.println("Sobresaliente!(switch)");
			break;
		case (10):
			System.out.println("Matrícula!(switch)");
			break;
		default:
			System.out.println("Valor no contemplado!(switch)");
		}
		System.out.println("\n");
	}

	static void bucleWhile() {
		int i = 0;
		System.out.println("Iteración bucle while:");
		while (i < 5) {
			System.out.println("i=" + i);
			i++;
		}
		System.out.println("Final bucle while. \n");
	}
	
	public void centinela()	{
		final int centinela = -1;
		Scanner sc = new Scanner(System.in);
		int nota =0;
		int suma=0;
		
		System.out.println("Introduzca la primera nota: ");
		nota = sc.nextInt();
				
				while (nota!=centinela) {
					suma += nota;
					System.out.println("Introduzca la siguiente nota: ");
					nota = sc.nextInt();
				}
		System.out.println("La suma de las notas es: "+suma);
	}
}
