package Tema2;

import java.util.Scanner;

public class EjercicioCondicional12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float x, y;
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce la coordenada x: ");
		x = teclado.nextFloat();

		System.out.print("Introduce la coordenada y: ");
		y = teclado.nextFloat();

		if (x < 0) {
			if (y < 0) {
				System.out.println("Se encuentra en el tercer cuadrante");
			}

			if (y > 0) {
				System.out.println("Se encuentra en el segundo cuadrante");
			}
		}
		if (x > 0) {
			if (y < 0) {
				System.out.println("Se encuentra en el cuarto cuadrante");
			}
			if (y > 0) {
				System.out.println("Se encuentra en el primer cuadrante");
			}
		}

	}

}
