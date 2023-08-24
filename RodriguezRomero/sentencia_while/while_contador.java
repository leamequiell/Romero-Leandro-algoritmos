package sentencia_while; 

import java.util.Scanner;

public class while_contador {
	public static void main(String args[]) throws InterruptedException {
		//throws InterruptedException sirve para luego utilizar Thread.sleep()
		Scanner datos = new Scanner(System.in);
		int num_jugadores = 1;
		
		while (num_jugadores <= 11) {
			System.out.println("Jugador n°: "+num_jugadores);
			Thread.sleep(500);
			/* Thread.sleep(milisegundos) sirve para esperar un determinado
			tiempo en milisegundos, en esa línea donde fue aplicado.*/
			num_jugadores++; /* esta linea sirve para aumentar de a uno la cantidad
			de jugadores. Cada vez que se ejecuta la línea 15, aumenta en uno 
			dicha cantidad. Al llegar al máximo establecido en la condición
			del while (en este caso es el número 11), finaliza el bucle.
			*/
		}

		System.out.println("Lista completa.");

	}
}
