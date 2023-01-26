package Tema3.Objetos.Coche;

import java.util.Scanner;

public class cochePruebas {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int velocidad, porcentaje;
		String color;

		Coche Cocheprueba = new Coche();

		System.out.print("Introduce tu velocidad inicial y el porcentaje que quieres acelerar: ");
		velocidad = teclado.nextInt();
		porcentaje = teclado.nextInt();

		System.out.print("Introduce de que color quieres pintar el coche(Azul, Rojo, Amarillo, Negro ,Blanco): ");
		color = teclado.next();

		System.out.println("Tu velocidad actual es: " + Cocheprueba.Acelerar(velocidad, porcentaje));

		System.out.print("El color de tu coche es: " + Cocheprueba.pintar(color));
	}

}
