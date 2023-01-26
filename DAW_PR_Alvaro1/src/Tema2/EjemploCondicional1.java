package Tema2;

import java.util.Scanner;

public class EjemploCondicional1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad = 0;
		float sueldo = 0.0f;
		String nombre, password, estadoCivil;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce tu nombre: ");
		nombre = teclado.nextLine();

		System.out.print("Introduce tu Contraseña: ");
		password = teclado.nextLine();

		System.out.print("Introduce tu edad: ");
		edad = teclado.nextInt();

		System.out.print("Introduce tu sueldo: ");
		sueldo = teclado.nextFloat();

		System.out.print("Introduce tu Estado civil(Soltero,casado,divorciado,jugadorLoL): ");
		estadoCivil = teclado.nextLine();

		// La edad par (si un numero es par su división entre 2 da de resto 0)

		if (edad % 2 == 0) {
			System.out.println("Pase por la puerta roja");
		}

		// el nombre no puede tener mas de 8 caracteres
		if (nombre.length() > 8) {
			System.out.println("El nombre no puede tener mas de 8 carácteres");
		}

		else {
		}

		// La contraseña tiene que cumplir +10 caracteres, y debe empezar por 1

		if (password.length() > 10 && password.charAt(0) == 1) { // ->>>>> el && significa "y" y el || significa "o".
			System.out.println("La contraseña cumple las condiciones");
		}

		// De extra el empleado cobra 100 euros de base
		// si es soltero y menor de 40 cobra ademas 200eu
		// Los mayores de 40 cobraran 400eu
		// Para los menores:
		// los divorciados mayores de 30 años o los que tengan sueldo inferior a 1000
		// cobraran 500
		// a los zombies les quitamos 2000 euros para que se vayan a la competencia uwu

		int extra = 100;// De extra el empleado cobra 100 euros de base

		if (edad < 40 && estadoCivil.toLowerCase().equals("soltero")) { // si es soltero y menor de 40 cobra ademas
																		// 200eu
			// estadoCivil.toLowerCase().equals("soltero") equals lee la cadena de texto
			// para ver si es igual que la que ponemos ahi, y toLowerCase lo convierte a
			// minuscula para evitar errores.
			extra = extra + 200;
		}

		if (edad > 40) {
			extra += 400; // incrementamos la extra en 400
		} else { // la edad es menor que 40

			if (estadoCivil.toLowerCase().equals("soltero")) {
				extra = extra + 200;
			}

			if (estadoCivil.toUpperCase().equals("Divorciado") && edad > 30 || sueldo < 1000)
				extra = extra + 500;

			if (estadoCivil.toUpperCase().equals("Zombie"))
				extra = extra - 2000;
		}

	} // ciera el main

}
