package PracticaBD;

public class campeonatoVO {

	private String nombre;
	private int año;
	private int numPilotos;
	private int numCircuitos;
	private String pilotoGanador;
	private String idCampeonato;
	
	public campeonatoVO(){
		nombre="";
		año=0;
		numPilotos=0;
		numCircuitos=0;
		pilotoGanador="";
		idCampeonato="";
	}

	public campeonatoVO(String nombre, int año, int numPilotos, int numCircuitos, String pilotoGanador,
			String idCampeonato) {
		super();
		this.nombre = nombre;
		this.año = año;
		this.numPilotos = numPilotos;
		this.numCircuitos = numCircuitos;
		this.pilotoGanador = pilotoGanador;
		this.idCampeonato = idCampeonato;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public int getNumPilotos() {
		return numPilotos;
	}

	public void setNumPilotos(int numPilotos) {
		this.numPilotos = numPilotos;
	}

	public int getNumCircuitos() {
		return numCircuitos;
	}

	public void setNumCircuitos(int numCircuitos) {
		this.numCircuitos = numCircuitos;
	}

	public String getPilotoGanador() {
		return pilotoGanador;
	}

	public void setPilotoGanador(String pilotoGanador) {
		this.pilotoGanador = pilotoGanador;
	}

	public String getIdCampeonato() {
		return idCampeonato;
	}

	public void setIdCampeonato(String idCampeonato) {
		this.idCampeonato = idCampeonato;
	}
	
}
