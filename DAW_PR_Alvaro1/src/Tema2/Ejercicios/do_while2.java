package Tema2.Ejercicios;

import java.util.Scanner;

public class do_while2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0, n = 0; // Introducimos las variables
		float saldo, sumaSaldo = 0;
		String numcuenta, estadoCuenta;
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce cuantas cuentas bancarias buscas leer: "); // Le pedimos el limite del while
		n = teclado.nextInt();

		System.out.print("Introduce el primer número de cuenta y a continuación su saldo: ");

		do {
			numcuenta = teclado.next(); // Recogemos el numero de cuenta y su saldo
			saldo = teclado.nextFloat();

			if (numcuenta.contains("-")) { // Si el string del numero de cuenta contiene un "-" de numero negativo el
											// programa se sale
				break;
			}

			if (saldo > 0) { // Si el saldo es mayor que 0, almacenamos acreedor al string del estado y
								// ademas sumamos el saldo a un cumulo
				estadoCuenta = "Acreedor";
				sumaSaldo = sumaSaldo + saldo;
			} else if (saldo < 0) {
				estadoCuenta = "Deudor, PAGA LO QUE DEBES"; // Si es menor es un deudor
			} else {
				estadoCuenta = "Nulo, tienes 0 amigo"; // si no tiene nada es 0
			}
			System.out.println("-----------------------------------");
			System.out.println("Numero de cuenta: " + numcuenta + " Estado de la cuenta: " + estadoCuenta); // Imprimimos
																											// todo
			System.out.println("Saldo de la cuenta " + saldo);
			System.out.println("La suma total del saldo de los acreedores es " + sumaSaldo);
			System.out.print("Sigue introduciendo número de cuenta y saldo: ");
		} while (i < n);
		teclado.close();
	}

}
