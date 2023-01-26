package PracticaBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class carreraDAO {

	List<pilotoVO> listaPilotos = new ArrayList<>();

	int eliminar(String codXX) {

		int result = 1;
		Connection con = utils.conectarBD();

		String query = "DELETE FROM Carreras WHERE idCarreras=" + codXX + ";";

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

	int insertar(carrerasVO Carrera) {

		int result = 0;
		Connection con = utils.conectarBD();

		String query = "INSERT INTO Carreras values (?,?,?,?,?,?,?)";

		try {
			PreparedStatement pStmt = con.prepareStatement(query);

			if (Carrera.getNumVueltas() != 0 && Carrera.getVueltaRapida() != 0 // Comprobamos que no es nulo
					&& Carrera.getFecha() != null && Carrera.getId_Campeonato() != null
					&& Carrera.getIdCarreras() != null && Carrera.getId_Circuitos() != null) {

				pStmt.setInt(1, Carrera.getNumVueltas());
				pStmt.setInt(2, Carrera.getVueltaRapida());
				pStmt.setInt(3, Carrera.getNumAccidentes());
				pStmt.setString(4, Carrera.getFecha());
				pStmt.setString(5, Carrera.getIdCarreras());
				pStmt.setString(6, Carrera.getId_Campeonato());
				pStmt.setString(7, Carrera.getId_Circuitos());

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

	int actualizar(carrerasVO Carrera) {
		int result = 0;
		String query = "UPDATE Carreras SET numVueltas=?,vueltaRapida=?,numAccidentes=?,fecha=?,campeonato2_idcampeonato2=?,Circuitos_idCircuitos=? WHERE idCarreras=?;";
		
		Connection con=utils.conectarBD();
		
		try {
			PreparedStatement pStmt=con.prepareStatement(query);
			
			pStmt.setInt(1, Carrera.getNumVueltas());
			pStmt.setInt(2, Carrera.getVueltaRapida());
			pStmt.setInt(3, Carrera.getNumAccidentes());
			pStmt.setString(4, Carrera.getFecha());
			pStmt.setString(5, Carrera.getId_Campeonato());
			pStmt.setString(6, Carrera.getId_Circuitos());
			pStmt.setString(7, Carrera.getIdCarreras());
			
			result=pStmt.executeUpdate();
			pStmt.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return result;
	}
	
	carrerasVO cargar(String codXX) {
		int result=0;
		String query="SELECT * FROM Carreras WHERE idCarreras="+codXX;
		carrerasVO carreraDevuelta = new carrerasVO();
		
		
		Connection con= utils.conectarBD();
		
		try {
			PreparedStatement pStmt=con.prepareStatement(query);
			ResultSet res=pStmt.executeQuery();
		    
			carreraDevuelta.setNumVueltas(res.getInt("numVueltas"));
			carreraDevuelta.setVueltaRapida(res.getInt("vueltaRapida"));
			carreraDevuelta.setNumAccidentes(res.getInt("numAccidentes"));
			carreraDevuelta.setFecha(res.getString("fecha"));
			carreraDevuelta.setIdCarreras(res.getString("idCarreras"));
			carreraDevuelta.setId_Campeonato(res.getString("campeonato2_idcampeonato2"));
			carreraDevuelta.setId_Circuitos(res.getString("Circuitos_idCircuitos"));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		return carreraDevuelta;
	}
	
	ArrayList<pilotoVO> cargarPilotos (String codCarrera){
		
		String query="SELECT Piloto_dni FROM Piloto_has_Carreras WHERE Carreras_idCarreras="+codCarrera;
		pilotoVO piloto1 = new pilotoVO();
		
		Connection con= utils.conectarBD();
		
	    try {
			PreparedStatement pStmt = con.prepareStatement(query);
			ResultSet res= pStmt.executeQuery();
			
			String query2 = "SELECT * FROM campeonato2.Piloto WHERE dni =" +res.getString("Piloto_dni");
			
			PreparedStatement pStmt2 = con.prepareStatement(query2);
		    ResultSet res2=pStmt2.executeQuery();
		    
		    piloto1.setDni(res2.getString("dni"));
		    piloto1.setNombre(res2.getString("nombre"));
		    piloto1.setEdad(res2.getString("edad"));
			piloto1.setSexo(res2.getString("sexo"));
			piloto1.setDireccion(res2.getString("direccion"));
			piloto1.setId_coche(res2.getString("Coche_idCoche"));
			
			this.listaPilotos.add(piloto1);
			
			while(res.next()) {
			 pStmt2 = con.prepareStatement(query2);
			 res2=pStmt2.executeQuery();
			 
			    piloto1.setDni(res2.getString("dni"));
			    piloto1.setNombre(res2.getString("nombre"));
			    piloto1.setEdad(res2.getString("edad"));
				piloto1.setSexo(res2.getString("sexo"));
				piloto1.setDireccion(res2.getString("direccion"));
				piloto1.setId_coche(res2.getString("Coche_idCoche"));
				
				this.listaPilotos.add(piloto1);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return (ArrayList<pilotoVO>) this.listaPilotos;
	}
}
