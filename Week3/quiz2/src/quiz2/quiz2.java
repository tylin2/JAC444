package quiz2;

public class quiz2 {
	public static void main(String[] args) {

	    int[] x = {1, 2, 3, 4, 5};

	    increase(x);

	 

	    int[] y = {1, 2, 3, 4, 5};

	    increase(y[0]);

	 

	    System.out.println(x[0] + " " + y[0]);

	  }

	 

	  public static void increase(int[] x) {

	    for (int i = 0; i < x.length; i++)

	      x[i]++;

	  }

	  public static void increase(int y) {

	    y++;
	  }
		
//		nPrint('a', 4);
		
		
//		 boolean[][] x = new boolean[3][];
//
//
//
//		    x[0] = new boolean[1];
//
//
//
//		    x[1] = new boolean[2];
//
//
//
//		    x[2] = new boolean[3];
//
//
//
//		 
//
//
//
//		    System.out.println("x[2][2] is " + x[2][2]);
		
//		  System.out.println(max(1, 2)); 
		
//		double[] myList = {1, 5, 5, 5, 5, 1};
//
//		double max = myList[0];
//
//		int indexOfMax = 0;
//
//		for (int i = 1; i < myList.length; i++) {
//
//		  if (myList[i] > max) {
//
//		    max = myList[i];
//
//		    indexOfMax = i;
//
//		  }
//
//		}
//
//		System.out.println(indexOfMax);
//
//
//
//	  }
	
//	public static void nPrint(String message, int n) {
//
//		  while (n > 0) {
//
//		    System.out.print(message);
//
//		    n--;
//
//		  }
//
//	}
	
//	public static double max(int num1, double num2) {
//
//	    System.out.println("max(int, double) is invoked");
//
//	 
//
//	    if (num1 > num2)
//
//	      return num1;
//
//	    else
//
//	      return num2;
//
//	  }
//
//	  public static double max(double num1, int num2) {
//
//	    System.out.println("max(double, int) is invoked");
//
//	 
//
//	    if (num1 > num2)
//
//	      return num1;
//
//	    else
//
//	      return num2;    
//
//	  }



}
