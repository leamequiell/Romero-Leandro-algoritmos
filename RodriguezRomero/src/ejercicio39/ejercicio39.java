package ejercicio39;

import java.util.Scanner;

public class ejercicio39 {

	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		
		String[] nombre = new String[11];
		int[] edad = new int[11];
		
		for (int i = 0; i<11; i++) {
				
			System.out.println("Ingresa un nombre: ");
			nombre[i] = datos.next();
			
			
			System.out.println("Ingresa la edad correspondiente: ");
			edad[i] = datos.nextInt();
			System.out.println("el "+i+" es: "+nombre[i]);
			System.out.println("el "+i+" es: "+edad[i]);
			
			}
	
		
	}
}
