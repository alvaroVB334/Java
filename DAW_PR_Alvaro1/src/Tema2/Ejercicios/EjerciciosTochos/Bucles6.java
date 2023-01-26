package Tema2.Ejercicios.EjerciciosTochos;

import java.util.Scanner;

public class Bucles6 {

	public static void main(String[] args) {

		// Realizar un programa que leyendo una frase muestre el número de palabras que
		// empiezan por mayúscula
		// y cuantas por minúscula (función de Character isUpperCase()). Cuántas
		// palabras hay y cuál es la palabra
		// de mayor longitud.

		Scanner teclado = new Scanner(System.in);
		String frase = ""; // Declaramos las variables
		int nmayusculas = 0, nminus = 0, numpalabras = 1;

		int plarga = 0;
		String pmaslarga = "";
		System.out.println("Introduce una frase: ");
		frase = teclado.nextLine();

		int n = frase.length(); // n = total de caracteres de la frase = limite del for

		String[] partes = frase.split(" "); // Dividimos en subcadenas dentro de array usando la función split

		if (Character.isUpperCase(frase.charAt(0)))
			nmayusculas++; // en caso de que el primer caracter sea mayuscula se sumara 1 al contador de
							// mayusculas, sino al de minusculas
		else
			nminus--;

		for (int i = 0; i < n; i++) // Iniciamos el bucle que irá inspeccionando cada elemento de la frase
		{

			if (frase.charAt(i) == ' ') // Entendemos que cada espacio en la frase indica separaciones de palabras, en
										// ese caso sumamos +1 al contador de palabras
			{
				numpalabras++;
				if (Character.isUpperCase((frase.charAt(i + 1)))) // dentro de ese if valoramos que si el caracter
																	// siguiente al espacio es mauyuscula
					nmayusculas++; // volvemos a sumar +1 al contador de mayus, sino al de minusculsa
				else
					nminus++;
			}

		}
		// Una vez conocido el numero de palabras creamos el buclen que nos permitirá
		// ver cual es la mas grande de todas
		for (int x = 0; x < numpalabras; x++) {
			// Si el length de las subcadenas es mayor a el de el mayor length comprobado
			// entonces entra en el bucle
			// y hace que el INT plarga sea igual al length de la subcadena, luego pmaslarga
			// guarda el valor
			// de la subcadena[i]
			if (partes[x].length() > plarga) {
				plarga = partes[x].length();
				pmaslarga = partes[x];
			}
		}
		System.out.println("Existen " + nmayusculas + " palabras que empiezan con mayusculas");
		System.out.println("Existen " + nminus + " palabras que empiezan minusculas");
		System.out.println("Existen " + numpalabras + " palabras en la frase");
		System.out.println("La palabra mas larga es " + pmaslarga);

		teclado.close();
	}
}
