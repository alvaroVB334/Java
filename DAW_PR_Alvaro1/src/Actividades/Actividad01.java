package Actividades;

import java.util.Scanner;

public class Actividad01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1, num2;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce el primer número entero: ");
		num1 = teclado.nextInt();

		System.out.print("Introduce el segundo número entero: ");
		num2 = teclado.nextInt();

		System.out.println("La suma de ambos numeros es: " + (num1 + num2));

		System.out.println("EL producto de ambos numeros es: " + (num1 * num2));

	}

}
