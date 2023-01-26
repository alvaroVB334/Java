package Tema2;

import java.util.Scanner;

public class CondicionalesII2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Crea un programa que lea un número y si hay una moneda o un billete en euros
		// con
		// la misma cantidad poner que es valido, en caso contrario no valido. Por
		// ejemplo 20
		// seria valido, 23 no.

		float n = 0.0f;
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce un número, vamos a ver si existe un billete así: ");
		n = teclado.nextFloat();

		if (n == (float) 0.01 || n == (float) 0.02 || n == 0.05 || n == (float) 0.1 || n == (float) 0.2
				|| n == (float) 0.5 || n == 1 || n == 2 || n == 5 || n == 10 || n == 20 || n == 50 || n == 100
				|| n == 200 || n == 500) {
			System.out.println("Número valido, existe una moneda o billete de esa cantidad :)");
		} else {
			System.out.println("Lo siento :( no existe un billete o moneda que valga " + n);
		}

	}

}
