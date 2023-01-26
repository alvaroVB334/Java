package Actividades;

import java.util.Scanner;

public class EjercicioLink01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double lado;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce el valor del lado del cuadrado: ");
		lado = teclado.nextDouble();

		System.out.println("El valor del perimetro es: " + (lado * 4));

	}

}
