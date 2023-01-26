package Tema2;

import java.util.Scanner;

public class EjercicioCondicional8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dia; // Declaramos las variables
		String mes;
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce el mes (Escrito): "); // Recogemos el valor del String por teclado
		mes = teclado.nextLine();
		mes = mes.toLowerCase(); // Lo convertimos a minuscula para evitar errores en el if

		System.out.print("Introduce el día: ");
		dia = teclado.nextInt();

		if (dia == 25 && mes.equals("diciembre")) { // Si el dia es 25 y el mes diciembre, correcto
			System.out.println("Correcto! Feliz navidad!");
		} else {
			System.out.println("Ese dia no es navidad :/"); // sino no
		}

	}

}
