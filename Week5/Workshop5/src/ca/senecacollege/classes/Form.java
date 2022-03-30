/**********************************************
Workshop 5
Course:JAC444 - W
Last Name:Ting-Yeh
First Name:Lin
ID:141726182
Section:NEE
This assignment represents my own work in accordance with Seneca Academic Policy.
TING-YEH LINE
Date:2021/2/27
**********************************************/
package ca.senecacollege.classes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Form extends Application{
	int letter = 1;
	
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
		gp.add(fn, 1, 0, 5, 1);
		
		gp.add(new Label("Last Name: "), 0, 2);
		TextField ln = new TextField();
		gp.add(ln, 1, 2, 5, 1);
		
		gp.add(new Label("City: "), 0, 4);
		TextField c = new TextField();
		gp.add(c, 1, 4);		

		gp.add(new Label("Province: "), 2, 4);
		ChoiceBox<String> p = new ChoiceBox<String>();
		p.getItems().add("AB");
        p.getItems().add("BC");
        p.getItems().add("MB");
        p.getItems().add("NB");
        p.getItems().add("NL");
        p.getItems().add("NS");
        p.getItems().add("ON");
        p.getItems().add("PE");
        p.getItems().add("QC");
        p.getItems().add("SK");
        HBox pr = new HBox(p);
		gp.add(pr, 3, 4);
		
		gp.add(new Label("Postal Code: "), 4, 4);
		TextField pc = new TextField();
		gp.add(pc, 5, 4);
		
		Button add = new Button("Add");
		add.setPrefWidth(225);
		add.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {				
				String add = fn.getText() + "," + ln.getText() + "," + c.getText() + "," + p.getSelectionModel().getSelectedItem() + "," + pc.getText(); 
				int recordLength = 79;
				try {
					RandomAccessFile file = new RandomAccessFile("info.txt", "rw");
					file.seek(file.length());
					file.writeUTF(add);					
					for (int i = 0; i < recordLength - add.length(); i++) {
					    file.writeByte(0);
					}
					file.writeBytes("\n");
					file.close();					
				}catch (IOException e) {
					
				}
				fn.clear();
				ln.clear();
				c.clear();
				p.setValue(null);
				pc.clear();
			}
			
		});
		
		Button first = new Button("First");
		first.setPrefWidth(225);
		first.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("First");
				try {
					letter = 1;
					RandomAccessFile file = new RandomAccessFile("info.txt", "r");
					file.skipBytes(2);
					String fr = file.readLine();
					letter += fr.length() + 1;
					String[] arrOfFr = fr.split(",");
					fn.setText(arrOfFr[0]);
					ln.setText(arrOfFr[1]);
					c.setText(arrOfFr[2]);
					p.setValue(arrOfFr[3]);
					pc.setText(arrOfFr[4]);					
					file.close();					
				}catch (IOException e) {
					
				}				
			}			
		});
		
		Button next = new Button("Next");
		next.setPrefWidth(225);
		next.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("Next: " + letter);										
				try (RandomAccessFile file = new RandomAccessFile("info.txt", "r")){
					if(letter < file.length() - 1) {						
						if(letter == 1) {
							letter++;
						} else if(letter != 2){
							letter += 1;
							if(letter % 82 != 81) {
								int des = letter % 82;
								letter -= des;
							}
						} 																	
						file.skipBytes(letter);
						String fr = file.readLine();						
						letter += fr.length();
						String[] arrOfFr = fr.split(",");
						fn.setText(arrOfFr[0]);
						ln.setText(arrOfFr[1]);
						c.setText(arrOfFr[2]);
						p.setValue(arrOfFr[3]);
						pc.setText(arrOfFr[4]);
					}					
					file.close();					
				}catch (IOException e) {
					
				}				
			}			
		});
		
		Button previous = new Button("Previous");
		previous.setPrefWidth(225);
		previous.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("Previous: " + letter);
				if(letter > 2) {
					StringBuilder builder = new StringBuilder();
					try {
						RandomAccessFile file = new RandomAccessFile("info.txt", "r");
						if(letter % 82 != 81) {
							int des = letter % 82;
							letter -= des;
						}
						if(letter > 163) {
							letter -= 83;
						} else {							
							letter = 80;
						}
						file.seek(letter);
						for(long i = letter; i>=0; i--){
					        file.seek(i);
					        char c;				        
					        c = (char)file.read();
					        if(c == '\n' || c == '"'){
					          break;
					        } 
					        builder.append(c);
						}					
						String fr = builder.reverse().toString();
						String[] arrOfFr = fr.split(",");
						fn.setText(arrOfFr[0]);
						ln.setText(arrOfFr[1]);
						c.setText(arrOfFr[2]);
						p.setValue(arrOfFr[3]);
						pc.setText(arrOfFr[4]);						
						letter++;
						file.close();					
					}catch (IOException e) {
						
					}
					
				}		
			}			
		});
		
		Button last = new Button("Last");
		last.setPrefWidth(225);
		last.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("Last");
				StringBuilder builder = new StringBuilder();
				try {
					RandomAccessFile file = new RandomAccessFile("info.txt", "r");
					long le = file.length() - 2;
					file.seek(le);
					for(long i = le; i>=0; i--){
				        file.seek(i);
				        char c;				        
				        c = (char)file.read();
				        if(c == '\n'){
				          break;
				        } 
				        builder.append(c);
					}					
					String fr = builder.reverse().toString();
					String[] arrOfFr = fr.split(",");
					fn.setText(arrOfFr[0]);
					ln.setText(arrOfFr[1]);
					c.setText(arrOfFr[2]);
					p.setValue(arrOfFr[3]);
					pc.setText(arrOfFr[4]);
					letter = (int) file.length() - 1;
					System.out.println(letter);//delete
					file.close();					
				}catch (IOException e) {
					
				}				
			}			
		});
		
		Button update = new Button("Update");
		update.setPrefWidth(225);
		update.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {				
				String add = fn.getText() + "," + ln.getText() + "," + c.getText() + "," + p.getSelectionModel().getSelectedItem() + "," + pc.getText(); 
				int recordLength = 79;
				try {
					if(letter % 82 != 81) {
						int des = letter % 82;
						letter -= des;
					}
					letter -= 81;
					RandomAccessFile file = new RandomAccessFile("info.txt", "rw");
					file.seek(letter);
					file.writeUTF(add);					
					for (int i = 0; i < recordLength - add.length(); i++) {
					    file.writeByte(0);
					}
					file.writeBytes("\n");
					file.close();					
				}catch (IOException e) {
					
				}
				fn.clear();
				ln.clear();
				c.clear();
				p.setValue(null);
				pc.clear();
			}
			
		});
		
		HBox hbox = new HBox(add, first, next, previous, last, update);
		hbox.setSpacing(10);
		gp.add(hbox, 0, 6, 6, 1);
		
		Scene sc = new Scene(gp,700,200);
		ps.setTitle("Address Book");
		ps.setScene(sc);
		ps.show();
		
	}

}
