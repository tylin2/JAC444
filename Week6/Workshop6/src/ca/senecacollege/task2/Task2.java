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
package ca.senecacollege.task2;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {	
	
	public static final ArrayProcessor max = (arr) -> Arrays.stream(arr).summaryStatistics().getMax();
	public static final ArrayProcessor mini = (arr) -> Arrays.stream(arr).summaryStatistics().getMin();
	public static final ArrayProcessor sum = (arr) -> Arrays.stream(arr).summaryStatistics().getSum();
	public static final ArrayProcessor avg = (arr) -> Arrays.stream(arr).summaryStatistics().getSum()/arr.length;
	
	public static ArrayProcessor counter( double value ) {
		ArrayProcessor obj = new ArrayProcessor() {
			@Override
			public double apply( double[] array ) {
				double count =0;
				for(int i=0; i<array.length; i++) {
					if(array[i] == value) {
						count++;						
					}
				}
				return count;
			}
		}; 
		return obj;
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter list: ");
		String str = input.nextLine();
		String[] arrOfline = str.split(" ");
		double[] arrD = new double[arrOfline.length];
		for(int i=0; i<arrD.length; i++) {
			arrD[i]=Double.parseDouble(arrOfline[i]);			
		}		 
		
		double roundAvg = Math.round(avg.apply(arrD)*100)/100;
		System.out.println("Maximum value in the array is " + max.apply(arrD));
		System.out.println("Minimum value in an array is " + mini.apply(arrD));		
		System.out.println("Sum of the values in the array is " + sum.apply(arrD));
		System.out.println("Average of the values in the array is " + roundAvg);
		
		Scanner check = new Scanner(System.in);
		System.out.print("Enter a value for countint the times that value occurs in an array: ");
		double value = check.nextDouble();
		System.out.println( "The times that " + value +" occurs in an array is " + counter(value).apply(arrD));
		
	}	

}
