package Tema2.Ejercicios;

public class While4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Realizar un programa que imprima 25 términos de la serie 11 - 22 - 33 - 44,
		 * etc. (No se ingresan valores por teclado)
		 */

		int i = 1; // Declaramos el contador

		while (i <= 25) { // del 1 al 25 imprimimos la serie de multiplos de 11, multiplicando el contador
							// por 11
			System.out.print(i * 11 + " ");
			i++; // Hacemos que el contador avance
		}
	}

}
