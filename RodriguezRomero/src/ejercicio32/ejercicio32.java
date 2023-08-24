package ejercicio32;

import java.util.Scanner;

public class ejercicio32{
	public static void main(String[] args) throws InterruptedException 
	{
		Scanner datos = new Scanner(System.in);
		int mult, res;
		System.out.println("Inserte un numero para mostrar la tabla (1-20).");
		mult=datos.nextInt();
		
		for(int i=1;  i<=20; i++) {
			res = mult*i;
			System.out.println(mult+" x "+i+" = "+res);
			Thread.sleep(20);
			
		}		
		}
		
}
