package Tema2.Ejercicios;

public class While5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Mostrar los múltiplos de 8 hasta el valor 500. Debe aparecer en pantalla 8 -
		 * 16 - 24, etc.
		 */
		int i = 0; // Declaramos e inicializamos el contador

		while (i <= 62) { // Hacemos el bucle hasta 62, debido a que 62·8= 496, el ultimo multiplo de 8
							// que no se pasa de 500
			System.out.println(i * 8 + ""); // Imprimimos los multiplos de 8 * contador y hacemos que avance
			i++;
		}

	}

}
