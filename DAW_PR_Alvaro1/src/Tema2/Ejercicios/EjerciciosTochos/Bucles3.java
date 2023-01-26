package Tema2.Ejercicios.EjerciciosTochos;

import java.util.Scanner;

public class Bucles3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Realizar un programa que lea un número de 5 cifras y muestre la posición de
		 * la cifra mayor. (hay que utilizar conversión para pasar de char a int cada
		 * posición o en su caso ir dividiendo para sacar el número en cada posición).
		 * El programa tiene que comprobar que lo leído es un número.
		 * 
		 */

		int num = 0, numGrande = 0, numGrande2 = 0, j = 0; // Declaramos e inicializamos las variables
		char cnum; // Tambien un char para estudiar cada número de forma individual

		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce el numero de 5 cifras: "); // Recogemos el num de 5 cifras
		num = teclado.nextInt();

		String numCadena = Integer.toString(num); // Creamos un string al cual de valor le damos el entero anterior,
													// pero en forma de string

		for (int i = 0; i < 5; i++) { // Bucle de 0 a 5 (el total de caracteres)
			cnum = numCadena.charAt(i); // Aqui decimos que el char ya declarado vaya cogiendo el caracter concreto del
										// string según el valor del contador
			numGrande = Character.getNumericValue(cnum); // le damos valor a este entero a raiz del char
			if (numGrande > numGrande2) { // lo comparamos y vamos guardando en numGrande2 todo el rato el valor mas
											// grande
				numGrande2 = numGrande; // así como el valor de la i en otra variable aparte, la cual nos indica la
										// posición en la cadena
				j = i;
			}

		}
		System.out.println("La posición del numero mas grande es: Posición número " + (j + 1)); // Imprimimos la
																								// posición +1 siempre
																								// pk el char empieza en
																								// 0
	}

}
