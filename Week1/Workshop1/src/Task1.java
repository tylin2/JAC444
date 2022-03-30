
/**********************************************
Workshop 1
Course: JAC444 - Winter
Last Name:Lin
First Name:Ting-Yeh
ID:141726182
Section:NEE
This assignment represents my own work in accordance with Seneca Academic Policy.
Ting-Yeh Lin
Date:2021/01/26
**********************************************/

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {		
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter list: ");
		int size = input.nextInt();
		int[] array = new int[size];
		for(int i=0; i<size; i++) {
			array[i]=input.nextInt();			
		}
		int index = (int) (Math.random() * size);
		for(int i=0; i<size; i++) {
			int temp = array[i];
			array[i] = array[index];
			array[index] = temp;
		}		
		
		System.out.print("After the partition, the list is: ");
		for(int i:array) {			
			System.out.print(i + " ");
		}
		
		
	}

}
