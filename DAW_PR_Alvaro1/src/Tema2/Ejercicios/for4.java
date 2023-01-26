package Tema2.Ejercicios;

import java.util.Scanner;

public class for4 {

	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Confeccionar un programa que permita ingresar un valor del 1 al 10 y nos
		 * muestre la tabla de multiplicar del mismo (los primeros 12 términos) Ejemplo:
		 * Si ingreso 3 deberá aparecer en pantalla los valores 3, 6, 9, hasta el 36.
		 */

		float num;
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce un número: "); // Le pedimos que ingrese el numero del cual quiera saber su tabla
													// hasta el 12
		num = teclado.nextFloat();

		for (int i = 0; i < 13; i++) { // desde i=0 mientras i<13 (hasta i=12),i++ (aumentamos en 1 el contador)
			System.out.println(num + " x " + i + " = " + (num * i)); // Vamos imprimiendo el numero en concreto por el
																		// contador el cual aumenta hasta 12
		}
		teclado.close();
	}

}
