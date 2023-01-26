package Tema3.Objetos.Ruedas;

public class Ruedas {

	// Constantes
	public static final int DELANTERA_DERECHA = 0;
	public static final int DELANTERA_IZQUIERDA = 1;
	public static final int TRASERA_DERECHA = 2;
	public static final int TRASERA_IZQUIERDA = 3;

	// Atributos del objeto // marca, radio, perfil, tipo,desgaste,presion, precio

	String marca;
	String tipo;
	float presion;
	float precio;
	float radio;
	float perfil;
	float desgaste;
	int posicion;

	Ruedas() {
		String marca = "";
		String tipo = "";
		float presion = 0;
		float precio = 0;
		float radio = 0;
		float perfil = 0;
		float desgaste = 0;
		int posicion = 0;
	}

}
