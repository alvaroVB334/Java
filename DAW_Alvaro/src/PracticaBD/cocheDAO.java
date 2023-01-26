package PracticaBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class cocheDAO {

	int eliminar(String codXX) {

		int result = 1;
		Connection con = utils.conectarBD();

		String query = "DELETE FROM Coche WHERE idCoche=" + codXX + ";";

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
	int insertar(cocheVO Coche) {

		int result = 0;
		Connection con = utils.conectarBD();

		String query = "INSERT INTO Carreras values (?,?,?,?,?)";

		try {
			PreparedStatement pStmt = con.prepareStatement(query);

		 if(Coche.getIdCoche()!=null && Coche.getMarca()!= null && Coche.getModelo()!=null && Coche.getPeso()!=0 && Coche.getPotencia()!=0) {
			 
			 pStmt.setString(1, Coche.getIdCoche());
			 pStmt.setString(2, Coche.getMarca());
			 pStmt.setString(3, Coche.getModelo());
			 pStmt.setInt(4, Coche.getPeso());
			 pStmt.setInt(5, Coche.getPotencia());
			 
			 result = pStmt.executeUpdate();

			 pStmt.close();
			 
		 }else result=0;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	int actualizar(cocheVO Coche) {
		int result = 0;
		String query = "UPDATE Coche SET marca=?,modelo=?,peso=?,potencia=? WHERE idCoche=?;";
		
		Connection con=utils.conectarBD();
		
		try {
			PreparedStatement pStmt=con.prepareStatement(query);
			
			pStmt.setString(1, Coche.getMarca());
			pStmt.setString(2, Coche.getModelo());
			pStmt.setInt(3, Coche.getPeso());
			pStmt.setInt(4, Coche.getPotencia());
			pStmt.setString(5, Coche.getIdCoche());
			
			result=pStmt.executeUpdate();
			pStmt.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return result;
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
