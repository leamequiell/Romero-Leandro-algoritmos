package ejercito25;

import java.util.Scanner;

public class ejercito25 {
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int numero_elegido;
		int intentos = 0;
		boolean fallo_total = false;
		
		double numero = (Math.random()*99);
		int resultado = (int) numero;
		
	
		do{
			intentos++;
			System.out.println("ingresa un numero: ");
			numero_elegido = entrada.nextInt();
			
		
			if(intentos == 5) {
				fallo_total = true;
			}
			else if(numero_elegido > resultado) {
				System.out.println("el numero es menor que "+numero_elegido+" suerte la proxima, pedazo de mandioca ");	
			}
			
			else if(numero_elegido < resultado ) {
				System.out.println("el numero es mayor que "+numero_elegido+" suerte la proxima, pedazo de mandioca ");
			}
			
			else if(numero_elegido > 99 || numero_elegido < 0) {
				System.out.println("el numero:"+numero_elegido+"esta fuera del rango permitido suerte la proxima, pedazo de mandioca ");
			}
			
		}while(fallo_total == true );
		
		
		System.out.println("ganaste !!! :) lo conseguiste en "+intentos+" intentos");	
		
	

}
}
