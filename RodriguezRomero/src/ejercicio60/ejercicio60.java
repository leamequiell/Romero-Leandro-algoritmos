package ejercicio60;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio60 {
		/* Vamos a tomar el ejercicio 47, pero con algunas modificaciones:
	� Declar� los array globales como �static�. Lo mismo hace con las
	variables globales.
	� Cre� una funci�n para que el usuario coloque una cantidad de
	notas (que obviamente, ser� igual a la cantidad de apellidos). Te
	sugiero que la variable que uses para cargar la cantidad de notas,
	sea una variable global.
	� Arm� una funci�n para pedirle a un usuario que ingrese las notas
	de un alumno. Retorn� el array de n�meros de esa funci�n.
	� Gener� otra funci�n para almacenar los apellidos de cada alumno.
	Pens� que la cantidad de apellidos, tiene que ser la misma que la
	cantidad de notas. Retorn� el array de apellidos.
	� Finalmente, mostr� en pantalla el array de apellidos, y el de notas.
	Sugerencia para esto: acordate de almacenar la funci�n con el
	array, dentro de un nuevo array en la funci�n principal.
	Una vez logrado lo anterior, hay que hacer una peque�a correcci�n.
	Mientras el usuario ingrese una nota menor a 0, o mayor a 10, hay que
	indicarle que se equivoc�, y que vuelva a ingresar la calificaci�n. */
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
	            System.out.println("Ingrese la nota del alumno n�mero " + (i+1) + ":");
	            Scanner entrada = new Scanner(System.in);
	            a[i] = entrada.nextInt();
        	}while(a[i] > 10 || a[i]	 < 0);
        }
        
        return a;
    }
    public static String[] alumnos() {
        String[] a = new String[cantalumn];  // Usar la cantidad almacenada en cantalumn
        for (int i = 0; i < cantalumn; i++) {
            System.out.println("Ingrese el apellido del alumno n�mero " + (i+1) + ":");
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


