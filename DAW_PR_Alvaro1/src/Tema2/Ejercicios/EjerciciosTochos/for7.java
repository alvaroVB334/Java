package Tema2.Ejercicios.EjerciciosTochos;

import java.util.Scanner;

public class for7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		/*
		 * Se realiza la carga de 10 valores enteros por teclado. Se desea conocer: a)
		 * La cantidad de valores ingresados negativos. b) La cantidad de valores
		 * ingresados positivos. c) La cantidad de múltiplos de 15. d) El valor
		 * acumulado de los números ingresados que son pares.
		 */

		float num, valoracumulado = 0; // Inicializamos variables
		int contadornegativo = 0, contadorpositivo = 0, multiplos = 0;
		Scanner teclado = new Scanner(System.in);

		System.out.print("Ve introduciendo los números: ");

		for (int i = 0; i < 10; i++) { // Creamos un bucle hasta el 10
			num = teclado.nextFloat();

			if (num < 0) {
				contadornegativo++; // si el num es menor que 0 aumentamos el contador de negativos, si es mayor el
									// de positivo
			} else {
				contadorpositivo++;
			}

			if (num % 15 == 0) { // si es multiplo de 15 aumentamos el contador del mismo
				multiplos++;
			}

			if (num % 2 == 0) { // Si es par vamos acumulando sus valores en una variable
				valoracumulado = valoracumulado + num;
			}

		}
		System.out.println("---------------\nCantidad de Positivios: " + contadorpositivo + "\nCantidad de Negativos: "
				+ contadornegativo + "\nCantidad de multiplos de 15: " + multiplos
				+ "\nValor acumulado de los números pares: " + valoracumulado); // Imprimimos todo
		teclado.close();
	}

}
