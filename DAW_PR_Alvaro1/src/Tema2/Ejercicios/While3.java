package Tema2.Ejercicios;

import java.util.Scanner;

public class While3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * En una empresa trabajan n empleados cuyos sueldos oscilan entre $100 y $500,
		 * realizar un programa que lea los sueldos que cobra cada empleado e informe
		 * cuántos empleados cobran entre $100 y $300 y cuántos cobran más de $300.
		 * Además el programa deberá informar el importe que gasta la empresa en sueldos
		 * al personal.
		 */
		int n, i = 0, x = 0, y = 0; // Inicializamos y declaramos las variables
		Scanner teclado = new Scanner(System.in);
		float sueldo, total = 0;

		System.out.print("Introduce cuantos empleados cobran: "); // Le pedimos el limite del bucle
		n = teclado.nextInt();

		System.out.print("Ve introduciendo los sueldos: ");

		while (i < n) { // Mientras el contador sea menor que el limite
			sueldo = teclado.nextFloat();

			if (sueldo >= 100 & sueldo <= 300) { // Ponemos que si el suueldo esta entre 100 y 300 aumenta un contador
				x++;
			}
			if (sueldo > 300) { // si es mayor que 300 aumenta otro
				y++;
			}
			total = total + sueldo; // acumulamos el total de sueldo
			i++;

		}

		System.out.println("Empleados que cobran entre 100 y 300: " + x + "\nEmpleados que cobran mas de 300: " + y);
		System.out.println("Importe total en sueldos: " + total);

	}

}
