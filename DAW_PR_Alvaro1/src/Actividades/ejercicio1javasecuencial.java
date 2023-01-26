package Actividades;

import java.util.Scanner;

public class ejercicio1javasecuencial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float num1, num2, num3, num4;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce Cuatro numeros: ");
		num1 = teclado.nextFloat();
		num2 = teclado.nextFloat();
		num3 = teclado.nextFloat();
		num4 = teclado.nextFloat();
//---------------------------------------------------------------------------------------------

		System.out.println("La suma de los dos primeros es: " + (num1 + num2));
		System.out.println("La resta de los dos primeros es: " + (num1 - num2));
		System.out.println("La multiplicación de los dos primeros es: " + (num1 * num2));
		System.out.println("La división de los dos primeros es: " + (num1 / num2));

		if (num3 >= num4) {

			System.out.println("El maximo entre " + num3 + " y " + num4 + " es: " + num3);
		} else {
			System.out.println("El maximo entre " + num3 + " y " + num4 + " es: " + num4);
		}
//--------------------------------------------------------------------------------------------		 

		if (num3 < num4) {

			System.out.println("El min entre " + num3 + " y " + num4 + " es: " + num3);
		}

		else {
			System.out.println("El min entre " + num3 + " y " + num4 + " es: " + num4);
		}

		System.out.println("La media entre " + num3 + " y " + num4 + " es: " + ((num3 + num4) / 2));
	}

}
