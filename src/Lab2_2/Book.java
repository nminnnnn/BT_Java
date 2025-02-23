package Lab2_2;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Book {
	private String name;
	private Author[] authors;
	private double price;
	private int qty = 0;
	
	public Book(String name,Author[] authors, double price) {
		this.name = name;
		this.authors = authors;
		this.price = price;
	}

	public Book(String name, Author[] authors, double price, int qty) {
		this.name = name;
		this.authors = authors;
		this.price = price;
		this.qty = qty;
	}

	public String getName() {
		return name;
	}

//	public void setName(String name) {
//		this.name = name;
//	}

	public Author[] getAuthor() {
		return authors;
	}

//	public void setAuthor(Author author) {
//		this.author = author;
//	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + getAuthorsNames() + ", price=" + price + ", qty=" + qty + "]";
	}

//	public void setQty(int qty) {
//		this.qty = qty;
//	}
//	
	public String getAuthorsNames() {
	    return Arrays.stream(authors)
                .map(Author::getName)
                .collect(Collectors.joining(", "));
	}
}
