package demo;

public class Author {
	private String name;
	private Book book;
	public Author(Book book) {
		super();
		this.book = book;
	}
	@Override
	public String toString() {
		return "Author [name=" + name + ", book=" + book + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
