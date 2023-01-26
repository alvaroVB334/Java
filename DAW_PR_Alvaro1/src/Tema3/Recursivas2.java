package Tema3;

import java.util.Scanner;

public class Recursivas2 {

	public static void main(String[] args) {
		// Crear una función recursiva que reciba un número entero y devuelva el
		// número con los dígitos invertidos, por ejemplo si recibe 23456 devolverá
		// 65432

		Recursivas2 numInv = new Recursivas2();

		Scanner teclado = new Scanner(System.in);
		int num, inv = 0;

		System.out.print("Introduce un número entero: ");
		num = teclado.nextInt();

		System.out.println("El número invertido es: " + numInv.invertido(num, inv));
	}

	int invertido(int num, int inv) {
		if (num > 0) {
			return invertido(num / 10, num % 10 + inv * 10);
		} else {
			return (inv);
		}

	}
}
