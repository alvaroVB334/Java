package Tema2;

import java.util.Scanner;

public class EjercicioCondicional4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Se cargan por teclado tres números distintos. Mostrar por pantalla el mayor
		// de ellos.

		float num1, num2, num3;
		Scanner teclado = new Scanner(System.in); // Introducimos las variables

		System.out.print("Introduce tres números: "); // Pedimos los numeros por teclado
		num1 = teclado.nextFloat();
		num2 = teclado.nextFloat();
		num3 = teclado.nextFloat();

		if (num1 > num2 && num1 > num3) { // si num1 mayor que num2 y mayor que num3 entonces el mayor es num1
			System.out.println("El número mayor es: " + num1);
		} else {
			if (num2 > num3) { // en caso de que no si num2 es mayor que num3 entonces el mayor es num2
				System.out.println("El número mayor es: " + num2);
			} else {
				System.out.println("El numero mayor es: " + num3); // en caso de que no se cumpla nada de lo anterior,
																	// el mayor sera num3
			}
		}

	}

}
