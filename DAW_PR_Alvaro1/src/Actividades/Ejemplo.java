package Actividades;

import java.util.Scanner;

public class Ejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		float sueldo;

		System.out.print("Ingrese el sueldo:");
		sueldo = teclado.nextFloat();

		if (sueldo > 3000)
			System.out.println("Esta persona debe abonar impuestos");
		else
			System.out.println("Te libraste de esta.");

		teclado.close();

	}

}
