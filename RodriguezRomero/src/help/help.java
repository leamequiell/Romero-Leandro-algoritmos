package help;

import java.util.Scanner;
import java.util.Arrays;

public class help {

	public static void main(String[] args) {

		Scanner datos = new Scanner(System.in);

		int[] legajo = new int[6]; // creamos un array llamado legajo de 6 espacios

		String[] apellidoalum = new String[6];// se crea un array de tipo string para almacenar el apellido

		int[] nota = new int[6];// creamos un array llamado nota para que se almacenen numeros enteros

		int notamax = 5, notamin = 11; //sirve para almacenar los maximos y minimos poniendo un numero mayor en el minimo y un numero manor en el maximo

		String apellidoMax = " ";
		String apellidoMin = "{";// el profe dijo que lo pongamos para que no nos salte error en nose dond eporque cris se olvido

		for (int i = 1; i <= 5; i++) {// eel for se inicia en 1 y finaliza cuando sea menor o igual a 5
			System.out.println("Ingrese el legajo del alumno num: " + i);// muestra en pantalla el legajo del alumno con su numero
			legajo[i] = datos.nextInt();// se almacena un numero  en el array legajo
		}

		System.out.println("\nLegajo ordenado:");//muestra en pantalla la frase del legajo ordenado
		Arrays.sort(legajo);// es para ordenar el array
		for (int num : legajo) {
			if (num != 0) {
				System.out.print(num + " ");// sirve para ir mostrando el array de forma prolija
			}
		}
		for (int i = 1; i <= 5; i++) {//
			System.out.println("\ningrese apellido del alumno num: " + i);
			apellidoalum[i] = datos.next();
		}

		int Notatotal = nota[0];
		for (int i = 1; i <= 5; i++) {

			System.out.println("ingrese la calificacion del examen de ingreso del alumno num: " + i);
			nota[i] = datos.nextInt();

			if (nota[i] < notamin) {
				notamin = nota[i];
				apellidoMin = apellidoalum[i];
			}

			if (nota[i] > notamax) {
				notamax = nota[i];
				apellidoMax = apellidoalum[i];
			}
			Notatotal += nota[i];
		}

		double promedio = (double) Notatotal / 5;

		for (int i = 1; i <= 5; i++) {
			System.out.println("\nEstudiante: " + apellidoalum[i] + " Legajo: " + legajo[i]
					+ " calificacion del examen de ingreso: " + nota[i]);
		}

		System.out.println("Calificacion maxima: " + notamax + " Del estudiante: " + apellidoMax);

		System.out.println("Calificacion minima: " + notamin + " Del estudiante: " + apellidoMin);

		System.out.println("Promedio de todos los examenes: " + promedio);

	}

}
