package ejercitoi29;

import java.util.Scanner;

public class ejercitoi29 {
	public static void main(String[] args) throws InterruptedException {
		Scanner datos = new Scanner(System.in);
		
		
		
		
		for (int bateria=100; bateria>=0;  bateria--){
			
			 System.out.println("tienes "+bateria+"% de bateria");
			 Thread.sleep(100);
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

