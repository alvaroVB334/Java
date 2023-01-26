package Tema2.Ejercicios;

import java.util.Scanner;

public class While6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * Realizar un programa que permita cargar dos listas de 15 valores cada una.
		 * Informar con un mensaje cual de las dos listas tiene un valor acumulado mayor
		 * (mensajes "Lista 1 mayor", "Lista 2 mayor", "Listas iguales") Tener en cuenta
		 * que puede haber dos o más estructuras repetitivas en un algoritmo.
		 */

		int i = 0, j = 0;
		double cumulo1 = 0, cumulo2 = 0, num1, num2; // Inicializamos variables
		Scanner teclado = new Scanner(System.in);

		System.out.print("Ve introduciendo los valores de la primera lista: "); // HJacemos un bucle para introducir los
																				// valores de la primera lista
																				// Creamos un cumulo que acumule los
																				// valores
		while (i < 15) {
			num1 = teclado.nextDouble();
			cumulo1 = cumulo1 + num1;
			i++;
		}

		System.out.print("Ahora los de la segunda lista"); // lo mismo para la segunda lista

		while (j < 15) {
			num2 = teclado.nextDouble();
			cumulo2 = cumulo2 + num2;
			j++;
		}

		if (cumulo1 > cumulo2) {
			System.out.println("Lista 1 mayor"); // Hacemos varios ifs y else para comparar las listas para ver cual es
													// mayor
		} else {
			if (cumulo2 > cumulo1) {
				System.out.println("Lista 2 mayor");
			} else {
				System.out.println("Lista 1 y lista 2 iguales");
			}
		}

		teclado.close();
	}

}
