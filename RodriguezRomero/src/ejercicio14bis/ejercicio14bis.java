package ejercicio14bis;

import java.util.Scanner;

public class ejercicio14bis {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	int numero;
	
	System.out.println("ingrese un numero: ");
	numero = entrada.nextInt();
	
	if (numero != 0) {
		System.out.println("este numero si puede dividir ");			
	  }
	else {
		System.out.println("este numero no puede dividir.");
	}
}
}