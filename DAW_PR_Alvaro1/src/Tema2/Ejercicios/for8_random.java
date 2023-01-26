package Tema2.Ejercicios;

public class for8_random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub - - - - En el ejercicio 8 del bucle for,
		// generar las edades de forma aleatoria,
		// y calcular las edades máximas y mínimas de cada turno y las edades máximas y
		// mínimas totales.

		int eMañana, eTarde, eNoche, tMañana = 0, tTarde = 0, tNoche = 0; // Inicializamos las variables

		System.out.println("Generando aleatoriamente edades del turno de mañana... "); // Hacemos tres bucles para
																						// introducir las
		// edades según el turno
		for (int i = 0; i < 50; i++) {
			eMañana = (int) (Math.random() * 100 + 1);
			tMañana = tMañana + eMañana; // Luego en todas calculamos el total
		}
		tMañana = tMañana / 50; // Y fuera del bucle lo dividimos entre el censo de alumnos para calcular el
								// promedio

		System.out.println("Generando aleatoriamente edades del turno de tarde... ");
		for (int i = 0; i < 60; i++) {
			eTarde = (int) (Math.random() * 100 + 1);
			tTarde = tTarde + eTarde;
		}

		tTarde = tTarde / 60;

		System.out.println("Generando aleatoriamente edades del turno de noche... ");
		for (int i = 0; i < 110; i++) {
			eNoche = (int) (Math.random() * 100 + 1);
			tNoche = tNoche + eNoche;
		}

		tNoche = tNoche / 110;

		System.out.println("\nPromedio de mañana: " + tMañana + "\nPromedio de tarde: " + tTarde
				+ "\nPromedio de noche: " + tNoche); // Imprimimos
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
