package ejer24;

import java.util.Scanner;

public class ejer24 {
	public static void main(String[] args) {

		Scanner datos = new Scanner(System.in);
		char decision = 'N';

		boolean dejar_salir = false;

		do {

			System.out.println("hijo: Puedo salir?");
			decision = datos.next().charAt(0);

			if (decision == 'S') {
				dejar_salir = true;
			System.out.println("father:si, Podes salir ");
			System.out.println("hijo: ah bueno.gracias");
			}
			else if( decision!='N' && decision !='S') {
				System.out.println("hijo:eh..?");
				decision = datos.next().charAt(0);
			}
			

		}while (decision == 'N'); 

	}
}