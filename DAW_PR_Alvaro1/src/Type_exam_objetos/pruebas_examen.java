package Type_exam_objetos;

public class pruebas_examen {

	public static void main(String[] args) {

		asignatura matematicas = new asignatura("Matematicas", 6.8f);   //Declaramos las asignaturas
		asignatura lengua = new asignatura("Lengua", 8.8f);
		asignatura sociales = new asignatura("Sociales", 9.8f);
		asignatura ingles = new asignatura("Ingles", 2.8f);
		asignatura edFisica = new asignatura("Educacion Fisica", 4.8f);
		asignatura musica = new asignatura("Musica", 6.8f);

		Alumno sergio = new Alumno("Sergio", false); // Usamos el constructor de nombre y del boolean repetidor o no

		sergio.listaAsignaturas[Alumno.POS_LENGUA] = lengua;       //Añadimos cada asignatura declarada en la distintas posiciones del array de asignaturas del alumno
		sergio.listaAsignaturas[Alumno.POS_MATEMATICAS] = matematicas;
		sergio.listaAsignaturas[Alumno.POS_EDFISICA] = edFisica;
		sergio.listaAsignaturas[Alumno.POS_SOCIALES] = sociales;
		sergio.listaAsignaturas[Alumno.POS_INGLES] = ingles;
		sergio.listaAsignaturas[Alumno.POS_MUSICA] = musica;

		if (sergio.aprobadoArray()) {
			System.out.println("Felicidades, has aprobado " + sergio.nombre);
		}

		System.out.println("La nota matima de " + sergio.nombre + " es: " + sergio.notaMaxima().getNota()); //Llamamos a  la funcion de notaMaxima (Que devuelve una asignatura, ponemos el .getNota para pillar la nota de esa asignatura)
		System.out.println("La nota media de " + sergio.nombre + " es: " + sergio.notaMediaArray());

	}

}
