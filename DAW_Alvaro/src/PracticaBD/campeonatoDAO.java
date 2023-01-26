package PracticaBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class campeonatoDAO {

	List<carrerasVO> listaCarreras = new ArrayList<>();

	int eliminar(String codXX) {

		int result = 1;
		Connection con = utils.conectarBD();

		String query = "DELETE FROM campeonato2 WHERE idcampeonato2=" + codXX + ";";

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

	public static int insertar(campeonatoVO Campeonato) {

		int result = 0;
		Connection con = utils.conectarBD();

		String query = "INSERT INTO campeonato2 values (?,?,?,?,?,?)";

		try {
			PreparedStatement pStmt = con.prepareStatement(query);

			if (Campeonato.getNombre() != null && Campeonato.getAño() != 0 && Campeonato.getNumPilotos() != 0
					&& Campeonato.getNumCircuitos() != 0 && Campeonato.getPilotoGanador() != null
					&& Campeonato.getIdCampeonato() != null) {

				pStmt.setString(1, Campeonato.getNombre());
			    pStmt.setInt(2, Campeonato.getAño());
			    pStmt.setInt(3, Campeonato.getNumPilotos());
			    pStmt.setInt(4, Campeonato.getNumCircuitos());
			    pStmt.setString(5, Campeonato.getPilotoGanador());
			    pStmt.setString(6, Campeonato.getIdCampeonato());
				
				result = pStmt.executeUpdate();

				pStmt.close();
			}else result=0;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	int actualizar(campeonatoVO Campeonato) {
		int result = 0;
		String query = "UPDATE campeonato2 SET nombre=?,año=?,numPilotos=?,numCircuitos=?,pilotoGanador=? WHERE idcampeonato2=?;";
		
		Connection con=utils.conectarBD();
		
		try {
			PreparedStatement pStmt=con.prepareStatement(query);
			
			pStmt.setString(1, Campeonato.getNombre());
			pStmt.setInt(2, Campeonato.getAño());
			pStmt.setInt(3, Campeonato.getNumPilotos());
			pStmt.setInt(4, Campeonato.getNumCircuitos());
			pStmt.setString(5, Campeonato.getPilotoGanador());
			pStmt.setString(6, Campeonato.getIdCampeonato());
			
			
			result=pStmt.executeUpdate();
			pStmt.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return result;
	}
	
	campeonatoVO cargar(String codXX) {
		int result=0;
		String query="SELECT * FROM campeonato2 WHERE idcampeonato2="+codXX;
		campeonatoVO campeonatoDevuelto = new campeonatoVO();
		
		
		Connection con= utils.conectarBD();
		
		try {
			PreparedStatement pStmt=con.prepareStatement(query);
			ResultSet res=pStmt.executeQuery();
		    
			campeonatoDevuelto.setNombre(res.getString("nombre"));
			campeonatoDevuelto.setAño(res.getInt("año"));
			campeonatoDevuelto.setNumPilotos(res.getInt("numPilotos"));
			campeonatoDevuelto.setNumCircuitos(res.getInt("numCircuitos"));
			campeonatoDevuelto.setPilotoGanador(res.getString("pilotoGanador"));
			campeonatoDevuelto.setIdCampeonato(res.getString("idcampeonato2"));
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		return campeonatoDevuelto;
	}
	
	ArrayList<carrerasVO> cargarCarreras(String codCampeonato){
		
		String query ="SELECT * FROM Carreras WHERE campeonato2_idcampeonato2="+codCampeonato;

		Connection con= utils.conectarBD();
		
	    try {
			PreparedStatement pStmt= con.prepareStatement(query);
			ResultSet res= pStmt.executeQuery();
			
			carrerasVO carrera1 = new carrerasVO();
			
			carrera1.setNumVueltas(res.getInt("numVueltas"));
			carrera1.setVueltaRapida(res.getInt("vueltaRapida"));
			carrera1.setNumAccidentes(res.getInt("numAccidentes"));
			carrera1.setFecha(res.getString("fecha"));
			carrera1.setIdCarreras(res.getString("idCarreras"));
			carrera1.setId_Campeonato(res.getString("campeonato2_idcampeonato2"));
			carrera1.setId_Circuitos(res.getString("Circuitos_idCircuitos"));
			
			this.listaCarreras.add(carrera1);
			
			while(res.next()) {
				carrerasVO carrera2 = new carrerasVO();
				
				carrera2.setNumVueltas(res.getInt("numVueltas"));
				carrera2.setVueltaRapida(res.getInt("vueltaRapida"));
				carrera2.setNumAccidentes(res.getInt("numAccidentes"));
				carrera2.setFecha(res.getString("fecha"));
				carrera2.setIdCarreras(res.getString("idCarreras"));
				carrera2.setId_Campeonato(res.getString("campeonato2_idcampeonato2"));
				carrera2.setId_Circuitos(res.getString("Circuitos_idCircuitos"));
				
				this.listaCarreras.add(carrera2);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return (ArrayList<carrerasVO>) this.listaCarreras;
	}
	
	int cantidadCarreras(String codCampeonato) {
		
		int resultado=0; //Ojo al 0 que a lo mejor hay que poner +1 pk la primera row no te la cuenta
		String query="SELECT * FROM Carreras WHERE campeonato2_idcampeonato2="+codCampeonato;
		
		Connection con=  utils.conectarBD();
		
		try {
			PreparedStatement pStmt=con.prepareStatement(query);
			ResultSet res= pStmt.executeQuery();
			
			while(res.next()) {
				resultado=resultado+1;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return resultado;
	}
	
}
