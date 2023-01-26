package Tema3.Objetos.Circuito;

import java.util.Scanner;

public class prueba {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		Piloto piloto = new Piloto("Luis", 20, 3, "coche", 3, "Ferrari", 1000);
		Circuito circuito = new Circuito("Jerez", "Jerez", 2500, 120, "Alonso");
		String nombre;
		long tiempo;

		System.out.println("La vuelta mas rapida hasta ahora es " + circuito.getVueltaRapida() + " conseguida por: "
				+ circuito.getNombrePilotoVueltaRapida());

		System.out.print("Introduce el nombre del piloto: ");
		nombre = teclado.next();

		System.out.print("Introduce el tiempo de ese piloto: ");
		tiempo = teclado.nextLong();

		circuito.vueltaRapida(nombre, tiempo);

		System.out.println("La nueva vuelta rapida es: " + circuito.getVueltaRapida() + " conseguida por: "
				+ circuito.getNombrePilotoVueltaRapida());
	}
}
