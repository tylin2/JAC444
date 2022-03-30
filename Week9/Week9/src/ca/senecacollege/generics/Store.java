package ca.senecacollege.generics;

//public class Store {
// 
//	//This is a harded coded type;
//	/*private Book book;
//	//private Magazine m;
//	
//	public void set(Book b) {
//		this.book = b;
//	}
//	
//	public Book get() {
//		return this.book;
//	}*/
//	
//	//a more generalized class
//	/*private Object obj;
//	public void set(Object o) {
//		this.obj = o;
//	}
//	public Object get() {
//		return this.obj;
//	}*/
//
//
//}

/* 
 *  
 */
public class Store<T>{
	private T a;
	public void set(T a) {
		this.a = a;
	}
	public T get() {
		return this.a;
	}
	
}

