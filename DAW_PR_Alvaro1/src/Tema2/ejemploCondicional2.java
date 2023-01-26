package Tema2;

import java.util.Scanner;

/*El programa leera por teclado  la nota de un alumno
 * su nombre, edad y curso, mostrara SUSPENSO,SUFICIENTE
 * ,BIEN,NOTABLE Y SOBRESALIENTE. dependiendo de la nota
 * Si es de tercero y tiene sobresaliente o es mayor de edad se mostrará el mensaje
 * "APROBADO POR EXCELENCIA". A todos los que tengan sobresaliente mayores de 14 años tendran beca
 * se pide que el código esté bien comentado, variables nombradas formato adecuado,etc..
 */

public class ejemploCondicional2 {

	public static void main(String[] args) {

		float notaAlumno; // Definimos las variables, float para notas, int para la edad y String para el
							// curso
		int edadAlumno;
		String cursoAlumno;
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce tu Nota: "); // Aquí recogemos los diversos valores de las Variables
		notaAlumno = teclado.nextFloat();

		System.out.print("Introduce tu curso: ");
		cursoAlumno = teclado.next();

		System.out.print("Introduce tu edad: ");
		edadAlumno = teclado.nextInt();

		if (notaAlumno < 5) { // Distrbuimos las notas en intervalos 0-5 5-6 6-7 7-9 9-10
								// Para mostrar así los distintos mensajes
			System.out.println("Estás SUSPENSO :(");
		}

		if (notaAlumno >= 5 && notaAlumno < 6) {

			System.out.println("Tu nota es Suficiente");
		}

		if (notaAlumno >= 6 && notaAlumno < 7) {

			System.out.println("Tu nota es BIEN");
		}

		if (notaAlumno >= 7 && notaAlumno < 9) {

			System.out.println("Tu nota es Notable");
		}

		if (notaAlumno >= 9) { // Dentro del sobresaliente añadimos 2 if mas, en los cuales en el primero,
								// Si es de tercerp o tiene +18 años sera aprobado por excelencia y el segundo
			System.out.println("Enhorabuena, SOBRESALIENTE"); // Si tiene +14 años habrá conseguido la beca
			if (cursoAlumno.toLowerCase().equals("tercero") || edadAlumno >= 18) {
				System.out.println("Ademas Aprobado por EXCELENCIA");
			}
			if (edadAlumno >= 14) {
				System.out.println("Y además has conseguido la BECA");
			}

		}

		teclado.close();
	}
} // Cierra main
