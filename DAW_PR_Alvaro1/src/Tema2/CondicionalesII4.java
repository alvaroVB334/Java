package Tema2;

import java.util.Scanner;

public class CondicionalesII4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float x, y, z;
		String orden;
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce el orden (Ascendente o Descendente): ");
		orden = teclado.nextLine();

		System.out.print("Introduce 3 números: ");
		x = teclado.nextFloat();
		y = teclado.nextFloat();
		z = teclado.nextFloat();

		if (orden.equals("Ascendente")) {
			if (x > y && y > z) {
				System.out.println("El orden Ascendente es: " + x + ">" + y + ">" + z);
			} else {
				if (y > x && x > z) {
					System.out.println("El orden Ascendente es: " + y + ">" + x + ">" + z);
				} else {
					if (z > x && x > y) {
						System.out.println("El orden Ascendente es: " + z + ">" + x + ">" + y);
					} else {
						if (x > z && z > y) {
							System.out.println("El orden Ascendente es: " + x + ">" + z + ">" + y);
						} else {
							if (y > z && z > x) {
								System.out.println("El orden Ascendente es: " + y + ">" + z + ">" + x);
							} else {
								System.out.println("El orden Ascendente es: " + z + ">" + y + ">" + x);
							}
						}
					}
				}
			}
		}

		if (orden.equals("Descendente")) {
			if (x > y && y > z) {
				System.out.println("El orden Descendente es: " + z + "<" + y + "<" + x);
			} else {
				if (y > x && x > z) {
					System.out.println("El orden Descendente es: " + z + "<" + x + "<" + y);
				} else {
					if (z > x && x > y) {
						System.out.println("El orden Descendente es: " + y + "<" + x + "<" + z);
					} else {
						if (x > z && z > y) {
							System.out.println("El orden Descendente es: " + y + "<" + z + "<" + x);
						} else {
							if (y > z && z > x) {
								System.out.println("El orden Descendente es: " + x + "<" + z + "<" + y);
							} else {
								System.out.println("El orden Descendente es: " + x + "<" + y + "<" + z);
							}
						}
					}
				}
			}
		}

	}

}
