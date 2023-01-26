package Type_exam_objetos;

public class Alumno { // nombre apellido edad repetidor

	public String nombre;
	public String apellidos;
	public int edad;
	private boolean repetidor;
	public static final int NUM_ASIGNATURAS = 6;

	public static final int POS_LENGUA = 0;
	public static final int POS_MATEMATICAS = 1;
	public static final int POS_INGLES = 2;
	public static final int POS_SOCIALES = 3;
	public static final int POS_EDFISICA = 4;
	public static final int POS_MUSICA = 5;

	private asignatura lengua;
	private asignatura matematicas;
	private asignatura sociales;
	private asignatura ingles;

	public asignatura listaAsignaturas[];

	public Alumno(String nombre, boolean esRepetidor) {
		// el this es el de esta clase y nombre el que recibe
		this.nombre = nombre;
		this.repetidor = repetidor;
		this.apellidos = "";
		this.edad = 0;

		this.lengua = new asignatura();
		this.matematicas = new asignatura();
		this.sociales = new asignatura();
		this.ingles = new asignatura();

		listaAsignaturas = new asignatura[Alumno.NUM_ASIGNATURAS]; // Inicializamos el tamaño del array

		for (int i = 0; i < listaAsignaturas.length; i++) {
			listaAsignaturas[i] = new asignatura(); // en cada hueco del array creo una asignatura y la metemos en su
													// correspondiente hueco
		}

	}

	public Alumno(String nombre, String apellido, int edad, boolean repetidor, asignatura lengua, // Constructor
			asignatura matematicas, asignatura sociales, asignatura ingles) {

		this.nombre = nombre;
		this.apellidos = apellido;
		this.edad = edad;
		this.repetidor = repetidor;
		this.lengua = lengua;
		this.matematicas = matematicas;
		this.sociales = sociales;
		this.ingles = ingles;
	}

	public float notaMedia() {

		return (this.lengua.getNota() + this.sociales.getNota() + this.matematicas.getNota() + this.ingles.getNota())
				/ 4; // Suma de las notas entre el total

	}

	public float notaMediaArray() {

		float media = 0f;
		for (int i = 0; i < listaAsignaturas.length; i++) {
			media = media + listaAsignaturas[i].getNota();
		}
		return media / listaAsignaturas.length;
	}

	public asignatura notaMaxima() {

		float notaMax = Float.MIN_VALUE;
		asignatura AsigMax = new asignatura();

		for (int i = 0; i < listaAsignaturas.length; i++) {

			if (listaAsignaturas[i].getNota() > notaMax) { // Si la nota comprobada en el
															// array es mayor que la
															// anterior
															// la guardamos en NotaMax y
															// ademas guardamos cual es
				notaMax = listaAsignaturas[i].getNota();
				AsigMax = listaAsignaturas[i];
			}
		}

		return AsigMax;

	}

	public boolean aprobadoArray() {

		if (notaMediaArray() > 5) {
			if (listaAsignaturas[POS_LENGUA].getNota() >= 5 || listaAsignaturas[POS_MATEMATICAS].getNota() >= 5) {
				return true;
			}
		}
		return false; // si no se cumple la condici�n devolvemos falso
	}
}
