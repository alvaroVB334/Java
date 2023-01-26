package Tema2.Ejercicios.EjerciciosTochos;

import java.util.Scanner;

public class Bucles1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Realizar un programa que lea x números (se lee de teclado) , compruebe que
		 * sean positivos y menores de 10. Muestre un menú para seleccionar la operacion
		 * suma o la multiplicación, y nos muestre el resultado
		 * 
		 */
		float num, resultadoSuma = 0, resultadoMult = 1, resultado; // Declaramos las variables
		int n;
		Scanner teclado = new Scanner(System.in);
		String tipoOp = "";

		System.out.println( // Creamos una pequeña interfaz para el "menú" en la que se deberá introducir
							// por teclado si Suma o multiplicación
				"----------------\nIntroduce el tipo de Operación:\na) Suma\nb) Multiplicacion\n-----------------");
		tipoOp = teclado.nextLine();
		tipoOp.toLowerCase();

		System.out.print("¿Cuantos números buscas leer?: "); // Preguntamos cuantos números busca leer
		n = teclado.nextInt();

		System.out.print("Ve introduciendo los numeros: "); // Le pedimos que vaya introduciendo los numeros

		for (int i = 0; i < n; i++) {
			num = teclado.nextFloat(); // Los cuales almacenaremos en un Scanner dentro del bucle
			if (tipoOp.equals("suma")) { // el cual parte de 0 mientras sea menor que n y avanza 1 en cada sucesión
				resultadoSuma = resultadoSuma + num;

			} else if (tipoOp.equals("multiplicacion")) { // Dentro del bucle en cada ciclo comprobamos si es suma o
															// multiplicación en caso de ser suma
				resultadoMult = resultadoMult * num; // Sumamos al anterior valor de resultado el num y multiplicación
														// igual
			} // Con la diff. de que resultSum esta inicializado en 0 y el de la
				// multiplicación en 1, para evitar errores

		}

		tipoOp.toLowerCase(); // este otro tolowerCase está porque al quitarlo no me ejecuta los siguientes
		// if, como si se reconvirtiera a Mayus

		if (tipoOp.equals("suma")) { // si el usuario ha introducido suma mostramos el resultado de la suma
			System.out.println("El resultado de la Suma es: " + resultadoSuma);

		} else if (tipoOp.equals("multiplicacion")) { // si ha introduciedo multiplicación pues el de la multiplicación
			System.out.println("El resultado de la Multiplicación es: " + resultadoMult);
		}

	}

}
