package ejercicio38;

import java.util.Scanner;

public class ejercicio38 {
	public static void main(String[] args) {
				
		Scanner VCV = new Scanner(System.in);
		
		int cal, calmax = 0, calmin = 11 ;
		int horamin=0, horamax=0;
		
		for (int i = 9; i <= 19; i+=2) {
			
			System.out.println("cantidad de clientes en la hora: "+i);
			cal = VCV.nextInt();
			
			if (cal < calmin) {
				calmin = cal;
				horamin=i;
			}
			
			if (cal > calmax) {
				calmax = cal;
				horamax=i;
			}
			
			
			
		}
		System.out.println("la cantidad de clientes minima fue: " + calmin+" a las"+horamin);
		System.out.println("la cantidad de clientes maxima fue: " + calmax+" a las "+horamax);

	}
}
