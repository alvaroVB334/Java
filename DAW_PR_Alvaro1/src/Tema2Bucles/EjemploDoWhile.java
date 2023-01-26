package Tema2Bucles;

import java.util.Scanner;

public class EjemploDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Generar un numero aleatorio y pedir al usuario que lo acierte
		// si el numero es mayor o menor se le indicara

		int numAleatorio = (int) (Math.random() * 100 + 1); // entre 0 y 99 por eso le sumamos 1 para que sea entre 1 y
															// 100
		int numLeido = -1, numIntentos = 5;
		Scanner teclado = new Scanner(System.in);

		do {
			System.out.print("MUHAHAHAHAA jamás acertarás el número secreto. Intentalo: ");
			numLeido = teclado.nextInt();
			numIntentos--;

			if (numLeido > numIntentos) {
				System.out.println("Es un numero mas pequeño.");
			}
			if (numLeido < numIntentos) {
				System.out.println("Es un numero mas Grande.");
			}
			if (1 == numIntentos) {
				System.out.println("Último Intento MUHAHAHAHAHAHA");
			}

		} while (numAleatorio != numLeido && numIntentos > 0);

		if (numLeido == numAleatorio) {
			System.out.println("ARGHHHHH ME GANASTE");
			if (numIntentos == 1) {
				System.out.println("EN EL ULTIMO INTENTO QUE POTRA");
			}
		} else {
			System.out.println("HAS PERDIDO, ME LLEVO TODOS TUS BITCOINS, EL NÚMERO ERA: " + numAleatorio);
		}

	}

}
