package Tema2.Ejercicios;

import java.util.Scanner;

public class While7_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 ** Desarrollar un programa que permita cargar n números enteros y luego nos
		 * informe cuántos valores fueron pares y cuántos impares. Emplear el operador %
		 * en la condición de la estructura condicional:
		 * 
		 * se realizará igual pero guardándolos en un array de números, previamente se
		 * leerá la cantidad de números.
		 */

		int n, i = 0, pares = 0, impares = 0; // Inicializamos la n del while la i del contador el contador de pares y
												// de imparesd
		float num[], num1;
		String frase = "";
		// tambien el array num
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce cuantos numeros deseas meter: "); // le pedimos que introduzca el tamaño del array
		n = teclado.nextInt();

		num = new float[n]; // le asignamos ese tamaño

		System.out.print("Ve introduciendo todos los números: ");

		while (i < n) {
			num[i] = teclado.nextFloat(); // creamos un bucle para ir incluyendolos en las posiciones correspondientes y
											// comparamos sin son pares o no

			if (num[i] % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
			i++;
		}

		System.out.println("El número de pares es: " + pares + " Y de impares: " + impares); // imprimimos todo

		System.out.print("Introduce un número para comprobar si existe o no en el array: ");
		num1 = teclado.nextFloat();

		for (int j = 0; j < n; j++) {
			if (num1 == num[j]) {
				frase = "Si existe este número en el array";
				break;
			} else {
				frase = "No existe este número en el array";
			}

		}
		System.out.print(frase);

	}

}
