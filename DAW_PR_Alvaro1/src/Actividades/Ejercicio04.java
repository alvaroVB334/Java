package Actividades;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cad1;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Escribe algo:");
		cad1 = teclado.nextLine();

		System.out.println("La cadena en mayusculas:" + cad1.toUpperCase());

		int longitud = cad1.length();

		System.out.println("La longitud de la cadena es: " + longitud);

	}

}
