package Tema3;

public class RPGUtils {

	// Constantes
	public static final int DADO_8 = 8;
	public static final int DADO_10 = 10;
	public static final int DADO_20 = 20;
	public static final int DADO_100 = 100;
	public static final int DADO_DEFECTO = 20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 20; i++) {

			System.out.println("Tirada: " + tirarDados());
		}

	}

	/**
	 * Funcion que realizada una tirada de dados
	 * 
	 * @return
	 */
	static int tirarDados() {
		int tirada = 0;

		// generamos aleatoriamente un numero

		tirada = (int) (Math.random() * DADO_DEFECTO + 1);
		return tirada;
	}

	static int tirarDados(int tipoDado) {

		int tirada = 0;

		switch (tipoDado) {
		case DADO_10:
			tirada = (int) (Math.random() * DADO_10 + 1);
			break;

		case DADO_20:
			tirada = (int) (Math.random() * DADO_20 + 1);
			break;

		case DADO_100:
			tirada = (int) (Math.random() * DADO_100 + 1);
			break;

		case DADO_8:
			tirada = (int) (Math.random() * DADO_8 + 1);
			break;
		}

		return tirada; // devolvemos la tirada
	}

}// Cierre de clase
