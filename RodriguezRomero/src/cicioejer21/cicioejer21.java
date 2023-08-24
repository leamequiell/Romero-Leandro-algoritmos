package cicioejer21;

import java.util.Scanner;

public class cicioejer21 
{
	public static void main(String[] args) throws InterruptedException 
	{
		Scanner datos = new Scanner(System.in);
		int temperatura = 35;
		
		while (temperatura <= 100) {
			System.out.println("Temperatura: "+temperatura+"ºC");
			Thread.sleep(20);
			
			if ( temperatura == 85 ) {
				System.out.println("CUIDADO!, TEMPERATURA PELIGROSA");
				Thread.sleep(1000);
			}
			
			temperatura +=2;
		}
		
		System.out.println("VALOR EXTREMO. APAGANDO PC");

	}
}
