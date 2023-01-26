package Tema1;

public class SumaDosNumerosAleatorios {

	public static void main(String[] args) {

		// Definición de variables
		int a;
		int b;
		int resultado;

		a = (int) (Math.random() * 100); // Dicha función entrega entrega valores en decimales, por eso se pone el (int
											// delante)
		// Además se mete entre parentesis la multiplicación *100 para que lo haga antes
		// de seleccionar el numero y no despues

		System.out.println("El numero 1 es: " + a);// Para mostrar la variable se saca de las comillas y se pone un +

		b = (int) (Math.random() * 100);// Ademas de eso, solo entrega valores entre 0 y 1, por lo que se le pone el
										// *100 para indicar del 0 al 100

		System.out.println("El numero 2 es: " + b);

		resultado = a + b;
		System.out.println("El resultado de la suma es " + resultado);
	}

}
