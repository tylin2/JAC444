/**********************************************
Workshop 4
Course: JAV444 - W
Last Name:Ting-Yeh
First Name:Lin
ID:141726182
Section:NEE
This assignment represents my own work in accordance with Seneca Academic Policy.
TING-YEH LIN
Date:2021/2/9
**********************************************/
package ca.senecacollege.task1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;


public class Hangman {
	
	 public static void main(String[] args) throws IOException {
		 int option = 3;
		 int missed = 0;
		 do {
			 option = menu();
			 System.out.println("");
			 switch(option) {
			 case 0:				 
				break;
			 case 1:
				missed = startGame(missed);
				break;
			 case 2:
				boolean success = true;
				success = addWord();
				if(success) {
					System.out.println("Added a new word");
				}
				break;			 
			 }			 
		 } while ( option != 0);
		 System.exit(0);
	}
	 
	 public static int menu() {
			int option = 0;
			do {
				System.out.println("");
				System.out.println("------ Welcome ------");
				System.out.println("1. Start Game");
				System.out.println("2. Add New Word");						
				System.out.println("0. Sign off");
				
				Scanner input = new Scanner(System.in);
				System.out.print("Enter Your Option: ");
				option = input.nextInt();			
				if(option > 2 || option < 0) {				
					System.out.println("Error, please enter again!");				
				}
			} while(option < 0 || option > 2);			
			return option;
		}
	 
	 public static int startGame(int missed) throws IOException {
		 File filen = new File("hangman.txt");
		 int lines = 0;
		 String word = "";
		 String asterisk = "*";
		 String tried = "";
		 int rounds = 0;			 			 
		 try(Scanner scan = new Scanner(filen)){
				while(scan.hasNext()) {
					word = scan.nextLine();					
					lines++;
				}
				int index = (int) (Math.random() * lines);
				word = Files.readAllLines(Paths.get("hangman.txt")).get(index - 1);				
			}
		 
		 asterisk = word.replaceAll("([a-z])", "*");
		 
		 while (rounds < 7 && asterisk.contains("*")) {
			 Scanner input = new Scanner(System.in);
				System.out.print("(Guess) Enter a letter in word ");
				System.out.print(asterisk);
				System.out.print(" > ");
				String letter = input.next();
				boolean t = checkTried(letter,tried);
				if(t) {
					System.out.println("----> " +"You have already tried " + letter.charAt(0) + " , try a new letter");					
				} else {
					asterisk = check(letter, word, asterisk);
					tried += letter.charAt(0);
				}
				rounds++;
		 }
		 
		 if(asterisk.contains("*")) {
			 missed++;
			 System.out.println("The word is " + word +". You missed " + missed +" time");
		 } else {				 
			 System.out.println("Great!! The word is " + word +". You won!!!");
		 }
		 
		 return missed;
	 } 
	 
	 public static boolean checkTried(String letter, String tried) {
		 boolean t = false;
		 for(int i = 0; i<tried.length(); i++) {
			 if(tried.charAt(i) == letter.charAt(0)) {				 
				 t = true;
				 break;
			 } 
		 }
		 return t;
	 }
	 
	 public static String check(String letter, String word, String asterisk) {
		 String newasterisk = "";		 
		 for (int i = 0; i < word.length(); i++) {
			 if(asterisk.charAt(i) == '*') {
				 if (word.charAt(i) == letter.charAt(0)) {
					 newasterisk += letter.charAt(0);
				 } else {
					 newasterisk += asterisk.charAt(i);
				 }
			  } else {
				  newasterisk += asterisk.charAt(i);
				 if(letter.charAt(0) == asterisk.charAt(i)) {
					 System.out.println("----> " + letter.charAt(0) + " is already in the word");
					 return asterisk;					 
				  } 
			  }			
		 }
		 
		 if(newasterisk.equals(asterisk)) {
			 System.out.println("----> " + letter + " is not in the word");
		 }
		 return newasterisk;
	 }
	 
	 public static boolean addWord() throws FileNotFoundException {
		 boolean success = true;
		 Scanner input = new Scanner(System.in);
		 System.out.print("Enter a new word to be added in the memory > ");
		 String letter = input.next();
		 File filen = new File("hangman.txt");
		 try(Scanner scan = new Scanner(filen)){
				while(scan.hasNext()) {
					String word = scan.nextLine();					
					if(word.equals(letter)) {
						System.out.println(letter +" exists in data.");
						success = false;
						return success;
					}
				}
				
			}
		 try{
			  FileWriter fstream = new FileWriter("hangman.txt",true);
			  BufferedWriter out = new BufferedWriter(fstream);
			  out.write(letter +"\n");
			  out.close();
			  
		  }catch (Exception e){
			 System.err.println("Error while writing to file: " +
		          e.getMessage());
		  }
		 return success;
	 }

}
