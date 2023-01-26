package Tema3;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		// Hacer Resta, mult div. La división devuelve double y comprueba que no esta
		// sienod divida por 0
		// Reliazar tb las funciones minimo y media que reciben un array de números

		int num1 = 0, num2 = 0;
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce los 2 números: ");
		num1 = teclado.nextInt();
		num2 = teclado.nextInt();

		System.out.println(" ");
	}

	public static int suma(int num1, int num2) {
		int resultado;
		resultado = num1 + num2;
		return resultado;
	}

}
