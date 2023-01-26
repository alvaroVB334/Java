package Actividades;

import java.util.Scanner;

public class ejerciciojava4secuencial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int pos1, pos2;

		String cad1, cad2;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce tu Nombre, edad y telefono: ");

		cad1 = teclado.nextLine();

		System.out.print("Introduce las posiciones en las que irian los espacios: ");
		pos1 = teclado.nextInt();
		pos2 = teclado.nextInt();

		cad2 = cad1.substring(0, pos1);

		System.out.println("Tu nombre: " + cad2);

		cad2 = cad1.substring(pos1, pos2);

		System.out.println("Tu edad: " + cad2);

		cad2 = cad1.substring(pos2);

		System.out.println("Tu telefono: " + cad2);

	}

}
