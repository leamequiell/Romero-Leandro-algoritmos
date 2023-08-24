package ejerciciodieciosho;

import java.util.Scanner;

public class ejerciciodieciosho {
public static void main (String[] args) {
	
	
	Scanner entrada = new Scanner(System.in);

	char lleta;

		System.out.println("\t que talle de remera desea?");
		System.out.println("\n s-talle s \n m-talle m \n l-talle l \n 1-salir" );

		System.out.println("\n que desea:");

		lleta = entrada.next().charAt(0);
	
		switch(lleta) { 

			case 's':
				System.out.println("quedan 5 remeras");
				break; 
		
			case 'l':
				System.out.println("quedan 2 remeras");
				break;
		
			case 'm':
				System.out.println("no quedan remeras");
				break;
		
			case 1:
				System.out.println("adios hasta luego!!");
				break;
		
			default:
				System.out.println("el valor introducido no esta dentro del rango de numeros aceptados.");
				break;
				}

										}
}