package Tema2;

import java.util.Scanner;

public class EjercicioCondicional7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float porcentaje, preguntas, respuestas; // Introducimos las variables como float para evitar
		Scanner teclado = new Scanner(System.in);// Problemas en la división

		System.out.print("Introduce el número de preguntas realizadas: ");
		preguntas = teclado.nextFloat(); // Recogemos el valor de las variables

		System.out.print("Introduce el número de respuestas correctas: ");
		respuestas = teclado.nextFloat();

		porcentaje = (respuestas / preguntas) * 100; // Calculamos el porcentaje de respuestas correctas

		if (porcentaje >= 90) { // Si el porcentaje es mayor o igual a 90 N.Maximo
			System.out.println("Nivel máximo");
		} else { // sino
			if (porcentaje < 90 && porcentaje >= 75) { // Si esta entre 90 y 75 incluido, medio
				System.out.println("Nivel medio");
			} else { // sino
				if (porcentaje >= 50 && porcentaje < 75) { // si esta entre 50 incluido y 75 Regular
					System.out.println("Nivel regular");
				} else {
					System.out.println("Fuera de nivel");// ninguna de las otras sentencias son ciertas
															// Ergo estás fuera de nivel
				}
			}
		}

	}

}
