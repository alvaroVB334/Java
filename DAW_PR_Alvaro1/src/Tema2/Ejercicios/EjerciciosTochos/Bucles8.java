package Tema2.Ejercicios.EjerciciosTochos;

import java.util.Scanner;

public class Bucles8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * - Introducir: Nombre de circuito, posición en que ha quedado, cantidad de
		 * adelantamientos, cuantos safety car, accidente o no (0,1) - Menu:
		 * 1.Introducir datos - 2.Mostrar estadisticas - 3.Salir -
		 * 
		 * Estadisticas: Mejor posición en la que ha quedado, Nombre del circuito en
		 * concreto, porcentaje de accidentes por carrera, y de sfCar Felicitación si la
		 * posición media es mejor que 3 y despido si no. Si ha realizado mas de 3
		 * adelantamientos por carrera, titulo de piloto audaz
		 */

		int i = 0, n = 0, posicion, nAdelantamientos = 0, Scar = 0, posicionMayor = Integer.MAX_VALUE,
				contadorAccidentes = 0, posicion2 = 0, ScarTotal = 0;
		String circuito, mejorCircuito = "";
		boolean accidente;
		Scanner teclado = new Scanner(System.in);

		while (i == 0) {
			System.out.println("\n 1 - INTRODUCIR DATOS\n 2 - MOSTRAR ESTADISTICAS\n 3 - SALIR");
			i = teclado.nextInt();
		}

		while (i == 1) {

			System.out.print("¿Cuantas carreras quieres introducir?: ");
			n = teclado.nextInt();

			for (int j = 0; j < n; j++) {

				System.out.print("\nNombre del circuito: ");
				circuito = teclado.next();

				System.out.print("Posición en la que quedaste en " + circuito + ": ");
				posicion = teclado.nextInt();

				System.out.print("Cantidad de adelantamientos: ");
				nAdelantamientos = teclado.nextInt();

				System.out.print("¿Cuantos Safety Car ha habido?: ");
				Scar = teclado.nextInt();

				System.out.print("¿Hubo algún accidente?(true o false): ");
				accidente = teclado.nextBoolean();

				System.out.print("-----------------------------------------\n");

				ScarTotal = ScarTotal + Scar;

				posicion2 = posicion2 + posicion;

				if (posicion < posicionMayor) {

					posicionMayor = posicion;
					mejorCircuito = circuito;
				}

				if (accidente == true) {
					contadorAccidentes = contadorAccidentes + 1; // porvcentaje-> ContadorAccidentes/n *100 // SFCAR/n
																	// *100
				}

			}

			posicion2 = posicion2 / n;

			System.out.println("1 - INTRODUCIR DATOS\n 2 - MOSTRAR ESTADISTICAS\n 3 - SALIR");
			i = teclado.nextInt();

		}

		while (i == 2) {
			System.out.println("Tu Mejor posición ha sido " + posicionMayor + " en el circuito " + mejorCircuito);
			System.out.println("El porcentaje de accidentes por carrera es " + (double) ((contadorAccidentes / n) * 100)
					+ "% y de SafetyCars: " + ((ScarTotal / n) * 100) + "%");

			if (posicion2 < 3) {
				System.out.println("Felicitaciones, tu media de posiciones es mayor que 3!!");
			} else {
				System.out.println("Tu media de posiciones es menor que 3, desaparece de mi vista insensato");
			}

			if (nAdelantamientos >= 3) {
				System.out.println("Felicidades! Recibiste el premio Piloto Audaz");
			}
			System.out.println("\n1 - INTRODUCIR DATOS\n 2 - MOSTRAR ESTADISTICAS\n 3 - SALIR");
			i = teclado.nextInt();
		}

		while (i == 3) {
			System.exit(0);
		}

	}

}
