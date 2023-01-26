package Tema2Bucles;

import java.util.Scanner;

public class while3 {

	final static int OPCION_INTRODUCIR = 1;
	final static int OPCION_CALCULAR = 2;
	final static int OPCION_SALIR = 3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Programa que lea por teclado varios usuarios,
//nombre,edad,renta,numero de suspensos, y calcule el derecho a beca
// esta se le dara si es menor de 25 años, renta <20k o menor de 18 y no suspendió ninguna
// El importe será un 10% de la renta, dividido entre el numero de suspensos en el primer caso
// 20% de la renta en el segundo.

		// Declaramos variables
		int edad = 0, nsuspensos = 0, opcionMenu = 0;
		double renta = 0.0, cuantiaBeca = 0.0;
		String nombre = "";
		Scanner teclado = new Scanner(System.in);

		while (opcionMenu != OPCION_SALIR) { // mientras el usuario no seleccione salir seguimos ejecutando

			if (opcionMenu == OPCION_INTRODUCIR) {

				System.out.print("Introduce tu edad: ");
				edad = teclado.nextInt();

				System.out.print("Introduce el número de suspensos: ");
				nsuspensos = teclado.nextInt();

				System.out.print("Introduce tu renta: ");
				renta = teclado.nextDouble();

				System.out.print("Introduce tu nombre: ");
				nombre = teclado.nextLine();

				if (opcionMenu == OPCION_CALCULAR) {

					if (edad < 25 && renta < 20000.0) {
						cuantiaBeca = renta * 0.1;
					}

					if (edad < 18 && nsuspensos == 0) {
						cuantiaBeca = renta * 0.2;
					}

					if (cuantiaBeca > 0.0) {
						System.out.println("Tu Beca fue concedida!! La cuantía es: " + cuantiaBeca);
					} else {
						System.out.println("Tu Beca no fue concedida, MOROSO");
					}
				}

			}

			System.out.println("\n\n\n\n\n\n\n\n *****************************************");
			System.out.println("                OPCIONES                   \n");
			System.out.println("                1.INTRODUCIR DATOS                   \n");
			System.out.println("                2.CALCULAR BECA                   \n");
			System.out.println("                3.FINALIZAR PROGRAMA                   \n");
			System.out.println("***************************************************\n");
			System.out.print("                OPCIÓN:                   \n");
			opcionMenu = teclado.nextInt();

		} // fin while menú

	}

}
