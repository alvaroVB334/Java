package PracticaObjetos;

public class Campeonato {
	final int MAX_PILOTOS = 10;
	final int MAX_PRESION = 100;
	final int MAX_POTENCIA = 100;
	String Categoria;
	String nombre;

	public Circuito listaCircuitos[];
	public Piloto listaPilotos[];

	public Campeonato(String categoria, String nombre) {
		super();
		Categoria = categoria;
		this.nombre = nombre;

		listaCircuitos = new Circuito[4];
		listaPilotos = new Piloto[4];

		for (int i = 0; i < 4; i++) {

		}
	}

	/**
	 * Devuelve el circuito de mayor longitud
	 */
	void circuitoMasLargo() {
		
         for(int i=0;i<listaCircuitos.length;i++) {
        	 
         }
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

	public Circuito[] getListaCircuitos() {
		return listaCircuitos;
	}

	public void setListaCircuitos(Circuito[] listaCircuitos) {
		this.listaCircuitos = listaCircuitos;
	}

	public Piloto[] getListaPilotos() {
		return listaPilotos;
	}

	public void setListaPilotos(Piloto[] listaPilotos) {
		this.listaPilotos = listaPilotos;
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
