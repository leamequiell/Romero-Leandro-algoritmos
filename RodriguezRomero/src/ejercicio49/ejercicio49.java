package ejercicio49;

import java.util.Scanner;
import java.util.Arrays;

public class ejercicio49 {
	public static void main(String[] args) {

		Scanner datos = new Scanner(System.in);

		int DNI1;

		System.out.println("ingrese la cantidad de DNI: ");
		DNI1 = datos.nextInt();

		int[] DNI = new int[DNI1];

		for (int i = 0; i < DNI.length; i++) {

			System.out.println("Ingrese el DNI num: " + (i + 1));
			DNI[i] = datos.nextInt();

		}
		for (int i = 0; i <= (DNI.length - 1); i++) {

			for (int j = 0; j < (DNI.length - i - 1); j++) {

				if (DNI[j] > DNI[j + 1]) {

					int temporal = DNI[j];

					DNI[j] = DNI[j + 1];

					DNI[j + 1] = temporal;

				}
			}
		}
		System.out.println("Array desordenado: ");
		for (int num : DNI) {
			System.out.print(num + " ");
		}
		for (int i = 0; i <= (DNI.length - 1); i++) {

			for (int j = 0; j < (DNI.length - i - 1); j++) {

				if (DNI[j] < DNI[j + 1]) {

					int temporal = DNI[j];

					DNI[j] = DNI[j + 1];

					DNI[j + 1] = temporal;

				}
			}
		}

	}
}
