package Tema2Bucles;

import java.util.Scanner;

public class EjemplosBuclesWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		// ejemplo que muestre los primeros 100 numeros del 1 al 100
		int i = 1;

		while (i <= 100) {
			if (i % 2 == 0) {
				System.out.println(i + " ");

			}
			i = i + 1;
		}

	}

}
