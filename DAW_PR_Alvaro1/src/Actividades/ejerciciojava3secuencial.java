package Actividades;

import java.util.Scanner;

public class ejerciciojava3secuencial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float euros, resto;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce una cantidad de dinero (Max 4500eu): ");

		euros = teclado.nextFloat();

		System.out.println("Cantidad de billetes de 100: " + (int) (euros / 100));

		resto = euros % 100;

		System.out.println("Cantidad de billetes de 50: " + (int) (resto / 50));

		resto = resto % 50;

		System.out.println("Cantidad de billetes de 20: " + (int) (resto / 20));

		resto = resto % 20;

		System.out.println("Cantidad de billetes de 10: " + (int) (resto / 10));

		resto = resto % 10;

		System.out.println("Cantidad de billetes de 5: " + (int) (resto / 5));

		resto = resto % 5;

		System.out.println("Cantidad de monedas de 1: " + (int) (resto / 1));

		resto = resto % 1;

		System.out.println("Cantidad de monedas de 50cent: " + (int) (resto / 0.5));
	}

}
