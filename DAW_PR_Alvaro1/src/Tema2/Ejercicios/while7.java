package Tema2.Ejercicios;

import java.util.Scanner;

public class while7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Desarrollar un programa que permita cargar n números enteros y luego nos
		 * informe cuántos valores fueron pares y cuántos impares. Emplear el operador %
		 * en la condición de la estructura condicional:
		 */
		int i = 0, n, num, par = 0, impar = 0;
		Scanner teclado = new Scanner(System.in); // Inicializamos las variables

		System.out.print("Introduce el número de enteros que vas a introducir: ");
		n = teclado.nextInt(); // pedimos por teclado el limite del bucle

		System.out.print("Ve introduciendo los enteros: ");

		while (i < n) {
			num = teclado.nextInt(); // le pedimos que vaya introduciendo los numeros, si es par aumenta el contador
										// de pares, sino el de imapres
			if (num % 2 == 0) {
				par++;
			} else {
				impar++;
			}
			i++; // hacemos subir de valor al contador
		}

		System.out.println("El número de pares es: " + par + " Y de impares: " + impar); // imprimimos todo
	}

}
