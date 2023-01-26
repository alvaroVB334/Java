package Tema2Bucles;

public class EjemplosArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Leer n edades y calcular la edad max, min y la cantidad de mayores de edad y
		// jubilados

		int edad[]; // array de enteros que guardará la edad
		int media = 0;
		int maximo = Integer.MIN_VALUE, minimo = Integer.MAX_VALUE;
		int numMayores = 0, numJubilados = 0;

		// Una caracteristica del array es que hay que definir el tamaño, el cual es
		// fijo
		// Definimos el tamaño

		edad = new int[20]; // el array puede almacenar 20 enteros

		for (int i = 0; i <= 19; i++) { // en vez de ir uno a uno rellenamos todos los valores con un bucle
			edad[i] = (int) (Math.random() * 100);
			System.out.println("edad generada en la posición " + i + " : " + edad[i]);
		}

		for (int i = 0; i <= 19; i++) { // sumamos todas las edades para la posteior división entre 20
			media = media + edad[i];

			if (edad[i] > maximo) { // Calculamos el maximo, basicamnte esto recorre todos los elementos del array
									// viendo cual es el max
				maximo = edad[i];
			}
			if (edad[i] < minimo) {
				minimo = edad[i];
			}
			if (edad[i] >= 18) {
				numMayores++;
			}
			if (edad[i] >= 65) {
				numJubilados++;
			}
		}

		media = media / edad.length; // length en los arrays es la cantidad de elementos que tiene dentro

		System.out.println("La media es: " + media);
		System.out.println("El Máximo es: " + maximo);
		System.out.println("El Mínimo es: " + minimo);
		System.out.println(
				"El número de mayores de edad es: " + numMayores + " Y el numero de jubilados: " + numJubilados);
	}

}
