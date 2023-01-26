package Tema4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

public class EjemploSocketServidor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ServerSocket servSock = null; // Definimos la variable Socket
		Socket sockCliente = null;
		DataInputStream din = null;
		DataOutputStream don = null;

		try {// Intentamos conectarnos con el SV remoto
			servSock = new ServerSocket(12345); // Con esto creamos el sv

			sockCliente = servSock.accept(); // Con esto permitimos que el cliente se conecte
			System.out.println("Se ha conectado un cliente");

			Logger logFich = (Logger) LoggerFactory.getLogger("tema4.Logsocket"); // Creamos loggers para informar de la
																					// conexion
			logFich.info("Se ha conectado el cliente con el ip: " + sockCliente);

			// Creamos el input Stream para leer
			din = new DataInputStream(sockCliente.getInputStream());
			don = new DataOutputStream(sockCliente.getOutputStream());

			String msg = din.readUTF(); // leemos el mensaje

			if (msg.toLowerCase().contains("solicitando")) { // Comprobamos si el String msg contiene la palabra
																// solicitando

				// Respondemos al cliente dandole plataforma de aterrizaje
				don.writeUTF("Bienvenido a la base, su plataforma de aterrizaje es: ");
				don.writeInt((int) (Math.random() * 100));
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			servSock.close();
			sockCliente.close();
			din.close();
			don.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
