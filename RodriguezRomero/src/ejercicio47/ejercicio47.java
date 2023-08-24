package ejercicio47;
import java.util.Arrays;
import java.util.Scanner;


public class ejercicio47 {

	public static void main(String[] args) {

		Scanner datos = new Scanner(System.in);
		
		int cantalum;
		
		System.out.println("ingrese la cantidad de alumnos: ");
		cantalum = datos.nextInt();
		
			int[] notalum = new int[cantalum];
			int[] notalum1 = new int[cantalum];
			String[] alumno = new String[cantalum];
		
		for (int i = 0; i < notalum.length; i++) {
			System.out.println("ingrese el nombre del alumno"+(i+1)+": ");
			alumno[i] =datos.next();
			System.out.println("ingrese la nota del alumno "+(i+1)+": ");
			notalum[i] = datos.nextInt();
			notalum[i] = notalum1[i];
		}
		Arrays.sort(notalum);
		System.out.println("\nArray ordenado: ");
		
		 
		System.out.println("Array desordenado: ");
		for (int num : notalum1) {
				System.out.print(num + " ");
		}
	}
		
		
		
}
	

