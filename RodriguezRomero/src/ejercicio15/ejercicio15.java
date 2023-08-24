package ejercicio15;

import java.util.Scanner;

public class ejercicio15 {
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double numero, numero2;
		
		
		System.out.println("\t Cajero Automatico");
		System.out.println("ingrese el costo total a retirar: ");
		numero = entrada.nextDouble();
		
		if (numero> 15000) {
			
			numero2 = numero;
			
			numero2 = numero2 * 0.10;
			
			numero = numero - numero2;
			
			System.out.println("Cantidad mayor a 15000, se aplica un descuento del 10%");
			System.out.println("el costo total es: "+ numero);			
		  }
		else {
			System.out.println("el costo total es: "+ numero);
		}

		
		
		
		
		
		
}

}