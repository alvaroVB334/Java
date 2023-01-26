package Tema4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

public class EjemploFicherosBinarios {

	// Constantes para definir los posibles errores
	public static final int ERROR_FILENOTFOUND = -1;
	public static final int ERROR_LECTURA = -2;
	public static final int COPIA_CORRECTA = 0;

	public static final String RUTA = "/home/daw/";

	public static void main(String[] args) {

		copiarFichero(RUTA + "AficheroEj1", RUTA + "ADestinoEJ1");
	}

	public static int copiarFichero(String rutaOrigen, String rutaDestino) {

		int resultado = COPIA_CORRECTA;

		File fichOrigen = new File(rutaOrigen); // Creamos el ficheros de lectura

		byte bufferLectura[] = new byte[200]; // Creamos un array de bytes para ir leyendo el fichero

		try {

			Logger logConsola = (Logger) LoggerFactory.getLogger("Consola");
			logConsola.info("Se ha intentado copiar fichero " + rutaOrigen + "a " + rutaDestino);

			FileInputStream fi = new FileInputStream(fichOrigen);
			// No necesitamos previamente el objeto file, directamente ponemos la ruta del
			// fichero y si queremos hacer append
			FileOutputStream fo = new FileOutputStream(rutaDestino);

			BufferedInputStream br = new BufferedInputStream(fi);
			BufferedOutputStream bw = new BufferedOutputStream(fo);

			int bytesLeidos = br.read(bufferLectura); // Leemos la primera vez fuera del bucle

			while (bytesLeidos == 200) {

				// Escribo el array de Bytes en el fichero destino
				bw.write(bufferLectura);
				// leo otra vez
				bytesLeidos = br.read(bufferLectura);
			}

			// El bucle no lee completo pk cuando deja dehaber 200 bytes deja de escribir
			// entonces al final del bucle tenemos que poner otro write

			// bw.write(bufferLectura);
			bw.write(bufferLectura, 0, bytesLeidos - 1);

			// Cerramos los Streams primero se cierran los file input/output y luego los
			// buffered
			fi.close();
			br.close();
			bw.close();
			fo.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			Logger logFich = (Logger) LoggerFactory.getLogger("salidaFicheroErrorBinario");
			logFich.error("No se ha podido encontrar el fichero");
			e.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		return resultado;

	}

}
