package Tema3;

import java.util.Scanner;

public class Funciones_Recursivas {

	public static void main(String[] args) {

	}

	public static long factorialRecursivo(int num) {/*
													 * 5!=5*4! 4!=4*3! ... n!=n*(n-1)! -> 1!=1 caso base
													 */

		if (num == 1)
			return 1;
		else
			return num * factorialRecursivo(num - 1);

	}

	long factorialIterativa(int num) {

		long resultado = 1;

		for (int i = 2; i <= num; i++) {
			resultado = resultado * i;
		}
		return resultado;
	}

	public static void menuOperaciones() {

		Scanner teclado = new Scanner(System.in);

		int op1, op2, opcion;

		System.out.println("MENU\n1.- Suma\n 2.- Resta\nOpción elegida: ");
		opcion = teclado.nextInt();

		System.out.println("Operando 1: ");
		op1 = teclado.nextInt();

		System.out.println("Operando 2: ");
		op2 = teclado.nextInt();

		switch (opcion) {

		case 1:
			System.out.println("El resultado es: " + (op1 + op2));
			break;

		case 2:
			System.out.println("El resultado es: " + (op1 - op2));
			break;
		default:
			System.out.println("Opción Incorrecta");

		}
		menuOperaciones();
		teclado.close();

	}

}
