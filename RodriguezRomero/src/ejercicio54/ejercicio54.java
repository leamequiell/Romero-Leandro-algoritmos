package ejercicio54;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio54 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		boolean turno1valid = false, turno2valid = false;
		char turno2 = 'O', turno1 = 'X';
		int columna1, fila1, columna2, fila2, turno = 0;

		String[][] matriz = new String[3][3];

		for (String[] fila : matriz) {
			Arrays.fill(fila, new String("| |"));
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				System.out.print(matriz[i][j] + " ");

			}
			System.out.println();
		}
		for (int g = 0; g < 5; g++) {
			
			do{
				if (turno == 0) {

					System.out.print("el jugador 1 debe ingresar la fila que va a utilizar");
					fila1 = entrada.nextInt();

					System.out.print("el jugador 1 debe ingresar la columna que va a utilizar");
					columna1 = entrada.nextInt();

					if (matriz[(fila1 - 1)][(columna1 - 1)].equalsIgnoreCase("| |")) {
						matriz[(fila1 - 1)][(columna1 - 1)] = "|X|";
						turno1valid = true;
					
					}
					else if (!matriz[(fila1 - 1)][(columna1 - 1)].equalsIgnoreCase("| |")) {
						turno1valid = false;
						System.out.println("el espacio esta ocupado");
					}
					
				}
			}while (turno1valid == false);
			
			turno = 1;
			
			do{
				if (turno == 1 && g < 4) {

					System.out.print("el jugador 2 debe ingresar la fila que va a utilizar");
					fila2 = entrada.nextInt();

					System.out.print("el jugador 2 debe ingresar la columna que va a utilizar");
					columna2 = entrada.nextInt();

					if (matriz[(fila2 - 1)][(columna2 - 1)].equalsIgnoreCase("| |")) {
						matriz[(fila2 - 1)][(columna2 - 1)] = "|O|";
						turno2valid = true;
					} else if (!matriz[(fila2 - 1)][(columna2 - 1)].equalsIgnoreCase("| |")) {
						turno2valid = false;
						System.out.println("el espacio esta ocupado");
					}
					
				}
			}while (turno2valid == false);
			
			turno = 0;
			
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {

					System.out.print(matriz[i][j] + " ");

				}
				System.out.println();
			}
		}
		System.out.println();
	}
}
