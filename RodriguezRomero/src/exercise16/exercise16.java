package exercise16;

import java.util.Scanner;

public class exercise16 {

public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	int horas, minutos, segundos;
	
	System.out.println("ingrese el numero de horas (no mayor de 24): ");
	horas = entrada.nextInt();

	System.out.println("ingrese el numero de minutos (no mayor de 60): ");
	minutos = entrada.nextInt();
	
	System.out.println("ingrese el numero de segundos (no mayor de 60): ");
	segundos = entrada.nextInt();
	
	if (horas<=24 && minutos<=60 && segundos<=60) {
		
		System.out.println("el numero ingresado es valido: "+horas+":"+minutos+":"+segundos);	
	}
	else {
		
		System.out.println("el numero ingresado es invalido, intente de nuevo. ");
	}
	
 }
}