package exercise9;

import java.util.Scanner;

public class exercise9 {
public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	String Nombre, Apellido;
	
	System.out.println("ingresa su nombre: ");
	Nombre = entrada.next();
	System.out.println("ingresa su apellido: ");
	Apellido = entrada.next();
	
	double numero = (Math.random()*99);
	
	int resultado = (int) numero;
	
	System.out.println("Nombre y apellido: "+Apellido +", " +Nombre);
	System.out.println("Su numero de Bingo es: "+resultado);
	
	
	
	
}
}
