package Type_exam_objetos;

public class asignatura {

	private String nombre;
	public float nota;

	public static final int MAX_ALUMNOS = 30;

	public asignatura(String nombreRecibido) {

		// el this indica que se refiere a la variable miembro de la clase
		this.nombre = nombreRecibido;
		this.nota = 0.0f;
	}

	public asignatura(String nombre, float nota) { // Constructor que recibe nombre y nota

		this.nombre = nombre;
		this.nota = nota;
	}

	public asignatura() { // Constructor vacio

	}

	public float getNota() { // Getters y setters que nos pide
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}

	public String getNombre() {
		return nombre;
	}

	/*
	 * public boolean prestar (int dia) {
	 * 
	 * diasPrestamo = dia;
	 * 
	 * if (prestado = true) { dia++;
	 * 
	 * } else { prestado = false; } return prestado;
	 * 
	 * }
	 * 
	 * public boolean devolver() { if (prestado = false) { return false; } else {
	 * diasPrestamo = 0; prestado = false; } return prestado; }
	 */

}
