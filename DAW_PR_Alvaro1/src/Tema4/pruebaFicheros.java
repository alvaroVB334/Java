package Tema4;

public class pruebaFicheros {

	public static void main(String[] args) {
		// BORRAMOS UN FICHERO
		int resultado = GestionFicheros.eliminarFichero("/home/daw/borrar.log");

		if (resultado == GestionFicheros.OK) {
			System.out.println("El fichero se borro correctamente");
		} else {
			System.out.println("El fichero no se borro correctamente");
		}
		// MOSTRAMOS EL CONTENIDO DE UN FICHERO
		resultado = GestionFicheros.mostrarContenidoDirectorio("/home/daw");

		// CREACION DE FICHEROS

		// Crear directorio
		resultado = GestionFicheros.crearDirectorio("/home/daw", "CarpetaCreada");
	}

}
