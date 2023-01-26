package Tema5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

	/*
	 * Siempre que utilizamos un servicio necesitamos Conectarnos al servicio, para
	 * eso es esta clase
	 * 
	 * Se necesitan siempre 4 parametros para conectarnos a un servicio ip o nombre
	 * de dominio: localhost en nuestro caso que es nuestra maquina usuario:root
	 * password:toor (en vuestro caso ""); puerto de comunicaciones del
	 * servicio:3306 para mysql Base de datos o esquema a utilizar
	 * 
	 */

	/**
	 * Funcion que se conecta a la BD de MySql y nos devuelve la conexion
	 * 
	 * @return Devuelve una conexion activa a la bd o null si no se pudo conectar
	 */
	public static Connection conectarBD() {

		// Parametros para la conexion a BD
		String user = "root";
		String password = "toor";
		String url = "jdbc:mysql://localhost:3306/grandslam";
		// Conexion para acceder a BD
		Connection con = null;

		try {
			// Nos conectamos a la base de datos
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

}
