package ejersisiotrese13;

import java.util.Scanner;

public class ejersisiotrese13 {
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		char talle;
		
		System.out.println("Ingrese su talle de remera (s, m o l) ");
		talle = entrada.next().charAt(0);
		
		if (talle == 's') {
			System.out.println("quedan 5 remeras talle s" );			
		  }
		else if  (talle == 'm') 
		{
			System.out.println("quedan 2 remeras talle m" );
	 	}
		else if  (talle == 'l') 
		{
			System.out.println("no quedan remeras de este talle :((( " );
        }
		
 }
}
