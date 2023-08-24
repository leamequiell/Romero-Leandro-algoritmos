package ejercicio6;

import java.util.Scanner;

public class ejercicio12dividido2 {
      public static void main(String[] args) {
    	Scanner entrada = new Scanner (System.in);
  		
    	float numero;
    	
  		System.out.println("ingresa tu nota en numeros flotantes: ");
  		numero = entrada.nextFloat();
  		
  		
  		int redondeado = (int) Math.round(numero);
  		
  		System.out.println("Etu nota en numeros enteros es: "+redondeado);
  	
    
	}
}