package Tema2;

import java.util.Scanner;

public class EjercicioCondicional5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		Scanner teclado = new Scanner(System.in); // Inicializamos variables

		System.out.print("Introduce un número: "); // recogemos su valor
		num = teclado.nextInt();

		if (num < 0) { // primero vemos si el numero es menor que 0, de ser así es negativo
			System.out.println("El número es Negativo");

		} else {
			if (num == 0) { // si no es negativo en caso de ser 0 es nulo
				System.out.println("El número es nulo");

			} else { // si no es nulo y por consiguiente no negativo, tiene que ser positivo.
				System.out.println("El número es positivo");
			}
		}

	}

}
