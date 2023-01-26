package Tema3.Objetos.Circuito;

public class Circuito {

	// nombre, pais, ciudad, longitud, vuelta rápida ( de tipo long, guardada en
	// milisegundos), nombrePilotoVueltaRapida

	private String nombre;
	private String ciudad;
	private float longitud;
	private long vueltaRapida = Integer.MAX_VALUE;
	private String nombrePilotoVueltaRapida;

	public Circuito(String nombre, String ciudad, float longitud, long vueltaRapida, String nombrePilotoVueltaRapida) {
		super();
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.longitud = longitud;
		this.vueltaRapida = vueltaRapida;
		this.nombrePilotoVueltaRapida = nombrePilotoVueltaRapida;
	}

	/**
	 * Actualiza el tiempo y el nombre del piloto que hizo la vuelta mas rapida
	 * 
	 * @param NombrePiloto
	 * @param tiempo
	 * @return
	 */
	public int vueltaRapida(String nombrePiloto, long tiempo) {

		if (tiempo < vueltaRapida) {
			this.vueltaRapida = tiempo;
			this.nombrePilotoVueltaRapida = nombrePiloto;
		}
		return (0);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public float getLongitud() {
		return longitud;
	}

	public void setLongitud(float longitud) {
		this.longitud = longitud;
	}

	public long getVueltaRapida() {
		return vueltaRapida;
	}

	public void setVueltaRapida(long vueltaRapida) {
		this.vueltaRapida = vueltaRapida;
	}

	public String getNombrePilotoVueltaRapida() {
		return nombrePilotoVueltaRapida;
	}

	public void setNombrePilotoVueltaRapida(String nombrePilotoVueltaRapida) {
		this.nombrePilotoVueltaRapida = nombrePilotoVueltaRapida;
	}

}
