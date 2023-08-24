package ejercicio58;

import java.util.Scanner;

public class ejercicio58 {
		static int num;
		static boolean bool = false;
		
		public static int numRet(){
			Scanner entrada = new Scanner(System.in);
		    System.out.println("Ingrese un numero: ");
		    num = entrada.nextInt();
			
			return num;
		}
		
		public static boolean bul(){
			
			if(num>0){
				
				bool = true;
				
			}
			
			else if(num<0){
				bool =  false;
				
				
			}
			else {
				System.out.println("es cero");
			}
			return bool;
		}
		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			
			numRet();
			bul();
			
			if(bool){
				System.out.println("es positivo.");
			}
			else if(!bool){
				System.out.println("es negativo.");
			}
		}
			
}
