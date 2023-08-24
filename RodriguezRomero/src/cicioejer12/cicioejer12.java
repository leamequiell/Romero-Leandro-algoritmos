package cicioejer12;

import java.util.Scanner;

public class cicioejer12 {
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero_elegido;
		
		System.out.println("ingresa un numero del 1 al 10: ");
		numero_elegido = entrada.nextInt();
		
		if (numero_elegido>=1 && numero_elegido<=3) {
			System.out.println("su nota es: insuficiente ("+numero_elegido+")" );			
		  }
		else if  (numero_elegido>3 && numero_elegido<6) 
		{
			System.out.println("su nota es: no logrado ("+numero_elegido+")" );
	 	}
		else if  (numero_elegido>=6 && numero_elegido<=7) 
		{
			System.out.println("su nota es: suficiente ("+numero_elegido+")" );
        }
		else if  (numero_elegido>=8 && numero_elegido<=9) 
		{
			System.out.println("su nota es: notable ("+numero_elegido+")" );
        }
		else if  (numero_elegido==10) 
		{
			System.out.println("su nota es: sobresaliente ("+numero_elegido+")" );
        }
		else
		{
			System.out.println("valor fuera de rango, intente de nuevo");
		}
		
 }
}
