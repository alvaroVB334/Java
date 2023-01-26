package Tema1;

public class RestaPrimeroRespectoSegundo {

	public static void main(String[] args) {

		int a, b; // Introducimos variables

		a = (int) (Math.random() * 100); // Les indicamos a ambas mediante la función math para que obtengan
		// un numero entero del 1 al 100 al azar

		b = (int) (Math.random() * 100);

		System.out.println("El valor de el primer numero es: " + a);// Los mostramos en pantalla
		System.out.println("El valor de el segundo numero es: " + b);
		System.out.println("La resta del primero respecto del segundo es: " + (a - b));
		// Por último mostramos la resta y la realizamos dentro del println
	}

}
