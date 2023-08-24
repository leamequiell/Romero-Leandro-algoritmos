package ejercicio23;

import java.util.Scanner;

public class ejercicio23
{
	public static void main(String[] args) throws InterruptedException 
	{
		Scanner datos = new Scanner(System.in);
		int n1, n2, resultado, salir; 
	    
		System.out.println("ingrese un primer numero: ");
		n1 = datos.nextInt();
		
		System.out.println("Ingrese un segundo numero: ");
		n2 = datos.nextInt();
		
		resultado = n1 + n2;
		
		System.out.println(" La suma de los dos numeros es: " +resultado);
		
		System.out.println("Si desea salir, presione 0, si no, aprete cualquier otro numero.");
		salir = datos.nextInt();
			 
		while (salir != 0){
		
			System.out.println("ingrese un primer numero: ");
			n1 = datos.nextInt();
			
			System.out.println("Ingrese un segundo numero: ");
			n2 = datos.nextInt();
			
			resultado = n1 + n2;
			
			System.out.println(" La suma de los dos numeros es: " +resultado);
			
			System.out.println("Si desea salir, presione 0, si no, aprete cualquier otro numero.");
			salir = datos.nextInt();
		}
		System.out.println("Saliendo de la aplicacion, hasta luego.");
	}
		
}