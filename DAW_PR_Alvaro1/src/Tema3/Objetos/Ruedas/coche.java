package Tema3.Objetos.Ruedas;

public class coche {

	Ruedas rueda = new Ruedas();
	Suspension suspension = new Suspension();

	int ruedas[] = new int[4];
	int suspensiones[] = new int[4];

	/**
	 * Cambiara la rueda en la posición introducida, devolverá true si ha ido bien y
	 * false si la posición no existe o la rueda no tiene los campos correctos.
	 * 
	 * @param posicion
	 * @param posicion2
	 * @return 1 si correcto 0 sino
	 */
	int cambiarRueda(int posicion, int posicion2) {
		if (posicion >= 0 && posicion <= 3) {
			if (posicion2 >= 0 && posicion <= 3) {
				return 1;
			} else
				return 0;
		} else
			return 0;
	}

	/**
	 * Igual que cambiar rueda pero con suspensión.
	 * 
	 * @param posición
	 * @param suspension
	 * @return 1 si se pudo 0 sino
	 */
	int cambiarSuspension(int posicion) {
		if (posicion >= 0 && posicion <= 3) {
			return 1;
		} else
			return 0;

	}

	/**
	 * Incrementa o disminuye en la cantidad introducida la presión de la rueda del
	 * coche que está en la posición introducida, devolverá true si va todo bien
	 * false si la posición no es correcta o la presión es mayor de 100 o inferior a
	 * 0.
	 * 
	 * @param posicion
	 * @param presion
	 * @return
	 */
	int ajustarPresion(int posicion, float presion) {
		if (posicion >= 0 && posicion <= 3) {
			if (presion >= 0 && presion <= 100) {
				return 1;
			} else
				return 0;
		} else
			return 0;

	}
}
