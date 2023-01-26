package Tema1;

import java.util.Scanner;

public class EjemploCadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Definimos las variables

		String cad1, cad2;
		int inicio, fin;

		Scanner teclado = new Scanner(System.in);

		// leemos los datos x teclado

		System.out.print("Introduce la primera cadena (string): ");
		cad1 = teclado.next();

		System.out.print("Introduce la segunda cadena (string): ");
		cad2 = teclado.next();

		System.out.print("Introduce el inicio: ");
		inicio = teclado.nextInt();

		System.out.print("Introduce el fin: ");
		fin = teclado.nextInt();

		// Probamos algunas funciones de cadenas

		System.out.println("La longitud de la primera cadena es: " + cad1.length());

		// concatenación
		System.out.println(cad1.concat(" Es la primera cadena"));

		System.out.println("El Carácter en la posición " + inicio + " es " + cad1.charAt(inicio));

		System.out.println("El Carácter en la posición " + fin + " es " + cad2.charAt(fin));

		// SubString nos corta la cadena por las posiciones que le indicamos
		String subCadena = cad1.substring(inicio, fin);
		System.out.println("La subcadena es: " + subCadena);

		// El equals compara las cadenas para ver si ponen lo mismo
		System.out.println("El primer string es igual al segundo? " + cad1.equals(cad2));

		System.out.println("Posición de la 2 cadena en la 1: " + cad1.indexOf(cad2));

	}

}
