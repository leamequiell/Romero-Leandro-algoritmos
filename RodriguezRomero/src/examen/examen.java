package examen;

import java.util.Scanner;

public class examen {
	public static void main(String[] args) {
		/*
		 * Consigna: Indicale a un empleador de un local, que indique cuántos sanguches
		 * de milanesa se producen cada 2hs. El local abre a las 8hs, y cierra a las
		 * 14hs.
		 * 
		 * Luego, realizá lo siguiente: Determiná la cantidad máxima y la cantidad
		 * mínima. Mostralas en pantalla. Ordená numéricamente de manera ascendente las
		 * cantidades. Luego, mostrá el array ordenado en pantalla. Descartar todas las
		 * cantidades mayores a 20, y mostrar en pantalla únicamente las cantidades
		 * menores a 20. Al final del programa, indicar el promedio de cantidades en el
		 * día. Luego de terminar el algoritmo, entregar por classroom como
		 * "Apellido.zip", en en cual se debe incluir el paquete (package) y la clase
		 * (class). Se considerará para la evaluación: Que el algoritmo cumpla con los
		 * puntos anteriormente mencionados. Cada frase mostrada en pantalla, debe estar
		 * expresada de manera prolija. La correcta indentación del código (o sea, que
		 * el código esté ordenado). No es necesario comentar la sintaxis del programa.
		 */
		Scanner datos = new Scanner(System.in);

		int cant_sang = 0, cant_sangmax = 0, cant_sangmin = 1443, promedio = 0;
		int horamin = 0, horamax = 0;
		int[] arreglo = new int[8];

		for (int i = 0; i <= 7; i += 2) {
			/*
			 * if(i == 0) {
			 * System.out.println("cantidad de sanguches producida en la hora: 8");
			 * cant_sang = datos.nextInt(); } else if(i == 1) {
			 * System.out.println("cantidad de sanguches producida en la hora: 10");
			 * cant_sang = datos.nextInt(); } else if(i == 2) {
			 * System.out.println("cantidad de sanguches producida en la hora: 12");
			 * cant_sang = datos.nextInt(); } else if(i == 3) {
			 * System.out.println("cantidad de sanguches producida en la hora: 14");
			 * cant_sang = datos.nextInt(); }
			 */
			System.out.println("cantidad de sanguches producida en la hora:" + (i + 8));
			cant_sang = datos.nextInt();

			if (cant_sang < cant_sangmin) {
				cant_sangmin = cant_sang;
				horamin = i;
			}

			if (cant_sang > cant_sangmax) {
				cant_sangmax = cant_sang;
				horamax = i;
			}
			arreglo[i] = cant_sang;
			promedio = promedio + cant_sang;
			
		}

		System.out
				.println("la cantidad de sanguches producidos minima fue: " + cant_sangmin + " a las " + (horamin + 8));
		System.out
				.println("la cantidad de sanguches producidos maxima fue: " + cant_sangmax + " a las " + (horamax + 8));
		for (int i = 0; i < (arreglo.length - 1) /* i < 4 (5-1) */; i++) {

			for (int j = 0; j < (arreglo.length - i - 1); j++) {

				if (arreglo[j] > arreglo[j + 1]) {

					int temporal = arreglo[j];

					arreglo[j] = arreglo[j + 1];
					// La primera posiciÃ³n de las dos, toma el valor de la segunda (que es mas
					// chico).
					arreglo[j + 1] = temporal;
					// La segunda posiciÃ³n, toma el valor mas alto.
				}
			}
		}
		System.out.println("\nArreglo ordenado:");
		for (int num : arreglo ) {
			if (num !=0) {
				System.out.print(num + " ");
			}
		}
		System.out.println("\ncantidades menores a 20:");
		for (int num : arreglo) {
			if (num <= 20 && num !=0) {
				System.out.print(num + " ");
			}
		}
		System.out.println("\nel promedio es :" + (promedio / 4));//el promedio da mal por que hay 0's que no pude sacar por como estan hechos los arrays

		/*
		 * if (i==0) {
		 * System.out.println("cantidad de sanguches producida en la hora: "+(i+8));
		 * cant_sang = datos.nextInt(); }
		 */
		/*
		 * else if(i > 0) {
		 * System.out.println("cantidad de sanguches producida en la hora: "+(8+2));
		 * cant_sang = datos.nextInt();
		 * 
		 * }
		 */
		/*
		 * if (i==0) {
		 * System.out.println("cantidad de sanguches producida en la hora: "+(i+8));
		 * cant_sang = datos.nextInt(); }
		 */
	}
}
