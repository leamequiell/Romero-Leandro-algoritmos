package ejercicioeight;

import java.util.Scanner;

public class ejercicio88 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		float numero;

		System.out.println("ingresa un numero: ");
		numero = entrada.nextFloat();

		int cuadrad = (int) Math.sqrt(numero);

		double resultado = (Math.random()) + cuadrad;
		double resultado2 = resultado * 7;
		double resultado3 = (double) Math.sqrt(resultado2);

		System.out.println(resultado3);

	}
}
