package PracticaBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class pilotoDAO {

	int eliminar(String dni) {

		int result = 1;
		Connection con = utils.conectarBD();

		String query = "DELETE FROM Piloto WHERE idPiloto=" + dni + ";";

		try {
			PreparedStatement pStmt = con.prepareStatement(query);

			result = pStmt.executeUpdate();
			pStmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}

	int insertar(pilotoVO Piloto) {

		int result = 0;
		Connection con = utils.conectarBD();

		String query = "INSERT INTO Piloto values (?,?,?,?,?,?)";

		try {
			PreparedStatement pStmt = con.prepareStatement(query);

			if (Piloto.getDni() != null && Piloto.getNombre() != null && Integer.valueOf(Piloto.getEdad()) != 0
					&& Piloto.getSexo() != null && Piloto.getDireccion() != null && Piloto.getId_coche() != null) {

				pStmt.setString(1, Piloto.getDni());
				pStmt.setString(2, Piloto.getNombre());
				pStmt.setString(3, Piloto.getEdad());
				pStmt.setString(4, Piloto.getSexo());
		        pStmt.setString(5, Piloto.getDireccion());
		        pStmt.setString(6, Piloto.getId_coche());
		        
				result = pStmt.executeUpdate();

				pStmt.close();
				
			} else
				result = 0;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	int actualizar(pilotoVO piloto) {
		int result = 0;
		String query = "UPDATE Piloto SET dni=?,nombre=?,edad=?,sexo=?,direccion=?,Coche_idCoche=?;";
		
		Connection con=utils.conectarBD();
		
		try {
			PreparedStatement pStmt=con.prepareStatement(query);
			
			pStmt.setString(1, piloto.getDni());
			pStmt.setString(2, piloto.getNombre());
			pStmt.setString(3, piloto.getEdad());
			pStmt.setString(4, piloto.getSexo());
			pStmt.setString(5, piloto.getDireccion());
			pStmt.setString(6, piloto.getId_coche());
			
			result=pStmt.executeUpdate();
			pStmt.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return result;
	}
	
	pilotoVO cargarPiloto(String dni) {
		int result=0;
		String query="SELECT * FROM Piloto WHERE idCarreras="+dni;
		pilotoVO pilotoDevuelto = new pilotoVO();
		
		
		Connection con= utils.conectarBD();
		
		try {
			PreparedStatement pStmt=con.prepareStatement(query);
			ResultSet res=pStmt.executeQuery();
		    
			pilotoDevuelto.setDni(res.getString("dni"));
			pilotoDevuelto.setNombre(res.getString("nombre"));
			pilotoDevuelto.setEdad(res.getString("edad"));
			pilotoDevuelto.setSexo(res.getString("sexo"));
			pilotoDevuelto.setDireccion(res.getString("direccion"));
			pilotoDevuelto.setId_coche(res.getString("Coche_idCoche"));
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		return pilotoDevuelto;
	}
	
	cocheVO cargar(String codXX) {
		int result=0;
		String query="SELECT * FROM Coche WHERE idCarreras="+codXX;
		cocheVO cocheDevuelto = new cocheVO();
		
		
		Connection con= utils.conectarBD();
		
		try {
			PreparedStatement pStmt=con.prepareStatement(query);
			ResultSet res=pStmt.executeQuery();
		    
			cocheDevuelto.setIdCoche(res.getString("idCoche"));
			cocheDevuelto.setMarca(res.getString("marca"));
			cocheDevuelto.setModelo(res.getString("modelo"));
			cocheDevuelto.setPeso(res.getInt("peso"));
			cocheDevuelto.setPotencia(res.getInt("potencia"));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		return cocheDevuelto;
	}
}
