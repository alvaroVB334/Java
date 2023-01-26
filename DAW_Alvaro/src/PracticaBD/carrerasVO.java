package PracticaBD;

public class carrerasVO {

	private int numVueltas;
	private int vueltaRapida;
	private	int numAccidentes;
	private String fecha;
	private String idCarreras;
	private String id_Campeonato;
	private String id_Circuitos;
	
	public carrerasVO(){
		numVueltas=0;
		vueltaRapida=0;
		numAccidentes=0;
		fecha="";
		idCarreras="";
		id_Campeonato="";
		id_Circuitos="";
	}

	public carrerasVO(int numVueltas, int vueltaRapida, int numAccidentes, String fecha, String idCarreras,
			String id_Campeonato, String id_Circuitos) {
		super();
		this.numVueltas = numVueltas;
		this.vueltaRapida = vueltaRapida;
		this.numAccidentes = numAccidentes;
		this.fecha = fecha;
		this.idCarreras = idCarreras;
		this.id_Campeonato = id_Campeonato;
		this.id_Circuitos = id_Circuitos;
	}

	public int getNumVueltas() {
		return numVueltas;
	}

	public void setNumVueltas(int numVueltas) {
		this.numVueltas = numVueltas;
	}

	public int getVueltaRapida() {
		return vueltaRapida;
	}

	public void setVueltaRapida(int vueltaRapida) {
		this.vueltaRapida = vueltaRapida;
	}

	public int getNumAccidentes() {
		return numAccidentes;
	}

	public void setNumAccidentes(int numAccidentes) {
		this.numAccidentes = numAccidentes;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getIdCarreras() {
		return idCarreras;
	}

	public void setIdCarreras(String idCarreras) {
		this.idCarreras = idCarreras;
	}

	public String getId_Campeonato() {
		return id_Campeonato;
	}

	public void setId_Campeonato(String id_Campeonato) {
		this.id_Campeonato = id_Campeonato;
	}

	public String getId_Circuitos() {
		return id_Circuitos;
	}

	public void setId_Circuitos(String id_Circuitos) {
		this.id_Circuitos = id_Circuitos;
	}
	
}
