
package entornos;

public class miniCalculadoraEjemplo {

	/**
	 * Esta función devuelve el valor absoluto de un número que se le indique
	 * 
	 * @see <a href="https://es.wikipedia.org/wiki/Valor_absoluto"</a>
	 * @author Álvaro Vera Becerra
	 * @param Num double
	 * @return Numero en valo absoluto
	 * @version 1.0.0
	 * 
	 */
	static double valorAbsoluto(double num) {

		if (num < 0) {
			return -num;
		} else
			return num;
	}

	/**
	 * Esta función devuelve la raiz cuadrada que se le introduzca como parametro
	 * 
	 * @see <a href="https://es.wikipedia.org/wiki/Ra%C3%ADz_cuadrada"</a>
	 * @author Álvaro Vera Becerra
	 * @param Numero double
	 * @return Raiz cuadrada
	 * @version 1.0.1
	 */
	static double raizCuadrada(double num) {

		return Math.pow(num, 0.5);
	}
}
