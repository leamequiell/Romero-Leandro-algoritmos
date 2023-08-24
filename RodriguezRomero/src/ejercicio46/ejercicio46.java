package ejercicio46;

import java.util.Scanner;

public class ejercicio46 {
	public static void main(String[] args) {
			
Scanner datos = new Scanner(System.in);
		
		int[] numSoci = {1011, 2367, 8748, 9121, 817, 6423, 2034} ;
		String[] nomSoci = { "Enrique", "Liliana", "Lucas", "Juan", "Fiorella", "Ariel", "Daiana"};
		int numSocio;
		
		System.out.println("ingrese un numero de socio:");
		numSocio = datos.nextInt();
		
		for (int i = 0; i <= 6; i++) {
		
			if(	numSocio == numSoci[i]) {
				
					if(numSoci[i]%2 == 0) {
						
						System.out.println("el numero coincide con el socio n°"+(i+1)+", pertenece  a "+numSoci[i]+"y es par");
						
					}
					
					else {
					System.out.println("el numero de socio es impar");
						continue;
					
					}
			System.out.println("El numero ingresado coincide con el socio: "+ nomSoci[i]);
					
					
			System.out.println("\n\tinformacion socio \nnombre: "+nomSoci[i]+"\nN de socio: "+numSoci[i]);
				
			break;
			}
		}
	}
}
