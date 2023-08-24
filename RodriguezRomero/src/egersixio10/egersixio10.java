package egersixio10;

import java.util.Scanner;


public class egersixio10 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero_elegido;
		String Nombre, Apellido;
		
		System.out.println("ingresa su nombre: ");
		Nombre = entrada.next();
		System.out.println("ingresa su apellido: ");
		Apellido = entrada.next();
		System.out.println("ingresa un numero: ");
		numero_elegido = entrada.nextInt();
		
		double numero = (Math.random()*99);
		
	
		
		int resultado = (int) numero;
		
		System.out.println("Nombre y apellido: "+Apellido +", " +Nombre);
		
		
		 if (numero_elegido == resultado ) {
				System.out.println("ganaste !!! :) ");			
			  }
		 else {
			 System.out.println("suerte la proxima, pedazo de mandioca ");
		 }
	}
	}
