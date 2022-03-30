package ca.senecacollege.circle;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ButtenEvents extends Application {
	public static void main(String[] args) {
		launch(args);
	}	
	
	@Override
	public void start(Stage ps) throws Exception {
		HBox hb = new HBox(10);
		//VBox
		hb.setAlignment(Pos.CENTER);
		Button btnOK = new Button("OK");
		Button btnCan = new Button("Cancle");
		
		hb.getChildren().addAll(btnOK,btnCan);
		
		
		OkbtnHan okBtn = new OkbtnHan();
		btnOK.setOnAction(okBtn);
		CanbtnHan canBtn = new CanbtnHan();
		btnCan.setOnAction(canBtn);
		
		Scene sc = new Scene(hb,600,600);
		ps.setTitle("Circle Window");
		ps.setScene(sc);
		//ps.setResizable();
		ps.show();
		
	}
}

class CanbtnHan implements EventHandler <ActionEvent>{
	@Override
	public void handle(ActionEvent arg0) {
		System.out.println("Cancel button is clicked");
	}

}
