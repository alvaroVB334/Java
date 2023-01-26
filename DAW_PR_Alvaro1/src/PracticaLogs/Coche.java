package PracticaLogs;

import org.slf4j.LoggerFactory;

public class Coche {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creamos un coche para probar el log

		Coche coche1 = new Coche(200, "Seat", "Panda", "Seat", 1970, "Rojo", 130);

	}
	// Creamos el log para la clase Coche

	public static final org.slf4j.Logger log = LoggerFactory.getLogger("salidaFicheroCoche");

	// Creamos las variables miembro de la clase

	private int potencia;
	private String nombre;
	private String modelo;
	private String marca;
	private double peso;
	private String color;
	private int velocidad;

	// Creamos el constructor del coche.

	public Coche(int potencia, String nombre, String modelo, String marca, double peso, String color, int velocidad) {
		super();
		this.potencia = potencia;
		this.nombre = nombre;
		this.modelo = modelo;
		this.marca = marca;
		this.peso = peso;
		this.color = color;
		this.velocidad = velocidad;
		// Log de info en el builder.
		log.info("COCHE CREADO\n Caracteristicas:\n -Potencia: " + this.potencia + "\n -Peso: " + this.peso
				+ "\nNombre: " + this.nombre + "\nModelo: " + this.modelo + " \nMarca: " + this.marca + "\nColor: "
				+ this.color + "\nVelocidad: " + this.velocidad);
	}

	public Coche() {
		super();
	}

}
