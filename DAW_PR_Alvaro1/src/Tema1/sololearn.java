package Tema1;

import java.util.Scanner;

public class sololearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//El código dado toma una cadena como entrada y la convierte en una matriz de caracteres , que contiene letras de la cadena como elementos. 

		Scanner teclado = new Scanner(System.in);
		String cadena;

		System.out.print("Introduce la cadena: ");
		cadena = teclado.nextLine();

		char arrayChar[] = new char[cadena.length()];

		for (int i = 0; i < cadena.length(); i++) {
			arrayChar[i] = cadena.charAt(cadena.length() - 1 - i);
		}
		for (int j = 0; j < arrayChar.length; j++) {
			System.out.print(arrayChar[j]);
		}
	}

}
