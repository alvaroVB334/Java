package entornos;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

public class EjemploLog {

	public static void main(String[] args) {

		Logger logFich = (Logger) LoggerFactory.getLogger("tema3.logSalidaFichero");
		Logger logCon = (Logger) LoggerFactory.getLogger("tema3.logSalidaConsola"); // Entre comillas va el log de la
																					// config que usara dada en el xml
		Logger log = (Logger) LoggerFactory.getLogger(EjemploLog.class); // Usa el log por defecto e indica para que
																			// clase actuara
		// Log ficheros
		logFich.trace("Fichero: Esto es una traza"); // DE MENOS A MAS IMPORTANTE
		logFich.debug("Fichero: Mensaje de depuración");
		logFich.info("Fichero: Mensaje de información, ej. usuario logeado");
		logFich.warn("Fichero: Mensaje de advertencia, ej recursos cerca de limite");
		logFich.error("Fichero: Mensaje de error, ha pasado algo grave");

		// Log consola
		logCon.trace("Consola: Esto es una traza"); // DE MENOS A MAS IMPORTANTE
		logCon.debug("Consola: Mensaje de depuración");
		logCon.info("Consola: Mensaje de información, ej. usuario logeado");
		logCon.warn("Consola: Mensaje de advertencia, ej recursos cerca de limite");
		logCon.error("Consola: Mensaje de error, ha pasado algo grave");

		// Log generico
		log.trace("Generico: Esto es una traza"); // DE MENOS A MAS IMPORTANTE
		log.debug("Generico: Mensaje de depuración");
		log.info("Generico: Mensaje de información, ej. usuario logeado");
		log.warn("Generico: Mensaje de advertencia, ej recursos cerca de limite");
		log.error("Generico: Mensaje de error, ha pasado algo grave");

	}

}
