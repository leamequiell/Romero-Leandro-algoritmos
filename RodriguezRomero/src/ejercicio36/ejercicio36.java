package ejercicio36;

import java.util.Scanner;

public class ejercicio36 {

	public static void main(String[] args) {
Scanner lectura = new Scanner(System.in);
		
		float venta, ventamax = -1000000, ventamin =1000000, hora_vent_min= 17, hora_vent_max= 8 ;
		float venta_total=0;
		
		for (int hora = 8; hora <= 17; hora++) {
			System.out.println("Ingrese los ingresos a las: "+hora+"hs");
			
			venta = lectura.nextInt();
			
			if (venta < ventamin) {

				ventamin = venta;
			}
			
			if (venta > ventamax) {
				ventamax = venta;
				hora_vent_min = hora;
			}
			
			venta_total += venta;
			
		}
		System.out.println("la venta minima fue: " + ventamin+ " a las "+hora_vent_min+"hs");
		System.out.println("la venta maxima fue: " + ventamax+" a las "+hora_vent_max+"hs");
		
		System.out.println("la venta total fue: "+venta_total);
		
		
	}
}
