package entornos;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

public class ficheroMax20kb {

	public static void main(String[] args) {

		Logger log20kb = (Logger) LoggerFactory.getLogger("log20kb");

		for (int i = 0; i < 1000; i++) {
			log20kb.info("ESTO ES EL TEXTO DE PRUEBA NÚMERO " + i);
		}
	}

}
