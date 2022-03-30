package ca.senecacollege.circle;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Circlefx extends Application{

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage ps) throws Exception {
		Pane pn = new Pane();
		
		Circle circ = new Circle();
		//circ.setCenterX(300);
		circ.centerXProperty().bind(pn.widthProperty().divide(2));
		//circ.setCenterY(300);
		circ.centerYProperty().bind(pn.heightProperty().divide(2));
		circ.setRadius(100);
		circ.setStroke(Color.BLACK);
		circ.setFill(Color.WHITE);
		
		pn.getChildren().add(circ);
		
		Scene sc = new Scene(pn,600,600);
		ps.setTitle("Circle Window");
		ps.setScene(sc);
		//ps.setResizable();
		ps.show();
		
		Pane pn1 = new Pane();
		Button btnok = new Button("OK");
		pn1.getChildren().add(btnok);
		Scene sc1 = new Scene(pn1,300,300);
		Stage stg = new Stage();
		stg.setTitle("This next window");
		stg.setScene(sc1);
		stg.show();
		
	}}
