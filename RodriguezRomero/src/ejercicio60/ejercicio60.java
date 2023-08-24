package ejercicio60;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio60 {
		/* Vamos a tomar el ejercicio 47, pero con algunas modificaciones:
	• Declará los array globales como “static”. Lo mismo hace con las
	variables globales.
	• Creá una función para que el usuario coloque una cantidad de
	notas (que obviamente, será igual a la cantidad de apellidos). Te
	sugiero que la variable que uses para cargar la cantidad de notas,
	sea una variable global.
	• Armá una función para pedirle a un usuario que ingrese las notas
	de un alumno. Retorná el array de números de esa función.
	• Generá otra función para almacenar los apellidos de cada alumno.
	Pensá que la cantidad de apellidos, tiene que ser la misma que la
	cantidad de notas. Retorná el array de apellidos.
	• Finalmente, mostrá en pantalla el array de apellidos, y el de notas.
	Sugerencia para esto: acordate de almacenar la función con el
	array, dentro de un nuevo array en la función principal.
	Una vez logrado lo anterior, hay que hacer una pequeña corrección.
	Mientras el usuario ingrese una nota menor a 0, o mayor a 10, hay que
	indicarle que se equivocó, y que vuelva a ingresar la calificación. */
	static int[] notalum;
    static String[] alumno;
    static int cantalumn;
	
	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        cantalumn = cantalum();
        notalum = cantnotas();
        alumno = alumnos();
        mostrasr();
        System.out.println();
    }
	 public static void mostrasr(){
			System.out.println("Los alumnos y sus notas son: " );
		for(int i = 0;i < cantalumn; i++) {
			System.out.println("El alumno "+alumno[i] +", nota: "+notalum[i]);
		}
		
	} 

    public static int cantalum() {
        System.out.println("Ingrese la cantidad de alumnos");
        Scanner entrada = new Scanner(System.in);
        int a = entrada.nextInt();
        return a;
    }

    public static int[] cantnotas() {
  
    	int[] a = new int[cantalumn];  // Usar la cantidad almacenada en cantalumn
        
        for (int i = 0; i < cantalumn; i++) {
        	do{
	            System.out.println("Ingrese la nota del alumno número " + (i+1) + ":");
	            Scanner entrada = new Scanner(System.in);
	            a[i] = entrada.nextInt();
        	}while(a[i] > 10 || a[i]	 < 0);
        }
        
        return a;
    }
    public static String[] alumnos() {
        String[] a = new String[cantalumn];  // Usar la cantidad almacenada en cantalumn
        for (int i = 0; i < cantalumn; i++) {
            System.out.println("Ingrese el apellido del alumno número " + (i+1) + ":");
            Scanner entrada = new Scanner(System.in);
            a[i] = entrada.next();
        }
        return a;
    }
    
    
	/*public static void main(String[] args) {

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
	*/
		
}


