package Tema1;

import java.util.Scanner;

public class EjemploOperadoresFormato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int edad = 0;
		char sexo;
		String nombre = "";
		float sueldo;

		// Para leer usamos un scanner

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce tu Nombre:");
		// leemos un string (texto)

		nombre = teclado.next();

		System.out.println("Introduce tu edad:");
		edad = teclado.nextInt();

		System.out.println("Introduce tu sexo:");
		sexo = teclado.next().charAt(0);

		System.out.print("Introduce tu sueldo: "); // si pones print solo sin el ln se escribe a continuación sin salto
													// de linea
		sueldo = teclado.nextFloat();

		System.out.println("Tu nombre es: " + nombre);
		System.out.println("Tu edad es: " + edad);
		System.out.println("Tu sexo es: " + sexo);
		System.out.print("Tu sueldo es: " + sueldo);

	}

}
