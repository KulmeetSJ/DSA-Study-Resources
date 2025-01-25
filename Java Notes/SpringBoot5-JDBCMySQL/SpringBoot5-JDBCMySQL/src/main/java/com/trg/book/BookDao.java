package com.trg.book;

import java.util.List;
import java.util.Optional;

public interface BookDao {
  public Optional<Book> getBookById(int id);
  public List<Book> getBooks();
  public void addBook(Book book);
  public void deleteBook(int id);
  public List<Book> getBooksByAuthor(String author);
}
