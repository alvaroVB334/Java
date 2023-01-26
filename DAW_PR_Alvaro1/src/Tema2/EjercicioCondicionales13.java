package Tema2;

import java.util.Scanner;

public class EjercicioCondicionales13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int años; // Inicializamos las variables
		float sueldo, incremento;
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce tus años de antiguedad: ");
		años = teclado.nextInt(); // Recogemos tanto sueldo como años de antiguedad por teclado

		System.out.print("Introduce tu sueldo: ");
		sueldo = teclado.nextFloat();

		if (sueldo < 500 && años >= 10) { // Si sueldo menor que 500 y ademas la antiguedad mayor entonces el incremento
											// es el 20% del sueldo
			incremento = (float) (0.2 * sueldo); // E imprimimos el incremento mas el sueldo base por teclado.

			System.out.println("Tu sueldo total es: " + (sueldo + incremento));
		} else { // Sino
			if (sueldo < 500 && años < 10) { // Entonces si el sueldo es mayor pero la antiguedad menor que 10 aplicamos
												// el 5% de incremento
				incremento = (float) (0.05 * sueldo);

				System.out.println("Tu sueldo total es: " + (sueldo + incremento));
			} else { // si nada de lo anterior ocurre es que simplemente tu sueldo es 500 o mas ergo,
						// no recibiras incremento alguno

				System.out.println("Tu sueldo es: " + sueldo + " sorry, no vas a tener incremento.");
			}
		}

	}

}
