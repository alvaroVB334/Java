package Tema2.Ejercicios.EjerciciosTochos;

import java.util.Scanner;

public class Bucles2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Realiza un programa que lea un número y nos muestre el factorial y el
		 * sumatorio de dicho número, por ejemplo si se introduce el 5, el factorial
		 * seria 5*4*3*2*1, y el sumatorio 5+4+3+2+1, se tiene que utilizar bucle.
		 */
		float num = 0, factorial = 1, sumatorio = 0;
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce el Número del cual quieras saber su factorial y el sumatorio: ");
		num = teclado.nextFloat(); // Introducimos el numero por teclado

		for (int i = 1; i < num + 1; i++) { // deesde 1 hasta num+1 el factorial se almacena multiplicando todos los
											// valores que recorre i hasta num
			factorial = factorial * i; // y el sumatorio sumando, que conste que "i<num+1" es lo mismo que "i<=num"
			sumatorio = sumatorio + i;
		}

		System.out.println("El factorial de " + num + " es: " + factorial + " y su sumatorio: " + sumatorio);
		teclado.close();
	}

}
