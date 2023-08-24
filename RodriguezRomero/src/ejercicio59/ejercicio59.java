package ejercicio59;

import java.util.Scanner;

public class ejercicio59 {
	/*
	 * Armar una función que, por usuario o por programa, determine el máximo y
	 * mínimo de tres números ingresados. Se debe mostrar por pantalla el valor
	 * máximo, y el valor mínimo de estos tres valores.
	 */
	static int num;
	static int numMax = -99999;
	static int numMin = 99999;

	public static void num1() {
	Scanner entrada = new Scanner(System.in);

	for (int i = 1; i <= 3; i++) {

	System.out.println("ingresa el n "+(i)+" :");
	num = entrada.nextInt();

	if (num > numMax) {
	numMax = num;
	}

	if (num < numMin) {

	numMin = num;
	}
	}

	System.out.println("El numero minimo es: " + numMin);
	System.out.println("El numero maximo es: " + numMax);

	}

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	num1();

	}


}
