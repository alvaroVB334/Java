package entornos;

public class Calculadora {

	public long factorial(int x) {
		long factorial = 1;
		for (int i = x; i != 1; i--) {
			factorial = factorial * i;
		}
		return factorial;
	}

	public int suma(int x, int y) {
		// TODO Auto-generated method stub
		return x + y;
	}

	/**
	 * Genera un numero aleatorio entre -10k y 10k
	 * 
	 * @return Nº aleatorio entre -10000 y 10000
	 */
	public static int generarAleatorio() {
		int num = 0;

		if (Math.random() > 0.5) {
			num = -((int) Math.random() * 10000);
		} else {
			num = ((int) Math.random() * 10000);
		}

		return num;
	}

	public static float division(float dividendo, float divisor) {

		return (dividendo / divisor);
	}
}
