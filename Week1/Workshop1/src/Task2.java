
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

public class Task2 {
	
	public static void main(String[] args) {
		int flag = 0;
		do {
			int sum = roll();			
			if(sum == 7 || sum == 11) {
				flag = 1;				
			} else if (sum <= 3 || sum == 12) {
				flag = 2;				
			} else {
				System.out.println("Point is (established) set to " + sum);
				int sum2 = 1;
				while(sum2 != 7 && sum2 != sum) {
					sum2 = roll();
				}				
				if(sum2 == 7) {
					flag = 2;					
				} else {
					flag = 1;					
				}				
			}			
		} while( flag == 0);
		
		if(flag == 1) {
			System.out.println("Congratulations, You win");
		} else {
			System.out.println("Craps, Better Luck Next Time, You lose");
		}

	}
	
	public static int roll() {
		int[] dice = new int[2];
		int sum = 0;
		for(int i=0; i<2; i++) {
			dice[i] = (int) (Math.random() * 5) + 1;
			sum += dice[i];
		}		 
		System.out.println("You rolled " + dice[0] + " + " + dice[1] + " = " + sum);
		return sum;
	}

}
