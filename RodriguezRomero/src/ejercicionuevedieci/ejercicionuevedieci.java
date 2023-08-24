package ejercicionuevedieci;

import java.util.Scanner;

public class ejercicionuevedieci {
	
		public static void main(String[] args) 
		{
			Scanner datos = new Scanner (System.in);
			
			int cafe;
			
				System.out.println("\t que cafe desea?");
				System.out.println("\n 1-cafe cortado \n 2-cafe late \n 3-cafe solo \n 4-cafe lagrima \n 5-salir");
				
				System.out.println("\n que desea:");
				
				cafe = datos.nextInt();
				switch(cafe) { 
			
						case 1:
						System.out.println("cafe cortado");
						break; 
						
						case 2:
						System.out.println("cafe late");
						break;
						
						case 3:
						System.out.println("cafe solo");
						break;
						
						case 4:
						System.out.println("cafe lagrima");
						break;
						
						case 5:
						System.out.println("adios hasta luego!!");
						break;
						
						default:
						System.out.println("el valor introducido no esta dentro del rango de numeros aceptados.");
						break;
								}
		}
						}

