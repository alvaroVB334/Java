package org.openfx.proyectoFX;

import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;

public class formularioRueda extends GridPane {

	Label marcalbl = new Label("Marca:"); //
	Label modelolbl = new Label("Modelo:");//
	Label pesolbl = new Label("Peso:");//
	Label componenteslbl = new Label("Componentes:");//
	Label dimensioneslbl = new Label("Dimensiones:");//
	Label estadolbl = new Label("Estado:");//
	Label idRuedalbl = new Label("idRueda:");
	Label Coche_idCochelbl = new Label("idCoche:");
	Label fechalbl = new Label("Fecha:");
	Label sesionlbl = new Label("Sesion:");

	TextField txtMarca = new TextField();
	TextField txtModelo = new TextField();
	TextField txtDimensiones = new TextField();
	TextField txtidRueda = new TextField();
	TextField txtCoche_idCochelbl = new TextField();
	TextField txtFecha = new TextField();
	TextField txtSesion = new TextField();

	ChoiceBox<Integer> chPeso = new ChoiceBox<Integer>();
	ChoiceBox<String> chEstado = new ChoiceBox<String>();

	RadioButton radDuro = new RadioButton("Duro");
	RadioButton radMedio = new RadioButton("Medio");
	RadioButton radBlando = new RadioButton("Blando");

	ToggleGroup grpComp = new ToggleGroup();

	Button btnInsertar = new Button("Insertar");

	public formularioRueda() {

		radDuro.setToggleGroup(grpComp);
		radMedio.setToggleGroup(grpComp);
		radBlando.setToggleGroup(grpComp);

		for (int i = 20; i < 30; i++)
			chPeso.getItems().add(i);

		chEstado.getItems().add("Bueno");
		chEstado.getItems().add("Medio");
		chEstado.getItems().add("Malo");

		this.add(marcalbl, 0, 0);
		this.add(txtMarca, 1, 0);

		this.add(modelolbl, 0, 1);
		this.add(txtModelo, 1, 1);

		this.add(dimensioneslbl, 0, 2);
		this.add(txtDimensiones, 1, 2);

		this.add(idRuedalbl, 0, 3);
		this.add(txtidRueda, 1, 3);

		this.add(Coche_idCochelbl, 0, 4);
		this.add(txtCoche_idCochelbl, 1, 4);

		this.add(fechalbl, 0, 5);
		this.add(txtFecha, 1, 5);

		this.add(sesionlbl, 0, 6);
		this.add(txtSesion, 1, 6);

		this.add(pesolbl, 0, 7);
		this.add(chPeso, 1, 7);

		this.add(estadolbl, 0, 8);
		this.add(chEstado, 1, 8);

		this.add(componenteslbl, 0, 9);
		this.add(radDuro, 1, 9);
		this.add(radMedio, 2, 9);
		this.add(radBlando, 3, 9);

		this.add(btnInsertar, 3, 10);

	}
}
