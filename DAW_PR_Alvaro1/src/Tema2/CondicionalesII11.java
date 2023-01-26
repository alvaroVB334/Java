package Tema2;

import java.util.Scanner;

public class CondicionalesII11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int horas, minutos, segundos;
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce las horas: ");
		horas = teclado.nextInt();

		System.out.print("Minutos: ");
		minutos = teclado.nextInt();

		System.out.print("Segundos: ");
		segundos = teclado.nextInt();

		minutos = minutos + 1;
		segundos = segundos + 1;

		if (segundos == 60) {
			horas = horas;
			minutos = minutos + 01;
			segundos = 0;
		}

		if (minutos == 60) {
			horas = horas + 01;
			minutos = 0;
			segundos = segundos;

			if (horas == 24) {
				horas = 00;
				minutos = 00;
				segundos = 00;
			}
			if (horas == 24) {
				horas = 00;
				minutos = 00;
				segundos = 00;
			}
		}

		System.out.println(
				"La hora una vez pasados 1 minuto y un segundo sería-> " + horas + ":" + minutos + ":" + segundos);
	}

}
