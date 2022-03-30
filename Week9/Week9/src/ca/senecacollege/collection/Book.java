package ca.senecacollege.collection;

public class Book{ // implements Comparable {
	private String title;
	private String autor;
	private int year;
	
	
	public Book(String title, String autor, int year) {
		super();
		this.title = title;
		this.autor = autor;
		this.year = year;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", autor=" + autor + ", year=" + year + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autor == null) ? 0 : autor.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	/*@Override
	public int compareTo(Object o) {
		return getTitle().compareTo(((Book) o).getTitle());
	}*/
	
	
	/*@Override
	public int hashCode() {
		return title.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		return ((this.year == ((Book) obj).getYear()) && ((this.autor) == ((Book) obj).getAutor()));
	}*/
	
	
	

}
