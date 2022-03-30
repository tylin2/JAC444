package ca.senecacollege.circle;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ControlEx extends Application {
	
	private CircleP circp = new CircleP();
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage ps) throws Exception {
		HBox hb = new HBox(10);
		hb.setAlignment(Pos.CENTER);
		Button btnL = new Button("Large");
		Button btnS = new Button("Shrink");
		
		hb.getChildren().addAll(btnL,btnS);
		btnL.setOnAction(new LHandler());
		
//		btnS.setOnAction(new EventHandler<ActionEvent>() {
//
//			@Override
//			public void handle(ActionEvent arg0) {
//				circp.shrink();				
//			}
//			
//		});
		
		btnS.setOnAction(e->{circp.shrink();});

		BorderPane bp = new BorderPane();
		bp.setCenter(circp);
		bp.setBottom(hb);
		
		Scene sc = new Scene(bp,600,600);
		ps.setTitle("Button Window");
		ps.setScene(sc);
		ps.show();
		
	}
	class LHandler implements EventHandler <ActionEvent>{
		@Override
		public void handle(ActionEvent arg0) {
			circp.enlarge();
		}
	}
	
}


	

class CircleP extends StackPane {
	private Circle circ = new Circle(100);
	public CircleP() {
		getChildren().add(circ);
		circ.setStroke(Color.BLACK);
		circ.setFill(Color.WHITE);
	}
	
	public void enlarge() {
		circ.setRadius(circ.getRadius() + 5);
	}
	
	public void shrink () {		
		circ.setRadius(circ.getRadius() >5 ? circ.getRadius() - 10 : circ.getRadius());
	}
	
}

