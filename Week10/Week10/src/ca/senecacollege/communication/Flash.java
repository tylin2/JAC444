package ca.senecacollege.communication;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Flash extends Application {
	private String text = "";

	public static void main(String[] args) {
		launch(args);	

	}

	@Override
	public void start(Stage ps) throws Exception {
		StackPane sp = new StackPane();
		Label lblt = new Label("Flashing");
		sp.getChildren().add(lblt);
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					while(true) {
						if(lblt.getText().trim().length() == 0)
							text = "welcome";
						else
							text = "";
						Platform.runLater(new Runnable() {
							@Override
							public void run() {
								lblt.setText(text);
							}
						});
						Thread.sleep(200);
					}
				} catch (InterruptedException ex) {
					
				} 
			}
		}).start();
		
		Scene sc = new Scene(sp,200,200);
		ps.setScene(sc);
		ps.show();
		
	}

}
