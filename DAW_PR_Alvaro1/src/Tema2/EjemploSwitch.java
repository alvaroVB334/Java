package Tema2;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class EjemploSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int edadAlumno, notaAlumno = 0;
		String sNota = "", sEdad = "";
		String mensaje;

		Scanner teclado = new Scanner(System.in);

		sNota = JOptionPane.showInputDialog(null, "Introduce tu Nota", "Edad", JOptionPane.QUESTION_MESSAGE);
		sEdad = JOptionPane.showInputDialog(null, "Introduce tu edad", "Edad", JOptionPane.QUESTION_MESSAGE);

		edadAlumno = Integer.parseInt(sEdad);
		notaAlumno = Integer.parseInt(sNota);

		switch (notaAlumno) {

		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			mensaje = "Has suspendido";
			break;
		case 5:
			mensaje = "Has sacado un suficiente";
			break;
		case 6:
			mensaje = "Has sacado un bien";
			break;
		case 7:
		case 8:
			mensaje = "Has sacado un notable";
			break;
		case 9:
		case 10:
			mensaje = "Has sacado un sobresaliente";
			break;

		}

	}
}
