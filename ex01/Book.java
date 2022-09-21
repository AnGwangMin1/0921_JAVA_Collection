package day01.ex01;

public class Book {
	public String title;
	public int price;
	public String publisher;
	public String writer;
	
	public Book() {}
	
	public Book(String title, int price, String publisher, String writer) {
		this.title = title;
		this.price = price;
		this.publisher = publisher;
		this.writer = writer;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + ", publisher=" + publisher + ", writer=" + writer + "]";
	}
}
