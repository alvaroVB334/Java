package Tema2.Ejercicios.EjerciciosTochos;

import java.util.Scanner;

public class Bucles4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Escribir un programa que lea n (leído por teclado) jugadores de paddle, leerá
		 * su nombre, torneos ganados y posición atp. Mostrará el nombre del jugador en
		 * mejor posición en la lista atp y el del que más torneos ha ganado, y la media
		 * de torneos ganados..
		 */

		int n, torneos, posicion, torneosMayor = 0, posicionMayor = Integer.MAX_VALUE, torneostotal = 0;
		String nombre, nombretorneos = "", nombreposicion = "";
		Scanner teclado = new Scanner(System.in); // Introducimos las variables

		System.out.print("¿Cuantos jugadores vas a introducir?: ");
		n = teclado.nextInt(); // Pedimos la n de jugadores que limitara el bucle

		System.out.print("-----------------------------------------");

		for (int i = 0; i < n; i++) {

			System.out.print("\nIntroduce el nombre del jugador número " + (i + 1) + ": "); // Le vamos pidiendo de cada
																							// jugador ,nombre,torneos
																							// posicion y lo guardamos
																							// en sus variables
			nombre = teclado.next();

			System.out.print("Introduce el número de torneos ganados por el jugador número " + (i + 1) + ": ");
			torneos = teclado.nextInt();

			System.out.print("Introduce la posición ATP del jugador número " + (i + 1) + ": ");
			posicion = teclado.nextInt();

			System.out.print("\n--------------------------------------------");

			if (torneos > torneosMayor) { // Creamos variables para guardar el de mayor posición del torneo y el de mas
											// victorias, asi como sus nombres
				torneosMayor = torneos;
				nombretorneos = nombre;
			}

			if (posicion < posicionMayor) {
				posicionMayor = posicion;
				nombreposicion = nombre;
			}

			torneostotal = torneostotal + torneos; // Calculamos el cumulo de torneos
		}
		System.out.print("------------------------\nJugador con mejor posición en la lista ATP: " + nombreposicion
				+ "\nJugador con mayor número de torneos ganados: " + nombretorneos + "\n Media de torneos ganados: "
				+ (double) (torneostotal / n)); // Al final imprimimos el mayor de cada cosa y la media la hacemos el
												// cumulo de torneos ganados entre el total de jugadores

	}

}
