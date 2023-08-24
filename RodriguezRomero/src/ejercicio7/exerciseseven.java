package ejercicio7;

import java.util.Scanner;
public class exerciseseven {

	public static void main(String[] args) {
    	Scanner entrada = new Scanner (System.in);

    	
		System.out.println("\t Que calificacion tendras en el ano en la asignatura Laboratorio de algoritmos y estructura de datos?");
	
	double aleatorio = (Math.random()*11);
	int aleatoriofinal = (int)aleatorio;
	
	System.out.println("tu calificaion final sera: "+aleatoriofinal);
	}
	
}
