package Tema3.Objetos.Circuito;

public class Campeonato {

	final int MAX_PILOTOS = 10;
	final int MAX_PRESION = 100;
	final int MAX_POTENCIA = 100;
	String Categoria;
	String nombre;

	static Circuito[] circuitos = new Circuito[4];
	static Piloto[] pilotos = new Piloto[4];

	public Campeonato(String categoria, String nombre) {
		super();
		Categoria = categoria;
		this.nombre = nombre;
	}

	/**
	 * Devuelve el circuito de mayor longitud
	 */
	void circuitoMasLargo() {

	}

	/**
	 * recorre el array de pilotos y mostrará el nombre de los pilotos de la
	 * escudería introducida en el siguiente formato: FERRARI: Carlos Sainz Charles
	 * Lecrerc
	 * 
	 * @param nombreEscuderia
	 */
	void mostrarEscuderia(String nombreEscuderia) {

	}

	/**
	 * Comprueba que todos los coches cumplan las medidas de peso potencia y
	 * presiones
	 */
	void comprobarCoches() {

	}

	public String getCategoria() {
		return Categoria;
	}

	public void setCategoria(String categoria) {
		Categoria = categoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static Circuito[] getCircuitos() {
		return circuitos;
	}

	public static void setCircuitos(Circuito[] circuitos) {
		Campeonato.circuitos = circuitos;
	}

	public static Piloto[] getPilotos() {
		return pilotos;
	}

	public static void setPilotos(Piloto[] pilotos) {
		Campeonato.pilotos = pilotos;
	}

	public int getMAX_PILOTOS() {
		return MAX_PILOTOS;
	}

	public int getMAX_PRESION() {
		return MAX_PRESION;
	}

	public int getMAX_POTENCIA() {
		return MAX_POTENCIA;
	}

}
