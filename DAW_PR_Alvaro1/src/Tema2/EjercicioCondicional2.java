package Tema2;

import java.util.Scanner;

public class EjercicioCondicional2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float nota1, nota2, nota3, media; // Definimos las notas y la media

		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce las 3 notas: ");

		nota1 = teclado.nextFloat();
		nota2 = teclado.nextFloat(); // Recogemos el valor de las 3 directamente
		nota3 = teclado.nextFloat();

		media = (nota1 + nota2 + nota3) / 3; // Calculamos la media

		if (media >= 7) { // Si la media es mayor que 7 promociona, sino, NO >:(
			System.out.println("Promocionando!");
		} else {
			System.out.println("No promociona :(");
		}

	}

}
