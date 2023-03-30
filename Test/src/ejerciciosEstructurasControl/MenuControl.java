package ejerciciosEstructurasControl;

import java.util.Scanner;

public class MenuControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		menuControl();
	}

	static void menuControl() {
		EstructurasControl estructurasControl = new EstructurasControl();
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		System.out.println(
				"Introduzca: \n 1 para if simple \n 2 para ifDouble \n 3 para ifAnidado \n 4 para switchcase \n"
				+ " 5 para bucleWhile \n 6 para centinela \n 7 para bucleFor \n 8 para bucleDoWhile \n 9 para forAnidado");
		if (sc.hasNextInt()) {
			if(sc.hasNextInt())
			{
				opcion = sc.nextInt();
			}
			else {
				System.out.println("Input no valido, debe introducir un número válido");
			}
		} else {
			System.out.println("Input no valido \n");
			sc.nextLine();
			menuControl();

		}

		switch (opcion) {
		case 1:
			estructurasControl.ifSimple();
			break;
		case 2:
			estructurasControl.ifDouble();
			break;
		case 3:
			estructurasControl.ifAnidado();
			break;
		case 4:
			estructurasControl.switchCase();
			break;
		case 5:
			estructurasControl.bucleWhile();
			break;
		case 6:
			estructurasControl.centinela();
			break;
		case 7:
			estructurasControl.bucleFor();
			break;
		case 8:
			estructurasControl.bucleDoWhile();
			break;
		case 9:
			estructurasControl.forAnidado();
			break;
		}
	}

}
