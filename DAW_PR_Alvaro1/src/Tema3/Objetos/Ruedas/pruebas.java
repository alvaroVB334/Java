package Tema3.Objetos.Ruedas;

import java.util.Scanner;

public class pruebas {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		coche coche = new coche();
		Ruedas rueda = new Ruedas();

		int rueda1, posicion, presion;

		System.out.print("Introduce una rueda y la nueva posicion a la cual quieres cambiarla: ");
		rueda.posicion = teclado.nextInt(); // Posición de la rueda
		posicion = teclado.nextInt(); // Nueva posición que desea

		if (coche.cambiarRueda(posicion, rueda.posicion) == 1) {
			System.out.println("Rueda cambiada de posición correctamente");
		} else {
			System.out.println("No ha sido posible cambiar la rueda intentalo de nuevo");
			main(null);
		}

		System.out.println("---------------------------------------------------------------------");

		System.out.print("Introduce una rueda de la cual quieras cambiar la suspensión ");
		rueda.posicion = teclado.nextInt();

		if (coche.cambiarSuspension(rueda.posicion) == 1) {
			System.out.println("Se cambio la suspension");
		} else
			System.out.println("No se pudo cambiar la presión de la rueda");

		System.out.println("---------------------------------------------------------------------");

		System.out.print("Introduce la rueda cuya presión quieres incrementar y la cantidad de presión (0-100): ");
		rueda.posicion = teclado.nextInt();
		rueda.presion = teclado.nextFloat();

		if (coche.ajustarPresion(rueda.posicion, rueda.presion) == 1) {
			System.out.println("Presión de la rueda número " + rueda.posicion + " cambiada correctamente.");
		} else
			System.out.println("No se pudo cambiar la presión de la rueda");

	}
}