package Tema4;

import java.util.Scanner;

public class ParsearNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce un número entero: ");
		String snumero = teclado.next();

		// Convertimos el numero de String a entero

		int numero = Integer.parseInt(snumero);

		teclado.close();

	}

}
