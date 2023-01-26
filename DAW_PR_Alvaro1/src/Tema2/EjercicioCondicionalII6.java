package Tema2;

import java.util.Scanner;

public class EjercicioCondicionalII6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cabello, ojos, nariz, boca; // Inicializamos las variables
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce el tipo de cabello (Rizado, liso, peinado): ");
		cabello = teclado.nextLine();
		cabello.toLowerCase(); // Pedimos que se introduzcan por teclado
								// y convertimos todas a minusculas para evitar errores en los if
		System.out.print("Introduce el tipo de ojos (Cerrados, Redondos, Estrellados): ");
		ojos = teclado.nextLine();
		ojos.toLowerCase();

		System.out.print("Introduce el tipo de Nariz (Aplastada, respingona, puntiaguda): ");
		nariz = teclado.nextLine();
		nariz.toLowerCase();

		System.out.print("Introduce el tipo de Boca (Normal,Bigote, Dientes): ");
		boca = teclado.nextLine();
		boca.toLowerCase();

		if (cabello.equals("rizado")) { // Si el cabello es rizado entonces lo cambiamos por ese
			cabello = "@@@@@@";
		} else {
			if (cabello.equals("liso")) { // sino, en caso de ser liso, ese
				cabello = "VVVVVV";
			} else {
				cabello = "XXXXXX"; // sino el que queda
			}
		}

		if (ojos.equals("cerrados")) {
			ojos = "-   -";
		} else { // Aplicamos esta lógica con todas las partes de la cara
			if (ojos.equals("redondos")) {
				ojos = "O    O";
			} else {
				ojos = "*    *";
			}
		}

		if (nariz.equals("aplastada")) {
			nariz = "  0  ";
		} else {
			if (nariz.equals("respingona")) {
				nariz = "  C  ";
			} else {
				nariz = "  V  ";
			}
		}

		if (boca.equals("normal")) {
			boca = "  -  ";
		} else {
			if (boca.equals("bigote")) {
				boca = ".....";
			} else {
				boca = "wwwww";
			}
		}
		// Al final simplemente imprimimos todos en el orden de la cara
		System.out.println("Hemos realizado el retrato robot-> ");
		System.out.println(cabello);
		System.out.println(ojos);
		System.out.println(nariz);
		System.out.println(boca);

	}

}
