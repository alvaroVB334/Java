package Tema1;

public class Media3NumerosAleatorios {

	public static void main(String[] args) {

		int a, b, c, media; // Inicializamos las variables

		a = (int) (Math.random() * 100);
		System.out.println("El valor del primer número es: " + a);// Le otorgamos a cada una un valor
		b = (int) (Math.random() * 100);
		System.out.println("El valor del segundo número es: " + b);// Entero al azar de 0 a 100 y lo mostramos en
																	// pantalla
		c = (int) (Math.random() * 100);
		System.out.println("El valor del tercer número es: " + c);

		media = (a + b + c) / 3; // calculamos la media y la mostramos

		System.out.println("La media de los 3 numeros es: " + media);

	}

}
