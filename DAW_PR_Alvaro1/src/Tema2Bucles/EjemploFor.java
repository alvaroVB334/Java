package Tema2Bucles;

import java.util.Scanner;

public class EjemploFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numTabla = 0;
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce un número para mostrar la tabla de multiplicar: ");
		numTabla = teclado.nextInt();

		// Inicializamos variable - Hasta donde tiene que llegar el contador - Cuanto
		// avanza el mismo
		for (int i = 0; i < 11; i++) {
			System.out.println(+numTabla + " x " + i + " = " + (numTabla * i));

		}
		teclado.close();
	}

}
