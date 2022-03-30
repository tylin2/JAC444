package ca.senecacollege.circle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class OkbtnHan implements EventHandler <ActionEvent>{
	@Override
	public void handle(ActionEvent arg0) {
		System.out.println("Ok button is clicked");
	}

}

