package Tema2Bucles;

import java.util.Scanner;

public class EjemploWhileCalculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * El Programa le pondra al usuario suimas de dos numeros entre 1 y 60 le
		 * seguira poniendo sumas hasta que falle o tarde masd e 6s en contestar,
		 * mientras acierte le seguiran saliendo operaciones al final mostraran los
		 * aciertos
		 */

		int numAciertos = -1; // INicializamos a -1 para que si aciertas 0 no te marque 1 por haber entrado
								// una vez al bucle
		int num1 = 0, num2 = 0;
		long time;
		int resultado = 0;
		Scanner teclado = new Scanner(System.in);
		do {

			// Generamos los números aleatorios
			num1 = (int) (Math.random() * 60);
			num2 = (int) (Math.random() * 60);

			System.out.println(num1 + " + " + num2 + "? = ");

			time = System.currentTimeMillis(); // Iniciamos el contador de tiempo

			resultado = teclado.nextInt();

			time = System.currentTimeMillis() - time; // El tiempo en mili segundos que ha tardado en contestar

			numAciertos++;

		} while (resultado == (num1 + num2) && (time <= 5000));

		if (time > 5000) {

			System.out.println("Se te ha acabado el tiempo. ");
			System.out.println("Has acertado un total de" + numAciertos);
		}

		if (resultado != (num1 + num2)) {
			System.out.println("HAS FALLADO!!!! ERA: " + (num1 + num2));
			System.out.println("Has acertado un total de" + numAciertos);
		}

		teclado.close();

	}

}
