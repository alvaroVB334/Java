package Actividades;

import java.util.Scanner;

public class ejerciciojava2Secuencial {

	public static void main(String[] args) {
		// TODO Auto-generated method stu

		int añoactual, edad, añorandom, edadrandom;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce el año actual: ");
		añoactual = teclado.nextInt();

		System.out.print("Introduce tu edad: ");
		edad = teclado.nextInt();

		System.out.print("Introduce un año en el que te gustaria saber tu edad: ");
		añorandom = teclado.nextInt();

		edadrandom = ((añorandom - añoactual) + edad);

		System.out.println("Naciste en el año: " + (añoactual - edad));
		System.out.println("Tu edad en el año " + añorandom + " Será de: " + edadrandom);

	}

}
