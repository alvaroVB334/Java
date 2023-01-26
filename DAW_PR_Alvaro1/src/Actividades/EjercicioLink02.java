package Actividades;

import java.util.Scanner;

public class EjercicioLink02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num1, num2, num3, num4;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce el primer número: ");
		num1 = teclado.nextDouble();

		System.out.print("Introduce el segundo número: ");
		num2 = teclado.nextDouble();

		System.out.print("Introduce el tercer número: ");
		num3 = teclado.nextDouble();

		System.out.print("Introduce el cuarto número: ");
		num4 = teclado.nextDouble();

		System.out.println("La suma de los dos primeros numeros es: " + (num1 + num2));

		System.out.println("El producto de los dos ultimos numeros es: " + (num3 * num4));

	}

}
