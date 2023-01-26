package Tema2;

import java.util.Scanner;

public class EjercicioCondicional13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float n1, n2, n3; // Inicializamos las variables
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce 3 números: ");
		n1 = teclado.nextFloat(); // Recogemos sus valores por teclado
		n2 = teclado.nextFloat();
		n3 = teclado.nextFloat();

		if (n1 < n2 && n1 < n3 && n2 > n3) { // n2 mayor, n1 menor
			System.out.println("El número mayor es " + n2 + " y el menor " + n1); // Evaluamos las 6 condiciones
																					// posibles que se pueden dar
		} else { // con if y else, a fin de optimizar el programa
			if (n1 < n3 && n2 < n3 && n2 > n1) { // n3 mayor, n1 menor
				System.out.println("El número mayor es " + n3 + " y el menor " + n1);
			} else {
				if (n1 > n2 && n1 > n3 && n2 > n3) { // n1 mayor, n3 menor
					System.out.println("El número mayor es " + n1 + " y el menor " + n3);
				} else {
					if (n2 > n1 && n2 > n3 && n1 > n3) { // n2 mayor, n3 menor
						System.out.println("El número mayor es " + n2 + " y el menor " + n3);
					} else {
						if (n1 > n2 && n1 > n3 && n3 > n2) { // n1 mayor, n2 menor
							System.out.println("El número mayor es " + n1 + " y el menor " + n2);
						} else {
							if (n3 > n1 && n3 > n2 && n1 > n2) { // n3 mayor, n2 menor
								System.out.println("El número mayor es " + n3 + " y el menor " + n2);
							}
						}
					}
				}
			}
		}
	}

}
