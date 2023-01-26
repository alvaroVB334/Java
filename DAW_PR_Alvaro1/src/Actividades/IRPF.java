package Actividades;

import java.util.Scanner;

public class IRPF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double sueldo, irpf;
		int pagas;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce tu sueldo: ");
		sueldo = teclado.nextDouble();

		System.out.print("Introduce el número de pagas: ");
		pagas = teclado.nextInt();

		System.out.print("Introduce tu porcentaje de irpf ");
		irpf = teclado.nextDouble();

		System.out.println("Lo que ganas al año es: " + ((sueldo * pagas * irpf) / 100));

	}

}
