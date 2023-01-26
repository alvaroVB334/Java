package Tema3;

import java.util.Scanner;

public class Try_Catch {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int edad;
		String strEdad;

		System.out.print("Introduce tu edad: ");
		edad = teclado.nextInt();

		if (esNumerico(strEdad)) {
			edad = Integer.valueOf(edad);
		}

	}

	public static boolean esNumerico(String strNumero) {
		boolean esNumerico = true;
	}

}
