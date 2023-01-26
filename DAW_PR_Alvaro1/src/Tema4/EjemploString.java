package Tema4;

public class EjemploString {

	public static void main(String[] args) {

		String nombre1 = "Pablo no es no y tambien no en italia";
		String nombre2 = "Juanito";
		String nombre3 = "Juanjo";

		System.out.println("El tamaño de nombre1 es: " + nombre1.length());

		System.out.println("Los nombres son " + nombre1.concat(nombre2));

		System.out.println("El primer no está en la posición " + nombre1.indexOf("no"));

		Double pi = Math.PI;

		String spi = String.format("%.4f", pi); // Así consigues que solo tenga 4 decimales pi

		System.out.println("El numero pi es " + spi);

		// COmpare to nos dice cual va antes ordenado alfabeticamente

		if (nombre2.compareTo(nombre3) < 0) {
			System.out.println(nombre3 + " es posterior alfabeticamente a " + nombre2);
		} else
			System.out.println(nombre2 + " es mayor que" + nombre3);

		String nombre4 = nombre1.replace("no", "si"); // Cambia strings en un cadena y la devuelve cambiada

		System.out.println(nombre4);
	}
}
