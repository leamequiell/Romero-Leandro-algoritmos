package ejercicio57;

import java.util.Scanner;

public class ejercicio57 {

	static float num1flo;

	static float num3flo;

	public static float numfloat() {
		Scanner datos = new Scanner(System.in);
		System.out.println("ingrese un valor");
		num1flo = datos.nextFloat();
		
		int num2int = (int)num1flo;
		num3flo = ( num1flo-num2int);
		return num3flo;
	}

	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		numfloat();
		System.out.println("la parte decimal de numero float es:"+num3flo);
	}
}
/*
 * Escriba un programa en Java que devuelva la parte fraccionaria de cualquier
 * n�mero introducido por el usuario. Por ejemplo, si se introduce el n�mero
 * 256.879, deber�a desplegarse el n�mero 0.879. Para ello, pens� en lo
 * siguiente: almacen� un valor en una variable flotante. Ahora, ese mismo
 * valor, guardalo en otra variable entera. Finalmente, a la variable flotante
 * quitale el valor entero.
 */