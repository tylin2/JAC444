package ca.senecacloolege.strings;

public class StringExample {
	public static void main(String[] args) {
		
		//different ways to declate String in java
		String s = new String(); //empty string //Not Recommended; taking more memory
		s="abc";
		String s1 = new String("Hello");        //Not Recommended; taking more memory
		
		//String is nothing but simply and array of characters
		char[] carray = {'h','e','l','l','o'};  //Not Recommended; taking more memory
		String s2 = new String(carray);
		
		String s3 = "Hello"; //string literal   //Recommended
		s3.length();
		int a = carray.length;
		
		String s4 = "Hello";
		
		System.out.println("s1 == s3: " + (s1 == s3));
		System.out.println("s3 == s4: " + (s3 == s4));
		System.out.println("s1 == s3.intern(): " + (s1 == s3.intern()));
		System.out.println("s1 == \"hel\" + \"lo\" :" + (s1 == "Hel" + "lo"));
		
		//String are immutable
		/*This means that String object is immutable basically but not the string reference variable
		 *like we can do String s1 = "abcd"; the after when we say s1 = "1234"; 
		 */
		String s5 = "abcd";
		s5 = "1234";
		System.out.println("s5 = " + s5);
		
	}

}
