package Tema3;

import java.util.Scanner;

public class Recursivas1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Crear una función recursiva que reciba un número entero y devuelta el
		 * sumatorio desde 1 hasta dicho número, es decir, si recibe 8 devolvera el
		 * resultado de la suma 1+2+3+4+5+6+7+8
		 * 
		 */

		Scanner teclado = new Scanner(System.in);
		int num;

		System.out.print("Introduce un número del cual quieras saber el sumatorio: ");
		num = teclado.nextInt();

		System.out.println("El sumatorio de " + num + " es: " + SumatorioRecursivo(num));
	}

	public static int SumatorioRecursivo(int num) {

		if (num == 1) {
			return 1;
		} else
			return num + SumatorioRecursivo(num - 1);

	}
}
