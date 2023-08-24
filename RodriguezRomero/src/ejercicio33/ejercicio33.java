package ejercicio33;

import java.util.Scanner;

public class ejercicio33 {
	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String jugador = null;
            
        for (int i = 1; i<= 11; i++ ) {
            
        System.out.println("ingrese nombre del jugador n°: "+i);
        
        jugador=entrada.next();
            
        }
        
        System.out.println("los once jugadores"+jugador);
        
    
    }
            
}