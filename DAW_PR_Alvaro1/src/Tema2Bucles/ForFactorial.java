package Tema2Bucles;

import java.util.Scanner;

public class ForFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long numLeido = -1, factorial = 1, tiempo = 0;
		Scanner teclado = new Scanner(System.in);

		do {
			System.out.print("Introduce un número del cual quieras saber su factorial: ");
			numLeido = teclado.nextInt();

		} while (numLeido < 1 || numLeido > 100);

		tiempo = System.currentTimeMillis(); // Guardamos el instante actual

		for (int i = 1; i <= numLeido; i++) {
			System.out.print(i + " x ");
			factorial = factorial * i; // Vamos multiplicando factorial por el número que se incrementa y añadiendo
										// todo en factorial

		}

		System.out.print("= " + factorial);

		tiempo = System.currentTimeMillis() - tiempo; // EL tiempo que ha pasado es el tiempo actual menos el tiempo que
														// guardamos al inicio

		System.out.println("\n Ha tardado: " + (float) (tiempo));

		teclado.close();
	}

}
