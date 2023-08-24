package praticaEv;

import java.util.Scanner;

public class praticaEv {

	public static void main(String[] args) {
		
		
		/*1) Armá el siguiente algoritmo:
			• Solicitá al usuario que ingrese una lista de números de DNI. El límite de la lista se lo solicitás al usuario.
			• Utiliza el algoritmo de ordenamiento burbuja (o el método sort) para ordenar la lista en orden ascendente. 
			• Mostrá la lista ordenada en la consola.
			• Generá ahora, otra lista en la cual se encuentre el apellido de cada persona. Cada posición (0, 1, 2, etc.) debe corresponderse con la lista de DNI. Ejemplo: Si González está en la posición 0 de su array, su DNI deberá estar en la posición 0 del array de los DNI.
			• Pedile a un usuario que busque un número de DNI. Si el número es hallado, mostrarlo en pantalla junto con el apellido de la persona correspondiente. Si no, indicar que el número de DNI no existe en este programa.

			2) Generá el algoritmo para las siguientes condiciones:
			Se tienen tres listas de cuatro propietarios con los siguientes datos:
			Se tiene una lista con los apellidos de los propietarios.
			Se debe tener además, una lista con su edad.
			Una última lista con su numero de DNI.
			Se poseen también cuatro listas para  tres automóviles automóviles, con los siguientes datos:
			Lista con la marca del vehículo: Chevrolet, Peugeot y Renault.
			Lista con el nombre del modelo: Corsa, 208 y Sandero.
			Lista con el año del vehículo: 2018, 2021, 2022.
			Lista con la patente de cada auto: AD178JK, AD200RS, AD202VW.
			El objetivo, es crear un algoritmo que muestre en pantalla únicamente a los modelos con año superior a 2020, y además donde el conductor tenga mas de 25 años.

			Ejemplo: "El auto BMW Z3 del año 2021, patente AD179JK, pertenece a Muñoz, que tiene 30 años, y su DNI es 54789534".
		*/
		Scanner datos = new Scanner(System.in);
		
		int listDNI;
		
		System.out.println("¿Cuantas listas de dni deseas?");
		listDNI = datos.nextInt();
		
		int[] listDNI1 = new int[listDNI-1];
		
		for (int k = 0; k <= listDNI; k++) {
			
			System.out.println("Ingrese el DNI en la posicion "+(k + 1)+" : ");
			listDNI1[k] = datos.nextInt();
		}
		
		for (int i = 0; i < (listDNI1.length - 1) /* i < 4 (5-1) */; i++) {
			 
			for (int j = 0; j < (listDNI1.length - i - 1) ; j++) {
			/* arreglo.length - i - 1:
			  	elimina pasadas innecesarias ya que el valor mas alto 
			  	siempre quedarÃ¡ en la Ãºltima posiciÃ³n desde el 
			  	inicio del ordenamiento. 
			*/
				
				if (listDNI1[j] > listDNI1[j + 1]) {
					// Intercambiar los elementos
					int temporal = listDNI1[j];
					/* temporal sirve para guardar por un momento
						al valor mas alto. 
					*/
					listDNI1[j] = listDNI1[j + 1];
					// La primera posiciÃ³n de las dos, toma el valor de la segunda (que es mas chico).
					listDNI1[j + 1] = temporal;
					// La segunda posiciÃ³n, toma el valor mas alto.
				}
			}
		System.out.println("\nArreglo ordenado:");
			for (int num : listDNI1) {
				System.out.print(num + " ");
			}
		}
		
		
	}
}
