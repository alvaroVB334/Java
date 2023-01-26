package Tema4;

import java.util.ArrayList;
import java.util.List;

public class ejemploListas1 {

	public static void main(String[] args) {
		// Se pone new ArrayList en list pk es su clase hija
		List<Integer> listaNumeros = new ArrayList<Integer>(); // No se pueden poner dentro de la lista tipos de datos
																// basicos de java como int
		// hay que poner su equivalencia a objeto, en este caso Integer
		ArrayList<String> listaNombres = new ArrayList<String>();

		// Añadir elementos con add
		for (int i = 0; i < 10; i++) {
			listaNumeros.add((int) (Math.random() * 100));
		}

		// Accedemos a un elemento con get

		System.out.println("Elemento de la posicion 5: " + listaNumeros.get(5));

		// Contiene un elemento
		if (listaNumeros.contains(4))
			System.out.println("Contiene el 4");

		System.out.println(listaNumeros.toString());

		// Introducir numeros
		listaNumeros.add(100); // Añadir elemento, a la ultima posición

		listaNumeros.add(6, 69); // Introducimos en una posicion especifica
		System.out.println(listaNumeros.toString());

		System.out.println(listaNumeros.size()); // Numero de elementos
	}

}
