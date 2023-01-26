package Tema2Bucles;

import java.util.Scanner;

public class EjemploArraysNombres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// El programa busca un nombre en un array de nombres y nos dice si está o no

		String alumnos[] = { "Daniel", "Ivan", "Natan", "Alvaro", "Francisco", "Miguel" };
		String nomBuscar = "";
		Scanner teclado = new Scanner(System.in);
		int pos = -1;

		System.out.print("Introduce el nombre a buscar: ");
		nomBuscar = teclado.nextLine();

		int i = 0;
		while (i < 6 && pos == -1) {

			if (nomBuscar.equals(alumnos[i])) {
				pos = i;
			}
			i++;
		}

		if (pos != -1) {
			System.out.println("El nombre está en la lista, en la posición " + (pos + 1));
		} else {
			System.out.println("El nombre NO está en la lista");
		}

		teclado.close();
	} // main

}
