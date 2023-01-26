package Actividades;

import java.util.Scanner;

public class ejerciciolink03 {

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

		System.out.println("La suma de los numeros es: " + (num1 + num2 + num3 + num4));

		System.out.println("Y su media: " + ((num1 + num2 + num3 + num4) / 4));

	}

}
