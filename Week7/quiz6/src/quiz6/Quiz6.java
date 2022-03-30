package quiz6;

public class Quiz6 {

	private int x; private int y; class Inner { private int x; 
	public Inner(int x) { this.x = x; 
	} 
	} 
	private Quiz6(int x) { this.x = x; 
	} 
	public  Quiz6(int x, int y) { this(x); this.y = y; 
	} 
	public static void main(String[] args) {  Quiz6 outer = new  Quiz6(1, 2); 
	 Quiz6.Inner inner = new  Quiz6(10, 20).new Inner(30); 
	 System.out.println(" outer.x = " + outer.x + " inner.x = " + inner.x + " outer.y = " + outer.y); 
	} 


}
