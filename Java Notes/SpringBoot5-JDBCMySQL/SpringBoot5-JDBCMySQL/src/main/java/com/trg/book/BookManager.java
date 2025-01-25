package com.trg.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookManager {

    @Autowired
    BookDao bookDao;

    public void bookOps(){
        System.out.println("Display all books...");
        List<Book> list = bookDao.getBooks();
        list.forEach(x -> System.out.println(x));

        System.out.println("Display book with id 102");
        Book b = bookDao.getBookById(102)
                .orElseThrow(() -> new IllegalArgumentException(
                        "Employee not exists with a given id : " + 102)
                );
        System.out.println(b);

        Book b1 = new Book(120,"New Book","New Author", 1000);
        bookDao.addBook(b1);

        bookDao.deleteBook(1);

        System.out.println("Display all books...");
        List<Book> list1 = bookDao.getBooks();
        list1.forEach(x -> System.out.println(x));
    }
}
