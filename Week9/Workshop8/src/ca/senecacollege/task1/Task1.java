/**********************************************
Workshop 8
Course:JAV444 - W
Last Name:Lin
First Name:Ting-Yeh
ID:141726182
Section:NEE
This assignment represents my own work in accordance with Seneca Academic Policy.
TING-YEH LIN
Date:2021/03/27
**********************************************/
package ca.senecacollege.task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Task1 {

	public static void main(String[] args) throws FileNotFoundException {
		int year = 0;
		while (year > 2018 || year < 2009) {
			Scanner in = new Scanner(System.in);
			System.out.print("Enter a year for baby name ranking: ");
			year = in.nextInt();
			if(year > 2018 || year < 2009) {
				System.out.println("Out of Range! Please Enter Again!");
			}
		}	
		
		String file = "Babynames_files/babynamesranking" + year + ".txt";
		File filen = new File(file);
		List<String> girlList = new ArrayList<>();
		List<String> boyList = new ArrayList<>();
		try(Scanner scan = new Scanner(filen)){						
			while(scan.hasNext()) {							
				String line = scan.nextLine();
				String[] arrOfline = line.split(" ");				
				for(int i = 0; i < arrOfline.length ; i++) {
					arrOfline[i] = arrOfline[i].replaceAll("\\s+","");
				}
				girlList.add(arrOfline[2]);
				String[] arrOfline2 = arrOfline[1].split("(?<=\\D)(?=\\d)");
				boyList.add(arrOfline2[0]);
			}
		}
		
		List<String> bothList = new ArrayList<>();
		int count = 0;
		for( String g : girlList) {
			for(String b : boyList) {
				if(b.equals(g)) {
					bothList.add(b);
					count++;
				}
			}
		}	
		
		System.out.println(count + " names used for both genders.");
		System.out.print("They are");
		for(String b : bothList) {
			System.out.print(" " + b);
		}		
		System.out.println(".");
		
		Collections.sort(girlList);
		Collections.sort(boyList);
		
		Set<String> girlSet = new HashSet<>(girlList);
		girlList.clear();
		girlList.addAll(girlSet);
		Set<String> boySet = new HashSet<>(boyList);
		boyList.clear();
		boyList.addAll(boySet);
		
		Collections.sort(girlList);
		Collections.sort(boyList);
		
		System.out.print("Sorted all names for girls:");
		for( String g : girlList) {
			System.out.print(" " + g);
		}
		System.out.println(".");
		System.out.print("Sorted all names for boys:");
		for(String b : boyList) {
			System.out.print(" " + b);
		}
		System.out.println(".");

	}

}
