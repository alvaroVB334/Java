package Tema2;

import java.util.Scanner;

public class EjercicioCondicionales1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Realizar un programa que lea por teclado dos números, si el primero es mayor
		 * al segundo informar su suma y diferencia, en caso contrario informar el
		 * producto y la división del primero respecto al segundo.
		 */

		float a, b; // Definimos las variables
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce el primer número: "); // Recogemos su valor por teclado
		a = teclado.nextFloat();

		System.out.print("Introduce el segundo número: ");
		b = teclado.nextFloat();

		if (a > b) { // Si a es mayor que b suma, sino multiplicación y división
			System.out.println("La suma del primero respecto al segundo es: " + (a + b));
		} else {
			System.out.println("El producto de ambos es: " + (a * b) + " Y la división: " + (a / b));
		}

	}

}
