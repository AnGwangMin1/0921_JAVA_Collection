package day01.ex01;

import java.util.ArrayList;

public class BookArrayTest {
	public static void main(String[] args) {
		ArrayList<Book> bList = new ArrayList<Book>();
		
		bList.add(new Book("자바", 30000, "jh출판사", "김말똥"));
		bList.add(new Book("파이썬", 25000, "jh출판사", "홍길똥"));
		bList.add(new Book("리눅스", 32000, "jh출판사", "고길똥"));
		
		for(int i =0; i < bList.size(); i++) {
//			Object obj = bList.get(i);
//			Book book1 = (Book)obj;
//			System.out.println(book1.title);
			
			Book book = bList.get(i);
//			System.out.println(book.title);
//			System.out.println(book.price);
//			System.out.println(book.writer);
			
//			System.out.println(book.toString());
			System.out.println(book);
		}
	}
}
