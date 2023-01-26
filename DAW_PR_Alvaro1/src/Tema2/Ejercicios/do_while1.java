package Tema2.Ejercicios;

import java.util.Scanner;

public class do_while1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Realizar un programa que acumule (sume) valores ingresados por teclado hasta
		 * ingresar el 9999 (no sumar dicho valor, indica que ha finalizado la carga).
		 * Imprimir el valor acumulado e informar si dicho valor es cero, mayor a cero o
		 * menor a cero.
		 * 
		 */

		float num, cumulo = 0; // Inicializamos las variables
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce el número: ");
		do {
			num = teclado.nextFloat();
			cumulo = cumulo + num; // Hacemos que vaya introduciendo numero y se van sumando en un cumulo mientras
									// este sea menor que 9999

			System.out.print("------------------\n");

			if (cumulo > 0) {
				System.out.println(+cumulo + " Es mayor que cero :D");
			} else if (cumulo < 0) {
				System.out.println(+cumulo + " Es menor que cero >:("); // Evaluamos el valor del mismo mediante ifs
			} else {
				System.out.println(+cumulo + " Es igual a cero :|");
			}

			System.out.print("Introduce el siguiente número: ");

		} while (cumulo < 9999);

		teclado.close();

	}

}
