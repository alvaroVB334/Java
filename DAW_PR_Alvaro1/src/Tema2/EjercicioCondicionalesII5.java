package Tema2;

import java.util.Scanner;

public class EjercicioCondicionalesII5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero = (int) (Math.random() * 3 + 1); // 1 = piedra //Generamos un numero al azar del al 3
		String orden; // 2= papel // Cada uno corresponde a disintas opciones de la maquina
						// 3= tijera
		Scanner teclado = new Scanner(System.in);

		System.out.print("Elige piedra papel o tijera: ");
		orden = teclado.nextLine();

		orden.toLowerCase();

		if (numero == 1) { // Si la maquina saca piedra... Y valoramos las opciones
			if (orden.equals("piedra")) {
				System.out.println("SAQUE PIEDRA, EMPATE");
			}
			if (orden.equals("papel")) {
				System.out.println("SAQUE PIEDRA, GANASTE");
			}
			if (orden.equals("tijera")) {
				System.out.println("SAQUE PIEDRA, PERDISTE");
			}
		}

		if (numero == 2) { // Si la maquina saca papel
			if (orden.equals("piedra")) {
				System.out.println("SAQUE PAPEL, PERDISTE");
			}
			if (orden.equals("papel")) {
				System.out.println("SAQUE PAPEL, EMPATE");
			}
			if (orden.equals("tijera")) {
				System.out.println("SAQUE PAPEL, GANASTE");
			}
		}

		if (numero == 3) { // Si la maquina saca tijera
			if (orden.equals("piedra")) {
				System.out.println("SAQUE TIJERA, GANASTE");
			}
			if (orden.equals("papel")) {
				System.out.println("SAQUE TIJERA, PERDISTE");
			}
			if (orden.equals("tijera")) {
				System.out.println("SAQUE TIJERA, EMPATE");
			}
		}
	}

}
