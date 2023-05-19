package arrayCubo;

public class ArrayCubo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cubo[][] = new int[10][10];
		int i = 0;
		int j = 0;
		int a = 0;

		for (i = 0; i < 10; i++) {
			for (j = 0; j < 10; j++) {
				cubo[i][j] = a;
				a++;
				if (cubo[i][j] < 10)
					System.out.print(" " + cubo[i][j] + "  ");
				else
					System.out.print(cubo[i][j] + "  ");
				if (j == 9)
					System.out.println();
			}
		}

	}

}
