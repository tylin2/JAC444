import java.util.Random;

public class SingleDArray {
	
	public static void main(String[] args) {
		/*
		//type reference_variblale_name = new type[size]
		
		double[] myList = new double[10];
		//double myList[] = new double[10];
		//myList = 0.0,0.0,0.0,....0.0,0.0
		//0,0,0,....
		//\u0000
		//boolean = false		
		myList[0] = 1.1;
		
		int[] myIntList = {1,2,3,4,5};
		
		for(int i=0; i<myList.length; i++) {
			
		}
		
		for(int iter : myIntList) {
			
		}
		*/
		int[] deck = new int[52];
		//int[] list = new int[52];
		
		String[] suits = {"Spades","Hearts","Clubs","Diamonds"};
		String[] ranks = {"Ace","1","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		
		//initialize the cards/desk
		for(int i=1; i<deck.length; i++) {
			deck[i] = i;
		}
		
		//shuffle the cards
		for(int i=0; i<deck.length; i++) {
			//How to generate random numbers in Java
			//First,
			//We can use the Random Class
			//Random rand = new Random();
			//rand.
			//or,we can use =>
			//Math.random will return a double the range is between 0.0-1.0
			int index = (int) (Math.random() * deck.length); //0-52
			//10-52 -- 10+
			
			int temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;
		}
		
		//display first 4 cards
		for(int i=0; i<4; i++) {
			String suit = suits[deck[i] / 13];
			String rank = ranks[deck[i] % 13];
			System.out.println("Card number " + deck[i] + " : " + rank + " of " + suit);
		}
	}

}
