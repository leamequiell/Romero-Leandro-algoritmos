package ejercicio35;

import java.util.Scanner;

public class ejercicio35 {

	public static void main(String[] args) {
	
		Scanner VCV = new Scanner(System.in);
		
		float cal, calmax = 0, calmin = 11 ;
		float promedio=0;
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Ingrese la nota del alumno: "+i);
			
			cal = VCV.nextInt();
			
			if (cal < calmin) {

				calmin = cal;
			}
			
			if (cal > calmax) {
				calmax = cal;
			}
			
			promedio += cal;
			
		}
		System.out.println("la nota minima es: " + calmin);
		System.out.println("la nota maxima es: " + calmax);
		
		promedio = promedio/5;
		
		System.out.println("el promedio de notas es "+ promedio );
	}
}
