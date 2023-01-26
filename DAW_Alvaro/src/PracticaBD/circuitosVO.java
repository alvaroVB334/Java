package PracticaBD;

public class circuitosVO {

	private String idCircuitos;
	private String nombre;
	private String ciudad;
	private String pais;
	private String longitud;
	private int recordVuelta;
	private int numCurvas;
	
	circuitosVO(){
		idCircuitos="";
		nombre="";
		ciudad="";
		pais="";
		longitud="";
		recordVuelta=0;
		numCurvas=0;
	}

	public circuitosVO(String idCircuitos, String nombre, String ciudad, String pais, String longitud, int recordVuelta,
			int numCurvas) {
		super();
		this.idCircuitos = idCircuitos;
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.pais = pais;
		this.longitud = longitud;
		this.recordVuelta = recordVuelta;
		this.numCurvas = numCurvas;
	}

	public String getIdCircuitos() {
		return idCircuitos;
	}

	public void setIdCircuitos(String idCircuitos) {
		this.idCircuitos = idCircuitos;
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

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getLongitud() {
		return longitud;
	}

	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}

	public int getRecordVuelta() {
		return recordVuelta;
	}

	public void setRecordVuelta(int recordVuelta) {
		this.recordVuelta = recordVuelta;
	}

	public int getNumCurvas() {
		return numCurvas;
	}

	public void setNumCurvas(int numCurvas) {
		this.numCurvas = numCurvas;
	}
	
}
