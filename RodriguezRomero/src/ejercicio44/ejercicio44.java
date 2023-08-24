package ejercicio44;

import java.util.Scanner;

public class ejercicio44 {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		int[] DNI = new int[5];
		for (int i = 1; i <= 4; i++) {

			System.out.println("ingrese el dni n°"+i+" : ");
			DNI[i] = datos.nextInt();


		}

		for (int j = 1; j <= 4; j++) {

			if(DNI[j]%2 == 0) {
				
				System.out.println("el dni n°"+j+" es "+DNI[j]);
				
			}
			
			else {
			
				continue;
			
			}

		}

	}
}