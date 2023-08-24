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
 * número introducido por el usuario. Por ejemplo, si se introduce el número
 * 256.879, debería desplegarse el número 0.879. Para ello, pensá en lo
 * siguiente: almacená un valor en una variable flotante. Ahora, ese mismo
 * valor, guardalo en otra variable entera. Finalmente, a la variable flotante
 * quitale el valor entero.
 */