package Tema2;

import java.util.Scanner;

public class EjercicioCondicional10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Se ingresan por teclado tres números, si todos los valores ingresados son
		 * menores a 10, imprimir en pantalla la leyenda
		 * "Todos los números son menores a diez".
		 */

		float num1, num2, num3;
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce 3 numeros: ");
		num1 = teclado.nextFloat();
		num2 = teclado.nextFloat();
		num3 = teclado.nextFloat();

		if (num1 < 10 && num2 < 10 && num3 < 10) {
			System.out.println("Todos los números son menores de 10");
		}

	}

}
