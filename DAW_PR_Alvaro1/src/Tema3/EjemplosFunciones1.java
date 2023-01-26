package Tema3;

import java.util.Date;

public class EjemplosFunciones1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("La suma de 4 y 5 es:" + suma(4, 5)); // llamamos a la función y le llevamos esos numeros

		int numeros[] = { 3, 5, 8, 2, 3 };
		Date fecha = new Date();
		System.out.println("El max del array es: " + maxArray(numeros));

		System.out.println(fecha.getDate());

	}

	/**
	 * //Para javadoc / dos** y enter La función devuelve la suma de 2 nums
	 * 
	 * @param num1
	 * @param num2
	 * @return un entero con la suma
	 */
	public static int suma(int num1, int num2) { // int suma, el int es el tipo de dato que devuelve, lo de dentro del
													// () es los datos que coge o por asi decirlo las variables que se
													// decalaran
		int resultado = 0;
		resultado = num1 + num2;
		return resultado; // La función coge los numeros y los ejecuta
	}

	/**
	 * Devuelve la longitud de la cadena
	 * 
	 * @param cadena
	 * @return
	 */
	public static int longitudCad(String cadena) {

		return cadena.length();

	}

	/**
	 * Devuelve el max del array
	 * 
	 * @param listaNumeros
	 * @return
	 */
	public static int maxArray(int listaNumeros[]) {

		int max = Integer.MIN_VALUE;

		for (int i = 0; i < listaNumeros.length; i++) {

			if (listaNumeros[i] > max) {
				max = listaNumeros[i];
			}
		}
		return max;
	}

	/**
	 * Es una vocal o no?
	 * 
	 * @param letra
	 * @return
	 */
	static boolean esVocal(char letra) {

		if (Character.toLowerCase(letra) == 'a' || Character.toLowerCase(letra) == 'e'
				|| Character.toLowerCase(letra) == 'i' || Character.toLowerCase(letra) == 'o'
				|| Character.toLowerCase(letra) == 'u') {
			return true;
		} else {
			return false;
		}

	}

	static int[] concatenarListasNumeros(int listaNum1[], int listaNum2[]) {

		int tamTotal = listaNum1.length + listaNum2.length; // el tamaño del array final es la suma del tamaño de los
															// arrays que recibimos como parametros en la función

		int arrayResultado[] = new int[tamTotal];

		for (int i = 0; i < listaNum1.length; i++) {
			arrayResultado[i] = listaNum1[i];
		}
		for (int i = 0; i < listaNum2.length; i++) {
			arrayResultado[i + listaNum1.length] = listaNum2[i];
		}

		return arrayResultado;
	}

	// Mostramos todos los elementos
	static void mostrarContenido(int listaNum[]) {
		int i = 0;
		while (i < listaNum.length) {
			System.out.println(listaNum[i]);
			i++;
		}
	}

	/**
	 * 
	 * @param longitud
	 * @return
	 */
	static int[] genListaNumeros(int longitud) { // Nos pasan la longitud como parametro

		int listaGenerada[] = new int[longitud]; // Recorremos la longitud de ese array y sustituimos todo por numeros
													// aleatorios

		for (int i = 0; i < listaGenerada.length; i++) {

			listaGenerada[i] = (int) (Math.random() * 100 + 1);
		}
		return listaGenerada;
	}

}
