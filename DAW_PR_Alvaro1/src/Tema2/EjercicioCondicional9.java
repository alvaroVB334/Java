package Tema2;

import java.util.Scanner;

public class EjercicioCondicional9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Se ingresan tres valores por teclado, si todos son iguales se imprime la suma
		 * del primero con el segundo y a este resultado se lo multiplica por el
		 * tercero.
		 */
		float num1, num2, num3;
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce los 3 números: ");
		num1 = teclado.nextFloat();
		num2 = teclado.nextFloat();
		num3 = teclado.nextFloat();

		if (num1 == num2 || num1 == num3) {
			System.out.println(+((num1 + num2) * num3));
		} else {
			System.out.println("Lo siento los números no son iguales.");
		}

	}

}
