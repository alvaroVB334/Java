package Tema3.Objetos.Coche;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Recursivas3 {

	public static void main(String[] args) {
		/**
		 * Crear dos funciones, una iterativa(bucles) y otra recursiva(la función se
		 * llama a sí misma) que reciba un número y un array de números (que se recibirá
		 * ordenado de menor a mayor) y devuelva la posición donde está dicho número. La
		 * búsqueda debe de ser binaría,
		 * https://es.wikipedia.org/wiki/B%C3%BAsqueda_binaria
		 */

		Scanner teclado = new Scanner(System.in);
		int num, array[], n;

		System.out.print("Cuantos números quieres introducir: ");
		n = teclado.nextInt();

		array = new int[n];

		System.out.print("Ve introduciendo los números (de mayor a menor): ");
		for (int i = 0; i < n; i++) {
			array[i] = teclado.nextInt();
		}

		System.out.print("¿De que numero quieres saber la posición?: ");
		num = teclado.nextInt();

		System.out.println("El numero " + num + " está en la posición " + posIterativa(num, array)
				+ " -Calculado de forma iterativa-");

		System.out.println("El numero " + num + " está en la posición " + posRecursiva(num, array, 0)
				+ " -Calculado de forma Recursiva-");
	}

	static int posIterativa(int num, int array[]) {

		for (int i = 0; i < Array.getLength(array); i++) {
			if (array[i] == num) {
				return i + 1;
			}
		}
		return 0;
	}

	static int posRecursiva(int num, int array[], int n) {

		if (num == array[n]) {
			return n + 1;
		} else {
			return posRecursiva(num, array, n + 1);
		}

	}

}
