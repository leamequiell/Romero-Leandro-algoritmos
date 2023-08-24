package ejercicio5;

import java.util.Scanner;

public class ejercicio5 {
	public static void main(String[] args) {
		
		float numero;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("ingresar un numero: ");
		
		numero = entrada.nextFloat();
		
		float raiz_cuadrada = (float) Math.sqrt(numero);
		int raiz_cuadrada2 = (int) Math.sqrt(numero);
		
		System.out.println("El valor de la en raiz en numeros flotantes es: "+raiz_cuadrada);
		System.out.println("El valor de la en raiz en numeros enteros es: "+raiz_cuadrada2);
	}
}
