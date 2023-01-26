package Tema2.Ejercicios;

import java.util.Scanner;

public class for1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Confeccionar un programa que lea n pares de datos, cada par de datos
		 * corresponde a la medida de la base y la altura de un triángulo. El programa
		 * deberá informar: a) De cada triángulo la medida de su base, su altura y su
		 * superficie. b) La cantidad de triángulos cuya superficie es mayor a 12.
		 */

		int n, cantidad = 0; // Inicializamos las variablkes
		float base, altura, superficie;
		Scanner teclado = new Scanner(System.in);

		System.out.print("¿Cuantos pares de datos vas a introducir?: "); // Le pedimos el limite del for
		n = teclado.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.print("Introduce la medida de la base del triangulo número " + (i + 1) + ": "); // Le vamos
																										// pidiendo la
																										// base del
																										// triangulo
			base = teclado.nextFloat();

			System.out.print("Introduce la medida de la altura del triangulo número " + (i + 1) + ": "); // y su altura
			altura = teclado.nextFloat();

			superficie = (base * altura) / 2; // Calculamos su supermificie

			System.out.println("\n------------------------------- \nTriangulo Número " + (i + 1) + "\nBase: " + base
					+ "\nAltura: " + altura + "\nSuperficie: " + superficie); // imprimimos todo

			if (superficie > 12) { // en caso de que la superifice sea mayor que 12, aumentamos un contador de los
									// mismos
				cantidad++;
			}

		}

		System.out.println(
				"\n............................... \nEl total de triangulos cuya superficie es mayor que 12 es: " // Imprimimos
																													// dicho
																													// contador
						+ cantidad);
		teclado.close();
	}

}
