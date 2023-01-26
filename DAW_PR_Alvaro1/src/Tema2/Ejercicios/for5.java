package Tema2.Ejercicios;

import java.util.Scanner;

public class for5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Realizar un programa que lea los lados de n triángulos, e informar: a) De
		 * cada uno de ellos, qué tipo de triángulo es: equilátero (tres lados iguales),
		 * isósceles (dos lados iguales), o escaleno (ningún lado igual) b) Cantidad de
		 * triángulos de cada tipo. c) Tipo de triángulo que posee menor cantidad.
		 */
		int n, x = 0, y = 0, z = 0; // x - contador equilatero y -
									// contador isosceles z - contador
									// escalenos
		float lado1, lado2, lado3;
		Scanner teclado = new Scanner(System.in);
		String menor = "";

		System.out.print("¿Cuantos triangulos quieres?: "); // le pedimos el limite del for
		n = teclado.nextInt();

		System.out.print("Ve introduciendo los lados: "); // Le decimos que vaya introduciendo los lados

		for (int i = 0; i < n; i++) {

			lado1 = teclado.nextFloat(); // los recogemos
			lado2 = teclado.nextFloat();
			lado3 = teclado.nextFloat();

			if (lado1 == lado2 && lado2 == lado3) { // Si los 3 lados son iguales es equilatero aumenta el contador del
													// mismo
				System.out.println("Triangulo equilatero");

				x++;
			} else {
				if (lado1 == lado2 && lado2 != lado3) { // Si varian en un lado solo, isosceles
					System.out.println("Triangulo isósceles");

					y++;
				} else {
					if (lado1 != lado2 && lado2 != lado3) { // Si varian en los 3 es escaleno
						System.out.println("Triangulo escaleno");

						z++;
					}
				}
			}
			System.out.print("Sigue introduciendo los lados del siguiente triangulo: ");
		}

		if (x > y && y > z) { // z pequeño //Fuera del bucle ya, comporobamos cual hay menor cantidad
			menor = "Escalenos";
		}

		if (x > z && z > y) { // y pequeño
			menor = "Isosceles";
		}

		if (y > z && z > x) { // x pequeño
			menor = "Equilateros";
		}

		System.out.println("\nCantidad total de triangulos: \n----------------\nEquilateros: " + x + "\nIsósceles: " + y
				+ "\nEscalenos: " + z + "\nHay menor cantidad de " + menor);

	}

}
