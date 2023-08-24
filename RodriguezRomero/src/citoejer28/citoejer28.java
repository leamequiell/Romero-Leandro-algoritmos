package citoejer28;

import java.util.Scanner;

public class citoejer28 {
	public static void main(String[] args) throws InterruptedException {
		Scanner datos = new Scanner(System.in);
		
		int bateria=100;
		
		
		while (bateria != 0  ){
			
			System.out.println("tienes: "+bateria+"% de bateria.");
			
			bateria--;
			Thread.sleep(200);
			if(bateria == 20) {
				System.out.println("bateria baja");
				Thread.sleep(1000); 
			}
			
		}
		System.out.println("tienes 0% de bateria. \n apagando telefono");
		Thread.sleep(200);
		System.out.println(".");
		Thread.sleep(200);
		System.out.println(".");
		Thread.sleep(200);
		System.out.println(".");
	}
	
}
