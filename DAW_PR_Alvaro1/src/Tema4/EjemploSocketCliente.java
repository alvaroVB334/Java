package Tema4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

public class EjemploSocketCliente {

	public static void main(String[] args) {

		Socket sock = null; // la declaramos arriba como null para poder usar sus funciones en todo el main
		DataOutputStream out = null;

		try { // trycatch generado mediante eclipse
			sock = new Socket("localhost", 12345); // y aqui dentro del try ya l damos valores para intentar
			DataInputStream din = null;
			DataOutputStream don = null; // desconectarnos

			// Para poder escribir en el socket utilizamos un dataOutput
			out = new DataOutputStream(sock.getOutputStream());
			din = new DataInputStream(sock.getInputStream());
			don = new DataOutputStream(sock.getOutputStream());

			out.writeUTF("Solicitando plataforma de aterrizaje");
			String msd = din.readUTF();

			System.out.println("Hemos recibido el mensaje de bienvenida de la base: " + msd);

		} catch (IOException e) {

			Logger logFich = (Logger) LoggerFactory.getLogger("tema4.LogSocketError"); // Creamos loggers de error de
																						// conexion
			logFich.error("No se encuentra el servidor");

			e.printStackTrace();
		}

		try { // Try-catch generado para desconectarse
			sock.close();
			out.close();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
