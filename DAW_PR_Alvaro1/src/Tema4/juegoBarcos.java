package Tema4;

public class juegoBarcos {

	public static final char AGUA = 'A'; // Los char van entre comillas simple
	public static final char DISPARO = 'D';
	public static final char TOCADO = 'T';
	public static final char BARCO = 'B';

	public static final int ARRIBA = 0;
	public static final int ABAJO = 1;
	public static final int IZQ = 2;
	public static final int DER = 3;

	public static char tableroJuego[][]; // Tablero de juego

	public juegoBarcos() {
		super();
		tableroJuego = new char[10][10];
		inicializarJuego();
	}

	public static void inicializarJuego() {

		// Recorremos los 10 array

		for (int i = 0; i < tableroJuego.length; i++) {

			// barcosNavegando[i] es un array lo recorremos
			for (int j = 0; j < tableroJuego[i].length; j++) {

				tableroJuego[i][j] = AGUA;
			}
		}

	}

	public void mostrarTablero() {

		for (int i = 0; i < tableroJuego.length; i++) {

			// barcosNavegando[i] es un array lo recorremos
			for (int j = 0; j < tableroJuego[i].length; j++) {

				tableroJuego[i][j] = AGUA;
				System.out.print(tableroJuego[i][j] + " ");// Mostramos por pantalla todas las posiciones
			}
			System.out.println();// pasamos a la siguiente linea compo si fuese un \n vamos
		}

	}

	/**
	 * Posiciona aleatoriamente
	 * 
	 * @return un num entre 0 y 9
	 */
	int valorAleatorio() {
		return (int) (Math.random() * 10);
	}

	int generarDireccion() {
		return (int) (Math.random() * 4);
	}

	boolean posicionarBarco(int size) {

		int posInicialX = valorAleatorio();
		int posInicialY = valorAleatorio();
		boolean resultado = true;

		while (tableroJuego[posInicialX][posInicialY] != AGUA) {
			posInicialX = valorAleatorio();
			posInicialY = valorAleatorio();
		}

		int direccion = this.generarDireccion(); // Direccion en la que generamos el barco

		for (int i = 0; i < size; i++) {

			if (tableroJuego[posInicialX][posInicialY] != AGUA) {
				return false;
			}
		}

		return resultado;
	}

}
