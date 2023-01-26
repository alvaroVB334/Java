package Tema2.Ejercicios;

import java.util.Scanner;

public class for8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int eMañana, eTarde, eNoche, tMañana = 0, tTarde = 0, tNoche = 0; // Inicializamos las variables
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce las edades del turno de mañana: "); // Hacemos tres bucles para introducir las
																			// edades según el turno
		for (int i = 0; i < 50; i++) {
			eMañana = teclado.nextInt();
			tMañana = tMañana + eMañana; // Luego en todas calculamos el total
		}
		tMañana = tMañana / 50; // Y fuera del bucle lo dividimos entre el censo de alumnos para calcular el
								// promedio

		System.out.println("Introduce las edades del turno de tarde: ");
		for (int i = 0; i < 60; i++) {
			eTarde = teclado.nextInt();
			tTarde = tTarde + eTarde;
		}

		tTarde = tTarde / 60;

		System.out.println("Introduce las edades del turno de noche: ");
		for (int i = 0; i < 110; i++) {
			eNoche = teclado.nextInt();
			tNoche = tNoche + eNoche;
		}

		tNoche = tNoche / 110;

		System.out.println(
				"\nPromedio de mañana: " + tMañana + "Promedio de tarde: " + tTarde + "\nPromedio de noche: " + tNoche); // Imprimimos
																															// cada
																															// promedio

		if (tMañana < tTarde && tTarde > tNoche) { // Noche mas pequeño
			System.out.println("El promedio mas pequeño es el de noche"); // Evaluamos cual de ellos es mas pequeño
																			// mediante ifs
		}

		if (tTarde < tNoche && tNoche > tMañana) { // Mañana mas pequeño
			System.out.println("El promedio mas pequeño es el de mañana");
		}

		if (tMañana < tNoche && tNoche > tTarde) { // Tarde mas pequeño
			System.out.println("El promedio mas pequeño es el de tarde");
		}

	}

}
