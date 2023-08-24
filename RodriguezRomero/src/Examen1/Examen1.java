 package Examen1;

import java.util.Arrays;
import java.util.Scanner;

public class Examen1 {
  	public static void main(String[] args) {
  		Scanner datos = new Scanner(System.in);
  		
  		/*Consigna
  		Se le da un programa a un empleado administrativo para que ingrese �, los datos de 5 estudiantes.

  		Para lo solicitado anteriormente, arm� el algoritmo con estas caracter�sticas:

  		Se le solicita que ingrese el n�mero de legajo de cada estudiante, que es un n�mero de cinco cifras (ejemplo: 45876).
  		Ordenar de manera ascendente los n�meros de legajo.
  		Luego, debe ingresar 5 apellidos de estudiantes que ingresan a la universidad.
  		Tambi�n debe ingresar la calificaci�n con la cual aprob� cada uno su examen de ingreso (de 6 a 10).
  		Determinar la nota m�xima y la nota m�nima.
  		En el algoritmo, se debe calcular el promedio de los ex�menes de los 5 estudiantes.
  		Mostrar en pantalla el apellido de cada estudiante, su n�mero de legajo, y su calificaci�n del examen de ingreso.
  		Mostrar tambi�n en pantalla la calificaci�n m�xima, la m�nima, y a qui�n pertenece cada una.
  		Mostrar en pantalla finalmente el promedio de los ex�menes.*/
  
  		
  		
  	  int [] legajo = new int [6];
  			  
  		String[] apellidoalum = new String[6];
  		
  		int[] nota = new int[6];
  		
  		int notamax = 5, notamin = 11;
  		
  		String apellidoMax = " "; 
  		String apellidoMin = " ";  
  		
  		for(int i=1;  i <= 5; i++) {
  	  		System.out.println("Ingrese el legajo del alumno num: "+i);
  	  		legajo[i] = datos.nextInt();
  	  		}
  		
  		System.out.println("\nLegajo ordenado:");
		Arrays.sort(legajo);
		for (int num : legajo ) {
			if (num !=0) {
				System.out.print(num + " ");
			}
		}
		for(int i= 1; i<=5; i++) {
			 System.out.println("\ningrese apellido del alumno num: "+i); 
			  apellidoalum[i] = datos.next();
			  }
		
		
		int Notatotal = nota[0];
		for (int i = 1; i <= 5; i++) {
			
			System.out.println("ingrese la calificacion del examen de ingreso del alumno num: "+i); 
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
		
		double promedio = (double) Notatotal /5; 
		
		for(int i=1; i<=5; i++) {
		System.out.println("\nEstudiante: "+apellidoalum[i] +" Legajo: "+legajo[i] +" calificacion del examen de ingreso: "+nota[i]); 
		}
		
		System.out.println("Calificacion maxima: "+notamax +" Del estudiante: " +apellidoMax);
		
		
		System.out.println("Calificacion minima: "+ notamin+ " Del estudiante: "+apellidoMin);
		
		System.out.println("Promedio de todos los examenes: "+promedio);
				
  	}		
  }

