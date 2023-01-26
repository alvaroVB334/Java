package Tema2;

import java.util.Scanner;

public class CondicionalesII3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int horas, horasdiff;
		float sueldohora, sueldobruto, sueldoneto, sueldodiff;
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce tu sueldo a la hora: ");
		sueldohora = teclado.nextFloat();

		System.out.print("Introduce el Número de horas que trabajas: ");
		horas = teclado.nextInt();

		// - ❤❤❤❤❤❤❤❤❤❤ - Sueldo bruto según las horas - ❤❤❤❤❤❤❤❤❤-//
		if (horas <= 35) {
			sueldobruto = horas * sueldohora;
		} else {
			horasdiff = horas - 35;
			sueldobruto = (float) ((35 * sueldohora) + (sueldohora * horasdiff * 1.5));
		}

		// - ❤❤❤❤❤❤❤❤❤❤ - Sueldo neto según los impuestos - ❤❤❤❤❤❤❤❤❤-//
		if (sueldobruto <= 500) {
			sueldoneto = sueldobruto;
		} else {
			if (sueldobruto <= 900) {
				sueldodiff = sueldobruto - 500;
				sueldoneto = (float) (500 + (sueldodiff * 0.75)); // le quitamos 25%
			} else {
				sueldodiff = sueldobruto - 900;
				sueldoneto = (float) (500 + (sueldodiff * 0.55) + (400 * 0.75));

			}
		}

		System.out.println("Tu salario bruto es:" + sueldobruto + ",Y tu salario Neto: " + sueldoneto);

	}

}
