package Tema2.Ejercicios;

import java.util.Scanner;

public class While1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Escribir un programa que solicite ingresar 10 notas de alumnos y nos informe
		 * cuántos tienen notas mayores o iguales a 7 y cuántos menores.
		 */

		int i = 0, edad, mayor = 0, menor = 0; // Declaramos e inicializamos las variables
		Scanner teclado = new Scanner(System.in);

		System.out.print("Pon las notas: ");

		while (i < 10) { // Creamos un bucle hasta que el contador llegue a 10, el max de edades pedidas
							// y dentro del bucle vamos calculando
							// Cuales de ellas son mayores o menores que 7 y subiendo los contadores
							// correspondientes
			edad = teclado.nextInt();

			if (edad < 7) {
				menor++;
			} else {
				mayor++;
			}

			i++;
		}

		System.out.println("Número de notas mayores que 7: " + mayor + ". Y menores: " + menor); // Al final los
																									// imprimimos
	}

}
