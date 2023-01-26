package Tema2;

import java.util.Scanner;

public class EjercicioCondicional6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Confeccionar un programa que permita cargar un número entero positivo de
		 * hasta tres cifras y muestre un mensaje indicando si tiene 1, 2, o 3 cifras.
		 * Mostrar un mensaje de error si el número de cifras es mayor.
		 */

		int num;
		String snum;
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce un numero entero y positivo de hasta tres cifras: ");
		num = teclado.nextInt();

		if (num < 0) {
			System.out.println("ERROR, dije un numero entero y positivo de hasta 3 cifras");
			System.exit(num);
		}

		snum = Integer.toString(num);

		if (snum.length() == 1) {
			System.out.println("El número tiene 1 cifra.");
		} else {
			if (snum.length() == 2) {
				System.out.println("El número tiene 2 cifras.");
			} else {
				if (snum.length() == 3) {
					System.out.println("El número tiene 3 cifras");
				} else {
					System.out.println("ERROR, dije un numero entero y positivo de hasta 3 cifras");
				}
			}
		}

	}

}
