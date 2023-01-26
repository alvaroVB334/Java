package org.openfx.proyectoFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class mainApp extends Application {

	@Override
	public void start(Stage stage) {
		formularioRueda formulario = new formularioRueda();

		var scene = new Scene(formulario, 800, 600);

		stage.setScene(scene);

		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
