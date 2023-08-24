package ejercicio43;

import java.util.Scanner;

public class ejercicio43 {
	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		
		int[] numero = new int[11];
		
		int aleatorio = (int)(Math.random()*4);
		
			for (int i = 0; i<3; i++) {
					
				System.out.println("Ingresa un numero: ");
				numero[i] = datos.nextInt();
				
				
			}
			
			if(numero[0]==aleatorio) {
				System.out.println("el numero "+numero[0]+" es el ganador");
			}
			else if(numero[1]==aleatorio) {
				System.out.println("el numero "+numero[1]+" es el ganador");
			}
			else if(numero[2]==aleatorio) {
				System.out.println("el numero "+numero[2]+" es el ganador");
			}
	
	}
}
