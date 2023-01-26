package Tema2.Ejercicios.EjerciciosTochos;

import java.util.Scanner;

public class Bucles5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Escribir un programa que lea la altura y la base y dibuje con * un rectángulo

		int base, altura;
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce la base: "); // Pedimos la base y la altura por teclado
		base = teclado.nextInt();

		System.out.print("Introduce la altura: ");
		altura = teclado.nextInt();

		for (int i = 0; i < altura; i++) { // Colocamos dos bucles, uno ira fila por fila (hasta el valor del altura), y
											// el otro rellenando las filas
			for (int j = 0; j < base; j++) { // Hasta el valor de la base
				System.out.print("*");
			}
			System.out.print("\n");
		}

		teclado.close();

	}

}
