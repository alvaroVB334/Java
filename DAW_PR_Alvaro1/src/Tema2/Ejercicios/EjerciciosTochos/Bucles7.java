package Tema2.Ejercicios.EjerciciosTochos;

import java.util.Scanner;

public class Bucles7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Hacer un programa que leyendo dos números, x e y nos muestre todos los
		 * divisores de y que hay entre 1 y x
		 */

		float x, y;
		Scanner teclado = new Scanner(System.in); // Inicializamos las variables x e y

		System.out.print("Introduce el valor de x: "); // Pedimos los valores por teclado
		x = teclado.nextFloat();

		System.out.print("Introduce el valor de y: ");
		y = teclado.nextFloat();

		for (int i = 1; i < x; i++) { // bucle desde 1 a x
			if (y % i == 0) {
				System.out.print(+i + "-"); // Condición, si el resto de la posicion de y entre el contador i vale 0
											// entonces
			} // Significa que es un divisor del mismo y se imprime

		}
		teclado.close();
	}

}
