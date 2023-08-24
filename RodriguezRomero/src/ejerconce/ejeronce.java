package ejerconce;

import java.util.Scanner;

public class ejeronce {
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
			int numero_elegido;
		
		System.out.println("ingresa un numero: ");
		numero_elegido = entrada.nextInt();
		
		if (numero_elegido == 0) {
			System.out.println("el numero es igual a cero :o ");			
		  }
		else if  (numero_elegido >= 1) 
		{
			System.out.println("el numero es positivo :) ");
	 	}
		else if  (numero_elegido <= -1) 
		{
			System.out.println("el numero es negativo :) ");
		}
		
}
}
