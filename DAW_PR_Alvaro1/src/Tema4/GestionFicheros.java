package Tema4;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.text.SimpleDateFormat;

public class GestionFicheros {

	public static final int OK = 0;
	public static final int FICHERO_NO_ENCONTRADO = -1;
	public static final int ERROR_LECTURA = -2;
	public static final int ERROR_BORRADO = -3;
	public static final int TIPO_ERROR = -4;
	public static final int FICHERO_EXISTE = -5;
	public static final int ERROR_ESCRITURA = -6;

	public static int eliminarFichero(String rutaFichero) {

		int resultado = OK; // Variable que guarda el resultado

		File fichero = new File(rutaFichero);

		if (!fichero.delete())
			resultado = ERROR_BORRADO;

		// Devolvemos el resultado
		return resultado;
	}

	public static int mostrarContenidoDirectorio(String rutaDirectorio) {

		int resultado = OK; // Variable que guarda el resultado

		File fichero = new File(rutaDirectorio);

		if (!fichero.isDirectory())
			resultado = TIPO_ERROR;
		else {
			String listaFicheros[] = fichero.list();

			// Mostramos por pantalla todos los nombres
			for (int i = 0; i < listaFicheros.length; i++) {

				System.out.println(listaFicheros[i]);
			}

		}
		// Devolvemos el resultado
		return resultado;
	}

	public static int crearDirectorio(String rutaDirectorio, String nombre) {
		int resultado = OK;

		File fichero = new File(rutaDirectorio);
		File directorio = new File(rutaDirectorio + "/" + nombre);

		if (!fichero.isDirectory())
			resultado = TIPO_ERROR;
		else {
			if (!fichero.canWrite()) {
				resultado = ERROR_ESCRITURA;
			} else {
				directorio.mkdir();
			}
		}
		return resultado;
	}

	/**
	 * Cambia todos los nombres de los archivos que se encuentren dentro de un
	 * directorio en caso de que haya mas de uno los ira enumerando Ej:
	 * nombre1,nombre2,nombre3, etc...
	 * 
	 * @param directorio       Recibe el directorio donde se encuentren los archivos
	 * @param nombreModificado Recibe el nombre al cual se desea modificar
	 * @return Devuelve error si no se completó o 0 si todo fue correcto
	 */
	public static int modificarNombres(String directorio, String nombreModificado) {

		int resultado = 0;
		File file = new File(directorio);
		File[] dirLista = file.listFiles();

		if (!file.isDirectory())
			resultado = TIPO_ERROR;
		else {
			if (!file.canWrite()) {
				resultado = ERROR_ESCRITURA;
			} else {
				resultado = OK;
				for (int i = 0; i < dirLista.length; i++) {

					if (dirLista[i].isFile()) {

						File fich = new File(directorio + "/" + dirLista[i].getName());
						fich.renameTo(new File(directorio + "/" + nombreModificado + i));
					}
				}
			}
		}

		return resultado;

	}

	/**
	 * Borra los archivos que contengan una extensión concreta de un directorio dado
	 * 
	 * @param directorio El directorio donde se encuentran los archivos
	 * @param extension  La extensión ej: ".txt o .bat"
	 * @return Devuelve o error o 0 si todo salío bien
	 */
	public static int borrarFicheros(String directorio, String extension) {

		int resultado = 0;
		File file = new File(directorio);
		File[] dirLista = file.listFiles();

		if (!file.isDirectory()) {
			resultado = TIPO_ERROR;
		} else if (!file.canWrite()) {
			resultado = ERROR_ESCRITURA;
		} else {
			resultado = OK;

			for (int i = 0; i < dirLista.length; i++) {

				if (dirLista[i].getName().contains(extension)) {
					dirLista[i].delete();
				}
			}

		}
		return resultado;
	}

	public static int borrarFicherosSize(String directorio, String size) {

		int resultado = 0;
		File file = new File(directorio);
		File[] dirLista = file.listFiles();

		if (!file.isDirectory()) {
			resultado = TIPO_ERROR;
		} else if (!file.canWrite()) {
			resultado = ERROR_ESCRITURA;
		} else {
			resultado = OK;

			for (int i = 0; i < dirLista.length; i++) {
				if (dirLista[i].length() > Integer.parseInt(size)) {
					dirLista[i].delete();
				}
			}

		}

		return resultado;
	}

	public static int mostrarFicherosRecientes(String directorio, int dias) {

		int resultado = 0;
		File file = new File(directorio);
		File[] dirLista = file.listFiles();
		BasicFileAttributes attrs = null;

		if (!file.isDirectory()) {
			resultado = TIPO_ERROR;
		} else if (!file.canWrite()) {
			resultado = ERROR_ESCRITURA;
		} else {
			resultado = OK;

			for (int i = 0; i < dirLista.length; i++) {

				try {
					File file1 = dirLista[i];
					attrs = Files.readAttributes(file1.toPath(), BasicFileAttributes.class);
					FileTime time = attrs.creationTime();
					String formato = "dd HH:mm:ss";

					SimpleDateFormat sdf = new SimpleDateFormat(formato);

					String formateado = sdf.format(new java.util.Date(time.toMillis()));

					System.out.println(formateado + " - " + file1.getName());

				} catch (IOException e) {
					e.printStackTrace();
				}

			}
		}
		return OK;
	}

	public static boolean directorioVacio(String rutaDirectorio) {

		File directorio = new File(rutaDirectorio);

		if (!directorio.isDirectory()) {
			return false;
		} else {
			String listaFicheros[] = directorio.list();
			if (listaFicheros == null) {
				return true;
			}

			return true;

		}
	}
}
