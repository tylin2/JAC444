package ca.senecacollege.circle;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Form extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage ps) throws Exception {
		GridPane gp = new GridPane();
		gp.setAlignment(Pos.CENTER);
		gp.setHgap(6);
		gp.setVgap(6);
		
		gp.add(new Label("First Name: "),0, 0);
		TextField fn = new TextField();
		gp.add(fn, 1, 0);
		
		gp.add(new Label("Last Name: "), 1, 1);
		TextField ln = new TextField();
		gp.add(ln, 0, 1);
		
		Button btnA = new Button("Add Name");
		Button btnR = new Button("Read Name(s)");
		
		gp.add(btnR, 1, 3);
		gp.add(btnA, 1, 4);
		
		btnA.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				String fns = fn.getText();
				String lns = ln.getText();
				
				File file = new File("info.txt");
				try {
					FileWriter fr = new FileWriter(file, true);
					fr.write(fns + "\t");
					fr.write(lns + "\n");
					fr.close();
				}catch (IOException e) {
					
				}
				fn.clear();
				ln.clear();				
			}
			
		});
		
		btnR.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				Stage rs = new Stage();
				Pane p = new Pane();
				TextArea ta = new TextArea();
				
				p.getChildren().add(ta);
				StringBuffer sb = new StringBuffer();
				String lines = System.getProperty("line.separator");
				try {
					BufferedReader bf = new BufferedReader(new FileReader("info.txt"));
					String l;
					while((l=bf.readLine()) != null ) {
						System.out.println(l);
						sb.append(l);
						sb.append(lines);
					}
					ta.setText(sb.toString());
				} catch (FileNotFoundException fn) {}
				catch(IOException ex) {}
				
				Scene s1 = new Scene(p,400,400);
				rs.setScene(s1);
				rs.show();
			}
		});
		Scene sc = new Scene(gp,600,600);
		ps.setTitle("Form Window");
		ps.setScene(sc);
		ps.show();
		
	}

}
