package PracticaBD;

public class cocheVO {

	private String idCoche;
	private String marca;
	private String modelo;
	private int peso;
	private int potencia;
	
	public cocheVO(){
		idCoche="";
		marca="";
		modelo="";
		peso=0;
		potencia=0;
	}

	public cocheVO(String idCoche, String marca, String modelo, int peso, int potencia) {
		super();
		this.idCoche = idCoche;
		this.marca = marca;
		this.modelo = modelo;
		this.peso = peso;
		this.potencia = potencia;
	}

	public String getIdCoche() {
		return idCoche;
	}

	public void setIdCoche(String idCoche) {
		this.idCoche = idCoche;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
}
