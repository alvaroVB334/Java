package PracticaObjetos;

public class Coche {
	private int potencia;
	private int peso;
	private String nombre;
	private String modelo;
	private String marca;
	private String color;
	private int velocidad;

	final String COLOR1 = "Azul";
	final String COLOR2 = "Rojo";
	final String COLOR3 = "Amarillo";
	final String COLOR4 = "Negro";
	final String COLOR5 = "Blanco";

	public static final int DELANTERA_DERECHA = 0;
	public static final int DELANTERA_IZQUIERDA = 1;
	public static final int TRASERA_DERECHA = 2;
	public static final int TRASERA_IZQUIERDA = 3;

	public Ruedas listaRuedas[];
	public Suspension listaSuspensiones[];

	Coche() { // Constructor
		int potencia = 0;
		int peso = 0;
		String nombre = "";
		String modelo = "";
		String marca = "";
		String color = "";
		int velocidad = 0;

		for (int i = 0; i < 4; i++) { // En cada parte del array creamos una rueda con su suspension
			listaRuedas[i] = new Ruedas();
			listaSuspensiones[i] = new Suspension();
		}
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public String getCOLOR1() {
		return COLOR1;
	}

	public String getCOLOR2() {
		return COLOR2;
	}

	public String getCOLOR3() {
		return COLOR3;
	}

	public String getCOLOR4() {
		return COLOR4;
	}

	public String getCOLOR5() {
		return COLOR5;
	}

	/**
	 * Recibe un entero con el porcentaje que se pisa el acelerador, y incrementará
	 * la velocidad multiplicando la velocidad por dicho porcentaje dividido por
	 * 100.
	 * 
	 * @param velocidad
	 * @param porcentaje
	 * @return
	 */
	public int Acelerar(int velocidad, int porcentaje) {
		velocidad = (porcentaje * velocidad) / 10;
		return velocidad;
	}

	/**
	 * Recibe un color y modifica el color y añade al final del nombre el color
	 * 
	 * @param color
	 * @return
	 */
	public String pintar(String color) {
		String colorFinal = color;
		return colorFinal;
	}

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
