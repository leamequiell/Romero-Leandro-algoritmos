package ejercicio56;

import java.util.Scanner;

public class ejercicio56 {

	static String apell;
	static String nomb;
	static float clases;
	static float asistencias;
	static float porcentaje;

	public static void infoalumnos() {
		Scanner entrada = new Scanner(System.in);

		System.out.println("ingrese el apellido del estudiante: ");
		apell = entrada.next();

		System.out.println("ingrese el nombre del estudiante: ");
		nomb = entrada.next();
	}

	public static float porcentajeAsistencias() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de asistencias: ");
		asistencias = entrada.nextFloat();

		System.out.println("Ingrese la cantidad de clases totales: ");
		clases = entrada.nextFloat();

		porcentaje = (asistencias / clases)*100;
        return porcentaje;
	}

	public static void main(String[] args) {
		infoalumnos();
		porcentajeAsistencias();
		System.out.println("the percent of the total assistence is: "+porcentaje +"%");
	}
	
	
	
}
/*
 * Vas a hacer un programa ordenado, con funciones, para calcular el porcentaje
 * de asistencias de un estudiante. Primero que nada, solicitá el nombre y
 * apellido del alumno. Luego, los pasos que te voy a indicar, hacelos dentro de
 * una función porcentajeAsistencias ():
 * 
 * • Pedir la cantidad de asistencias del alumno. 
 * • También solicitar la
 * cantidad de clases totales. 
 * • Dividir la cantidad de asistencias sobre las
 * clases totales. 
 * • Retornar en la función porcentajeAsistencias () el
 * porcentaje de asistencias. 
 * • Ahora, mostrá en pantalla el porcentaje de
 * asistencias.
 */