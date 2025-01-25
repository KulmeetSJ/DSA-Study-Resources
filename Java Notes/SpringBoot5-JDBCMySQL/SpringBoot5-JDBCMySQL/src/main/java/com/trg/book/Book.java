package com.trg.book;

public class Book {
	int bookid;
	String bookname, author;
	double price;

	//appropriate cons, getter, setter


	public Book() {
	}

	public Book(int bookid, String bookname, String author, double price) {
		this.bookid = bookid;
		this.bookname = bookname;
		this.author = author;
		this.price = price;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book{" +
				"bookid=" + bookid +
				", bookname='" + bookname + '\'' +
				", author='" + author + '\'' +
				", price=" + price +
				'}';
	}
}
