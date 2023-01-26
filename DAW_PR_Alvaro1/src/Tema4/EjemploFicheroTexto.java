package Tema4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EjemploFicheroTexto {

	public static final String RUTA = "/home/daw/";

	public static void main(String[] args) {

		File fich = new File(RUTA + "AficheroEj1");// Definimos el fichero a leer

		try {
			FileReader fr = new FileReader(fich);
			BufferedReader br = new BufferedReader(fr);

			String linea = br.readLine(); // leemos una linea
			int i = 1;

			while (linea != null) {
				System.out.println("Linea " + i + ": " + linea);// Mostramos por pantalla la linea leida del fichero
				linea = br.readLine(); // leemos la siguiente linea
				i++;
			}

			// Cerramos los streams de lectura
			fr.close();
			br.close();

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		/*********************************************************************************
		 * ESCRITURA DE FICHEROS TIPO TEXTO
		 *********************************************************************************/

	}

}
