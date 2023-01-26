package Tema2.Ejercicios;

import java.util.Scanner;

public class for6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Escribir un programa que pida ingresar coordenadas (x,y) que representan
		 * puntos en el plano. Informar cuántos puntos se han ingresado en el primer,
		 * segundo, tercer y cuarto cuadrante. Al comenzar el programa se pide que se
		 * ingrese la cantidad de puntos a procesar.
		 */

		float x, y, n; // Inicializamos las coordenadas y los cuadrantes
		int c1 = 0, c2 = 0, c3 = 0, c4 = 0;
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce el número de coordenadas totales: "); // le pedimos el total de coordenadas a
																			// ingresar
		n = teclado.nextFloat();

		System.out.print("Introduce primero la coordenada x y luego la y: ");
		// iniciamos el bucle desde i 0 hasta n en el cual dentro del mismio se
		// introduciran las coordenadas
		for (int i = 0; i < n; i++) {
			x = teclado.nextFloat();
			y = teclado.nextFloat();

			if (x > 0) {
				if (y > 0) { // Y se determintara mediante ifs el cuadrante y aumentaran los contadores
								// correspondientes a ese cuadrante
					c1++;
				}
				if (y < 0) {
					c4++;
				}
			} else { // if(x<0)
				if (y > 0) {
					c2++;
				}
				if (y < 0) {
					c3++;
				}
			}

			System.out.println("De nuevo: ");
		}

		System.out.println("----------------------\nCantidad de puntos en el primer cuadrante: " + c1
				+ "\nCantidad de puntos en el segundo: " + c2 + "\nCantidad de puntos en el tercer cuadrante: " + c3 // Luego
																														// imprimimos
																														// la
																														// cantidad
																														// de
																														// puntos
																														// en
																														// cada
																														// cuadrante
				+ "\nCantidad de puntos en el cuarto: " + c4);

		teclado.close();
	}

}
