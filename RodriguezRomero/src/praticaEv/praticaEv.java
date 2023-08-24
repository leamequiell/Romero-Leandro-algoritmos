package praticaEv;

import java.util.Scanner;

public class praticaEv {

	public static void main(String[] args) {
		
		
		/*1) Arm� el siguiente algoritmo:
			� Solicit� al usuario que ingrese una lista de n�meros de DNI. El l�mite de la lista se lo solicit�s al usuario.
			� Utiliza el algoritmo de ordenamiento burbuja (o el m�todo sort) para ordenar la lista en orden ascendente. 
			� Mostr� la lista ordenada en la consola.
			� Gener� ahora, otra lista en la cual se encuentre el apellido de cada persona. Cada posici�n (0, 1, 2, etc.) debe corresponderse con la lista de DNI. Ejemplo: Si Gonz�lez est� en la posici�n 0 de su array, su DNI deber� estar en la posici�n 0 del array de los DNI.
			� Pedile a un usuario que busque un n�mero de DNI. Si el n�mero es hallado, mostrarlo en pantalla junto con el apellido de la persona correspondiente. Si no, indicar que el n�mero de DNI no existe en este programa.

			2) Gener� el algoritmo para las siguientes condiciones:
			Se tienen tres listas de cuatro propietarios con los siguientes datos:
			Se tiene una lista con los apellidos de los propietarios.
			Se debe tener adem�s, una lista con su edad.
			Una �ltima lista con su numero de DNI.
			Se poseen tambi�n cuatro listas para  tres autom�viles autom�viles, con los siguientes datos:
			Lista con la marca del veh�culo: Chevrolet, Peugeot y Renault.
			Lista con el nombre del modelo: Corsa, 208 y Sandero.
			Lista con el a�o del veh�culo: 2018, 2021, 2022.
			Lista con la patente de cada auto: AD178JK, AD200RS, AD202VW.
			El objetivo, es crear un algoritmo que muestre en pantalla �nicamente a los modelos con a�o superior a 2020, y adem�s donde el conductor tenga mas de 25 a�os.

			Ejemplo: "El auto BMW Z3 del a�o 2021, patente AD179JK, pertenece a Mu�oz, que tiene 30 a�os, y su DNI es 54789534".
		*/
		Scanner datos = new Scanner(System.in);
		
		int listDNI;
		
		System.out.println("�Cuantas listas de dni deseas?");
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
			  	siempre quedará en la última posición desde el 
			  	inicio del ordenamiento. 
			*/
				
				if (listDNI1[j] > listDNI1[j + 1]) {
					// Intercambiar los elementos
					int temporal = listDNI1[j];
					/* temporal sirve para guardar por un momento
						al valor mas alto. 
					*/
					listDNI1[j] = listDNI1[j + 1];
					// La primera posición de las dos, toma el valor de la segunda (que es mas chico).
					listDNI1[j + 1] = temporal;
					// La segunda posición, toma el valor mas alto.
				}
			}
		System.out.println("\nArreglo ordenado:");
			for (int num : listDNI1) {
				System.out.print(num + " ");
			}
		}
		
		
	}
}
