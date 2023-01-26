package Actividades;

import java.util.Scanner;

public class ejercicio5java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cad1;
		int pos1, pos2;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Escribe una cadena de texto: ");
		cad1 = teclado.nextLine();

		System.out.print("Escribe la primera posición: ");
		pos1 = teclado.nextInt();

		System.out.print("Escribe la segunda posición: ");
		pos2 = teclado.nextInt();

		String subCadena = cad1.substring(pos1, pos2);

		System.out.println("La subcadena es: " + subCadena);

	}

}
