package Tema3.Objetos.Coche;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

public class Coche { // LOGS TB

	private int potencia;
	private int peso;
	private String nombre;
	private String modelo;
	private String marca;
	private String color;
	private int velocidad;

	final String COLOR1 = "Azul";
	final String COLOR2 = "Rojo";
	final String COLOR3 = "Amarillo";
	final String COLOR4 = "Negro";
	final String COLOR5 = "Blanco";

	public Coche() { // Constructor
		int potencia = 100;
		int peso = 200;
		String nombre = "Coche1";
		String modelo = "Seat Ibiza";
		String marca = "Seat";
		String color = "Negro";
		int velocidad = 300;

		Logger logCreacionCoches = (Logger) LoggerFactory.getLogger("logFichero"); // log

		logCreacionCoches.info("COCHE CREADO\n-------------------\n Caracteristicas:\n -Potencia: " + this.potencia
				+ "\n -Peso: " + this.peso + "\nNombre: " + this.nombre + "\nModelo: " + this.modelo + " \nMarca: "
				+ this.marca + "\nColor: " + this.color + "\nVelocidad: " + this.velocidad);
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public String getCOLOR1() {
		return COLOR1;
	}

	public String getCOLOR2() {
		return COLOR2;
	}

	public String getCOLOR3() {
		return COLOR3;
	}

	public String getCOLOR4() {
		return COLOR4;
	}

	public String getCOLOR5() {
		return COLOR5;
	}

	public int Acelerar(int velocidad, int porcentaje) {
		velocidad = (porcentaje * velocidad) / 10;
		return velocidad;
	}

	public String pintar(String color) {
		String colorFinal = color;
		return colorFinal;
	}

}
