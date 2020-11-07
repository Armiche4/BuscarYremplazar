

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;

import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BuscarRemplazar extends Application {
	
	// model
	

	
	// view
	
	private TextField nombreText;
	private TextField apellidosText;


	private RadioButton hombreRadio;
	private RadioButton mujerRadio,perroRadio,perraRadio;


	@Override
	public void start(Stage primaryStage) throws Exception {

		nombreText = new TextField();
		nombreText.setPromptText("Nombre del alumno");

		apellidosText = new TextField();
		apellidosText.setPromptText("Apellidos del alumno");


		
		
		VBox vbox =new VBox();
		
		Button boton1 = new Button("boton1");
		Button boton2 = new Button("boton2");	
		Button boton3 = new Button("boton3");
		Button boton4 = new Button("boton4");
		Button boton5 = new Button("boton5");
		

		vbox.getChildren().addAll(boton1,boton2,boton3,boton4,boton5);
		
		
	
		hombreRadio = new RadioButton("Mayusculas y minusculas");
		mujerRadio = new RadioButton("expresion regular");
		perroRadio = new RadioButton("buscar hacia atras");
		perraRadio = new RadioButton("Representar los resultados");
		

		
				
		ToggleGroup radioGroup = new ToggleGroup();
		radioGroup.getToggles().addAll(hombreRadio, mujerRadio,perroRadio,perraRadio);
		
		HBox radio =new HBox(5,new VBox(5,hombreRadio,mujerRadio ),new VBox(5,perroRadio,perraRadio ) );
		
		GridPane root = new GridPane();
		root.setPadding(new Insets(5));
		root.setHgap(5);
		root.setVgap(5);
//	root.setGridLinesVisible(true);
	root.setStyle("-fx-background-color: orange;");
		root.addRow(0, new Label("Nombre:"), nombreText);
		root.addRow(1, new Label("Apellidos:"), apellidosText);
		root.addRow(2, new Label(""),  radio );
	
		root.add(boton1,2,0);
		root.add(boton2,2,1);
		root.add(boton3,2,2);
		root.add(boton4,2,3);
		root.add(boton5,2,4);
		
		

	
		
		ColumnConstraints [] cols = {
				new ColumnConstraints(),	
				new ColumnConstraints(),
				new ColumnConstraints(),	
					
			};
			root.getColumnConstraints().setAll(cols);
			//restircciones a las columnas, como estan colocadas
			cols[0].setHalignment(HPos.RIGHT);
			cols[1].setHgrow(Priority.ALWAYS);
			cols[1].setFillWidth(true);
			//cols[2].setHgrow(Priority.ALWAYS);
			cols[2].setFillWidth(false);
			//cols[2].setHalignment(HPos.RIGHT);
			//GridPane.setFillWidth(radio, false);
			
		
				
		
		Scene scene = new Scene(root, 400, 350);
		
		primaryStage.setTitle("Ejemplo de GridPane");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		

		
	}



	public static void main(String[] args) {
		launch(args);
	}

}