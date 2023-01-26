package Actividades;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double radio;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce el radio de la esfera: ");
		radio = teclado.nextDouble();

		System.out.println("El Volumen de la esfera es: " + (1.33 * 3.1416 * radio * radio * radio));

	}

}
