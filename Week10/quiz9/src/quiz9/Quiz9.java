package quiz9;

public class Quiz9 implements Runnable{

	@Override
	public void run() {
		System.out.println("test");
		
	}

	public static void main(String[] args) {
		 new Quiz9(); 

	}
	
	public Quiz9() {
		Quiz9 task = new Quiz9();
		new Thread(task).start();
	}
	
	
//	
//	public Quiz9() { // Create threads 
//		PrintChar printA = new PrintChar('a', 4); 
//		PrintChar printB = new PrintChar('b', 4); 
//		// Start threads
//		printA.run(); printB.run(); 
//		}
//	

}

//class PrintChar implements Runnable { 
//	private char charToPrint; 
//	private int times;
//	public PrintChar(char c, int t) { 
//		charToPrint = c; 
//		times = t; 
//		} 
//	public void run() { 
//		for (int i = 0; i < times; i++) 
//			System.out.print(charToPrint); 
//}
//} 
