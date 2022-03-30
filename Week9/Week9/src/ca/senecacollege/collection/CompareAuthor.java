package ca.senecacollege.collection;

import java.util.Comparator;

public class CompareAuthor implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {		
		return o1.getAutor().compareTo(o2.getAutor());
	}

}
