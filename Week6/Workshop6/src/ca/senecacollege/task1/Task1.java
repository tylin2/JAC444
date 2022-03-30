/**********************************************
Workshop 6
Course:JAV444 - Winter
Last Name: Lin
First Name: Ting-Yeh
ID: 141726182
Section:NEE
This assignment represents my own work in accordance with Seneca Academic Policy.
TING-YEH LIN
Date:2021/03/12
**********************************************/
package ca.senecacollege.task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Task1 extends Application{
	public static void main(String[] args) {		
		launch(args);
	}
	
	void startGame(Stage ps) {
		GridPane gp = new GridPane();		
		gp.setAlignment(Pos.CENTER);
		gp.setHgap(4);
		gp.setVgap(5);
		
		gp.add(new Label("Enter the Year: "),0, 0);
		TextField y = new TextField();
		gp.add(y, 1, 0);
		
		gp.add(new Label("Enter the Gender: "), 0, 1);
		TextField g = new TextField();
		gp.add(g, 1, 1);
		
		gp.add(new Label("Enter the Name: "), 0, 2);
		TextField n = new TextField();
		gp.add(n, 1, 2);
		
		Button submit = new Button("Submit Query");
		submit.setPrefWidth(110);
		submit.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {				
				String gender = g.getText();				
				String name = n.getText();
				int year = Integer.parseInt(y.getText());				
				int flag = 0;
				if ((gender.equals("m") || gender.equals("M") || gender.equals("F") || gender.equals("f")) && (year <= 2018 && year >= 2009)) {
					String fn = "Babynames_files/babynamesranking" + y.getText() + ".txt";
					File filen = new File(fn);
					System.out.println(fn);
					try(Scanner scan = new Scanner(filen)){						
						while(scan.hasNext()) {							
							String line = scan.nextLine();
							String[] arrOfline = line.split(" ");
							for(int i = 0; i < arrOfline.length ; i++) {
								arrOfline[i] = arrOfline[i].replaceAll("\\s+","");
							}
							if(gender.equals("f") || gender.equals("F")) {
								if(name.equals(arrOfline[2])) {
									System.out.println(arrOfline[0] + " -> " + arrOfline[3]);
									gp.getChildren().clear();
									String strG = "Girl name " + name + " is ranked #" + arrOfline[0] + " in " + year;
									gp.add(new Label(strG), 0, 0);
									flag = 1;
									break;
								} 
							} else {
								String[] arrOfline2 = arrOfline[1].split("(?<=\\D)(?=\\d)");
								if(name.equals(arrOfline2[0])) {
									System.out.println(arrOfline[0] + " -> " + arrOfline2[1]);
									gp.getChildren().clear();
									String strB = "Boy name " + name + " is ranked #" + arrOfline[0] + " in" + year;
									gp.add(new Label(strB), 0, 0);
									flag = 1;
									break;
								}
							}							
						}
						if (flag == 0) {
							gp.getChildren().clear();
							String strN = "Name " + name + " is not found in the list of " + year;
							gp.add(new Label(strN), 0, 0);							
						}
						gp.add(new Label("Do you want to search for another name?"), 0, 1);
						Button yes = new Button("Yes");
						yes.setPrefWidth(110);
						yes.setOnAction(new EventHandler<ActionEvent>() {
							@Override
							public void handle(ActionEvent arg0) {								
								restart(ps);				
							}
						});
						
						Button no = new Button("No");
						no.setPrefWidth(110);
						no.setOnAction(new EventHandler<ActionEvent>() {
							@Override
							public void handle(ActionEvent arg0) {
								ps.close();											
							}
						});
						
						HBox hbox = new HBox(yes, no);
						hbox.setSpacing(40);
						gp.add(hbox, 0, 5, 3, 1);
					} catch (FileNotFoundException e) {
						
					}					
				} else {
					System.out.println("2");
					if (year > 2018 || year < 2009) {					
						gp.add(new Label("Enter between 2009-2018"), 2, 0);					
					}
					if (!(gender.equals("m") || gender.equals("M") || gender.equals("F") || gender.equals("f"))){
						gp.add(new Label("Enter M or F!!"), 2, 1);
					}					
					
				}	
			}
		});
		
		Button exit = new Button("Exit");
		exit.setPrefWidth(110);
		exit.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				y.clear();
				g.clear();
				n.clear();
				ps.close();				
			}
		});
		
		HBox hbox = new HBox(submit, exit);
		hbox.setSpacing(40);
		gp.add(hbox, 0, 5, 3, 1);		
		
		Scene sc = new Scene(gp,600,200);
		ps.setTitle("Search Name Ranking Applicate");
		ps.setScene(sc);
		ps.show();
		
	}
	
	void restart(Stage ps) {	    
	    startGame(ps);
	}

	@Override
	public void start(Stage ps) throws Exception {		
		startGame(ps);
		
	}

}
