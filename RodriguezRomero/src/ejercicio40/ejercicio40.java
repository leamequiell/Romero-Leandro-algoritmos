package ejercicio40;

import java.util.Scanner;

public class ejercicio40 {
	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		
		int[] temperatura = new int[4];
		int promedio=0;
		
		
			for (int i = 0; i<4; i++) {
					
				System.out.println("Ingresa la "+(i+1)+" temperatura:");
				temperatura[i] = datos.nextInt();
			
				promedio += temperatura[i];
				
			}
			
			promedio= promedio/5;
	
			System.out.println("el promedio de las temperaturas es: "+promedio);
		
	}
}
