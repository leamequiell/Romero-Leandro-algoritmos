package ejercicio45;

import java.util.Scanner;

public class ejercicio45 {
	public static void main(String[] args) {
	
		Scanner datos = new Scanner(System.in);
		
		int[] numSoci = {1011, 2367, 8748, 9121, 817, 6423, 2034} ;
		String[] nomSoci = { "Enrique", "Liliana", "Lucas", "Juan", "Fiorella", "Ariel", "Daiana"};
		int numSocio;
		
		System.out.println("ingrese un numero de socio:");
		numSocio = datos.nextInt();
		
		for (int i = 0; i <= 6; i++) {
		
			if(	numSocio == numSoci[i]) {
				
				System.out.println("El numero ingresado coincide con el socio: "+ nomSoci[i]);
			
				
				System.out.println("\n \tinformacion socio \n nombre: "+nomSoci[i]+"\n N de socio: "+numSoci[i]);
			
				break;
			}	
			
		}
		
	}
}
