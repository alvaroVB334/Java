package Tema2Bucles;

import java.util.Scanner;

public class while2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//programa que lea un numero y muestre su tabla de multiplicar

		int i = 0;
		float num;
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce un número: ");
		num = teclado.nextFloat();

		while (i <= 10) {
			System.out.println(+num + " x " + i + " = " + (num * i));
			i = i + 1; // se puede poner i++;
		}
		teclado.close();
	}

}
