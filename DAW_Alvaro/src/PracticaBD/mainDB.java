package PracticaBD;

public class mainDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		campeonatoVO campeonato1=new campeonatoVO("Campeonato Pruebas",2002,23,13,"Yo","cod04");
		
		campeonatoDAO.insertar(campeonato1);
	}

}
