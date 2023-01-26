package PracticaBD;

import java.sql.Date;

public class ruedasVO {

	private String marca;
	private String modelo;
	private int peso;
	private String componentes;
	private String dimensiones;
	private String estado;
	private String idruedas;
	private String id_Coche;
	private Date fecha;
	private String sesion;
	
	ruedasVO(){
		marca="";
		modelo="";
		peso=0;
		componentes="";
		dimensiones="";
		estado="";
		idruedas="";
		id_Coche="";
		fecha=fecha;
		sesion="";
	}

	public ruedasVO(String marca, String modelo, int peso, String componentes, String dimensiones, String estado,
			String idruedas, String id_Coche, Date fecha, String sesion) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.peso = peso;
		this.componentes = componentes;
		this.dimensiones = dimensiones;
		this.estado = estado;
		this.idruedas = idruedas;
		this.id_Coche = id_Coche;
		this.fecha = fecha;
		this.sesion = sesion;
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

	public String getComponentes() {
		return componentes;
	}

	public void setComponentes(String componentes) {
		this.componentes = componentes;
	}

	public String getDimensiones() {
		return dimensiones;
	}

	public void setDimensiones(String dimensiones) {
		this.dimensiones = dimensiones;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getIdruedas() {
		return idruedas;
	}

	public void setIdruedas(String idruedas) {
		this.idruedas = idruedas;
	}

	public String getId_Coche() {
		return id_Coche;
	}

	public void setId_Coche(String id_Coche) {
		this.id_Coche = id_Coche;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getSesion() {
		return sesion;
	}

	public void setSesion(String sesion) {
		this.sesion = sesion;
	}
	
}
