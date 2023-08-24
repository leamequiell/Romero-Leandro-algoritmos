package ejercicio43v2;

import java.util.Scanner;

public class ejercicio43v2 {

	public static void main(String[] args) {

		Scanner datos = new Scanner(System.in);

		int[] num = new int[6];

		for (int i = 1; i <= 5; i++) {

			System.out.println("ingrese el numero " + i + " : ");
			num[i] = datos.nextInt();

		}

		for (int j = 1; j <= 5; j++) {

			if (num[j] < 0) {
				continue;
			}

			else {
				System.out.println("numero " + j + " : " + num[j]);
			}

		}

	}

}
