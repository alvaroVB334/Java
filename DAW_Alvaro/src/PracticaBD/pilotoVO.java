package PracticaBD;

public class pilotoVO {

	private String dni;
	private String nombre;
	private String edad;
	private String sexo;
	private String direccion;
	private String id_coche;
	private cocheVO Coche; //Coche del piloto
	
	public pilotoVO(){
		dni="";
		nombre="";
		edad="";
		sexo="";
		direccion="";
		id_coche="";
		Coche=new cocheVO();
	}

	public pilotoVO(String dni, String nombre, String edad, String sexo, String direccion, String id_coche,cocheVO Coche) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.direccion = direccion;
		this.id_coche = id_coche;
		this.Coche=Coche;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getId_coche() {
		return id_coche;
	}

	public void setId_coche(String id_coche) {
		this.id_coche = id_coche;
	}

	public cocheVO getCoche() {
		return Coche;
	}

	public void setCoche(cocheVO coche) {
		Coche = coche;
	}
	
}
