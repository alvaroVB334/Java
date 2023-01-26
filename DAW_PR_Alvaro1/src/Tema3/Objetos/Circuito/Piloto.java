package Tema3.Objetos.Circuito;

public class Piloto { // nombre, edad, campeonatos, cocheAsignado (de tipo coche), dorsal,
						// escuderia,sueldo

	private String nombre;
	private int edad;
	private int campeonatos;
	private String CocheAsignado;
	private int dorsal;
	private String escuderia;
	private float sueldo;

	public Piloto(String nombre, int edad, int campeonatos, String cocheAsignado, int dorsal, String escuderia,
			float sueldo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.campeonatos = campeonatos;
		CocheAsignado = cocheAsignado;
		this.dorsal = dorsal;
		this.escuderia = escuderia;
		this.sueldo = sueldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getCampeonatos() {
		return campeonatos;
	}

	public void setCampeonatos(int campeonatos) {
		this.campeonatos = campeonatos;
	}

	public String getCocheAsignado() {
		return CocheAsignado;
	}

	public void setCocheAsignado(String cocheAsignado) {
		CocheAsignado = cocheAsignado;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getEscuderia() {
		return escuderia;
	}

	public void setEscuderia(String escuderia) {
		this.escuderia = escuderia;
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

}
