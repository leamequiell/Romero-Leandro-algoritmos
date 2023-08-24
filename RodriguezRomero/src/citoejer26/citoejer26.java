package citoejer26;

import java.util.Scanner;

public class citoejer26 {
	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		
		int password=0;
		
		int intentos=0;
	
		while (password == 1122 && intentos<=3); {
			
			System.out.println("Ingrese su contraseña designada: ");
			password = datos.nextInt();
			if(password == 1122) {
				System.out.println("ingresando");
			}
			else {
				System.out.println("demasiados intentos fallidos, intente mas tarde.");
			}
				
	
		}
		
		
			
	}
}