package Tema2;

import java.util.Scanner;

public class EjercicioCondicional3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1; // Defino el entero num1 y el string snum1
		String snum1;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce un numero entero de 1 o 2 dígitos: "); // recogemos el valor del número entero por
																			// teclado
		num1 = teclado.nextInt();

		snum1 = Integer.toString(num1); // lo convierto a string y lo almaceno en el string snum1

		if (snum1.length() == 1) { // dentro de la condición se calcula el numero de dígitos del string
			System.out.println("El número tiene un digito");
		}

		if (snum1.length() == 2) {
			System.out.println("El número tiene dos dígitos");
		}

	} // El programa se podría hacer directamente sin condiciones ->
		// -> System.out.println("El número de digitos es: "+snum1.length());

}
