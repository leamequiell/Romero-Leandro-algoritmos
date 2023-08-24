package ejercicio55;

import java.util.Scanner;

public class ejercicio55 {
	static float n1;
	public static float mult(float a) { // parámetros: a y b.
	    float cuadrado = a*a;
	    return cuadrado;
	}
	public static void ingresarNumeros() {
	    Scanner entrada = new Scanner(System.in);
	    System.out.println("Ingrese un numero: ");
	    n1 = entrada.nextFloat();
	   
	}
			

	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
		ingresarNumeros();
	    mult(n1); 
	    System.out.println("El resultado de la mult es: " + mult(n1));
	    
	}
}
