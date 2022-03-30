package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;


public class Main extends Application {
	@Override
	public void start(Stage ps) {
		
		StackPane sp = new StackPane();
		Button btnOK = new Button("OK");
		sp.getChildren().add(btnOK);
		
		Scene sc = new Scene(sp,600,600);
		
		ps.setTitle("My First Window");
		ps.setScene(sc);
		ps.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
