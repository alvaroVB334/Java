package Actividades;

import java.util.Scanner;

public class ejerciciolink04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double precio;
		int cantidad;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce el precio del producto: ");
		precio = teclado.nextDouble();

		System.out.print("Introduce la cantidad a llevar: ");
		cantidad = teclado.nextInt();

		System.out.println("El total a pagar es: " + (precio * cantidad));

	}

}
