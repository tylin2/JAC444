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
package ca.senecacollege.task2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) throws IOException    {
		
		Scanner input0 = new Scanner(System.in);
		System.out.print("Enter a filename: ");		
		String f = input0.nextLine();
		
		 File file = new File(f); 
	        FileInputStream fs = new FileInputStream(file); 
	        InputStreamReader input = new InputStreamReader(fs); 
	        BufferedReader reader = new BufferedReader(input); 
	          
	        String line;
	        String letter = "AaBbCcDdEeFfGgHhIiJjKiLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz";
	        int[] arr = new int[52];

	        int characterCount = 0; 

	        while((line = reader.readLine()) != null) { 
	        	characterCount += line.length();
	        	
	        	for(int i = 0 ; i < letter.length(); i++) {
	        		for (int j = 0 ; j < line.length() ; j++) {
	        			if(letter.charAt(i) == line.charAt(j)) {
	        				arr[i]++;
	        			}	        			
		        	}
	        	}  	
	        	
	        }
	        
	        for(int i = 0 ; i < letter.length(); i++) {	        		
        		System.out.println("Number of " + letter.charAt(i) + "'s: " + arr[i]);		        	
        	}	          
	        
	        System.out.println("Total number of characters = " + characterCount);	       
	         
	}

}
