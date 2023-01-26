package Tema2.Ejercicios;

import java.util.Scanner;

public class for2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Desarrollar un programa que solicite la carga de 10 números e imprima la suma
		 * de los últimos 5 valores ingresados.
		 */

		int num; // Inicializamos variables
		double suma = 0;
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce los números: ");

		for (int i = 0; i < 10; i++) { // Le pedimos que vaya introduciendo los numeros
			num = teclado.nextInt();

			if (i >= 5) { // y cuandio el contador llegue a 5(ergo solo queden 5 num para llegar a 10),
							// empezamos a sumarlos
				suma = suma + num;
			}

		}

		System.out.println("La suma de los últimos cinco números: " + suma); // Imprimimos la suma
		teclado.close();
	}
}
