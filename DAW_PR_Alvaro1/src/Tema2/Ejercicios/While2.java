package Tema2.Ejercicios;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Se ingresan un conjunto de n alturas de personas por teclado. Mostrar la
		// altura promedio de las personas.

		int n = 0, i = 0; // Declaramos e inicializamos las variables
		float altura, sumaprom = 0;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce el número de alturas: "); // Le pedimos cual será el limite del bucle
		n = teclado.nextInt();

		System.out.print("Ve introduciendo las alturas: ");

		while (i < n) { // Creamos un bucle desde el contador que parte de 0 hasta el limite impuesto

			altura = teclado.nextFloat(); // En el bucle vamos recogiendo las alturas y las vamos sumando al total
			sumaprom = sumaprom + altura;
			i++;
		}
		System.out.println("El promedio de las " + n + " alturas es: " + (sumaprom / n)); // Que dividiremos para
																							// calcular la media en el
																							// sysout.

	}

}
