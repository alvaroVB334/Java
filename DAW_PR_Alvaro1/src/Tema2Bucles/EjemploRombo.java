package Tema2Bucles;

import java.util.Scanner;

public class EjemploRombo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * El Programa pedirá la altura y lo mostrara por ejemplo si pide 5 de altura *
		 * * * * * * * * *
		 * 
		 */

		int altura = 0;
		Scanner teclado = new Scanner(System.in);

		while (altura % 2 == 0) {// leemos la altura hasta que sea par
			System.out.print("Escribe la altura del rombo(Altura impar): ");
			altura = teclado.nextInt();
		}

		for (int i = 1; i <= (altura / 2) + 1; i++) { // Bucle principal para cada linea

			for (int j = 1; j <= i; j++) { // Bucle secundario para cada asterisco

				System.out.print("♦️");

			}
			System.out.println("\n");

		}

		for (int i = altura / 2; i > 0; i--) { // Bucle principal para cada linea

			for (int j = 1; j <= i; j++) { // Bucle secundario para cada asterisco

				System.out.print("♦️");

			}
			System.out.println("\n");

		}

	}

}
