package Tema2;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ejemplocondicionalesventana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cursoAlumno;
		String sEdad = "", sNota = "", nombre;
		float notaAlumno;
		int edadAlumno;

		Scanner teclado = new Scanner(System.in);

		nombre = JOptionPane.showInputDialog(null, "Nombre", "Introduce tu Nombre", JOptionPane.QUESTION_MESSAGE);
		sNota = JOptionPane.showInputDialog(null, "Nota", "Introduce tu Nota", JOptionPane.QUESTION_MESSAGE);
		sEdad = JOptionPane.showInputDialog(null, "Edad", "Introduce tu Edad", JOptionPane.QUESTION_MESSAGE);
		cursoAlumno = JOptionPane.showInputDialog(null, "Curso", "Introduce tu Curso", JOptionPane.QUESTION_MESSAGE);

		notaAlumno = Float.parseFloat(sNota);

		edadAlumno = Integer.parseInt(sEdad);

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
	} // Cierra main
}
