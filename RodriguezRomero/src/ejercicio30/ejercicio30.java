package ejercicio30;

import java.util.Scanner;

public class ejercicio30 {
	public static void main(String[] args) throws InterruptedException 
	{
		Scanner datos = new Scanner(System.in);
	
		
		for (int seguidores=0; seguidores<=100;  seguidores++) {
			System.out.println("new follower! seguidores totales: "+seguidores);
			Thread.sleep(20);
			
			
		}
		System.out.println("felicidades! haz llegado a los 100 seguidores :)");
}
}