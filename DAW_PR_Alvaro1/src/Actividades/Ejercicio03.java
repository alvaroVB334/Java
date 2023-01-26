package Actividades;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double altura, radio;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce la altura del cilindro: ");
		altura = teclado.nextDouble();

		System.out.print("Introduce el radio del cilindro: ");
		radio = teclado.nextDouble();

		System.out.println("El volumen del cilindro es: " + (3.14 * altura * radio * radio));

	}

}
