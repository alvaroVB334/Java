package Tema5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JugadorDAO {
	public static int insertarJugador(int id, String nombre, int edad, int altura, String sexo) {

		// Consulta a ejecutar
		String query = "insert into jugador values (?,?,?,?,?)";
		int resultado = 0;

		Connection con = null;
		try {

			// Nos conectamos a la BD
			con = ConexionBD.conectarBD();

			// El preparedStatement lo genera la conexion utilizando
			// la consulta/query a ejecutar
			PreparedStatement pStmt = con.prepareStatement(query);

			pStmt.setInt(1, id);
			pStmt.setString(2, nombre);
			pStmt.setInt(3, edad);
			pStmt.setInt(4, altura);
			pStmt.setString(5, sexo);

			// Ejecutamos la query
			resultado = pStmt.executeUpdate();

			// Cerramos el statement
			pStmt.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Cerramos la conexion
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultado;
	}

	void mostrarJugadores() {
		// Nos conectamos a la BD
		Connection con = ConexionBD.conectarBD();

		String query = "SELECT * FROM jugador";

		try {
			// Generamos el PreparedStatement a partir de la query de sql
			PreparedStatement pStmt = con.prepareStatement(query);

			// Ejecutamos la query y nos devuelve los datos en una estructura resultSet (El
			// resultset es como un arraylist)
			ResultSet res = pStmt.executeQuery();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
