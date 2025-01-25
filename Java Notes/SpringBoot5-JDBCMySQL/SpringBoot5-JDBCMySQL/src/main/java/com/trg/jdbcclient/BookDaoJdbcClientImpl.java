package com.trg.jdbcclient;

import com.trg.book.Book;
import com.trg.book.BookDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Optional;


@Repository("bookDaoJdbcClient")
public class BookDaoJdbcClientImpl implements BookDao {

    private static final Logger log = LoggerFactory.getLogger(BookDaoJdbcClientImpl.class);
    private final JdbcClient jdbcClient;

    public BookDaoJdbcClientImpl(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }

    public Optional<Book> getBookById(int id) {
        return jdbcClient.sql("select * from book where bookid = :id")
                .param("id", id)
                .query(Book.class)
                .optional();
    }

    public List<Book> getBooks() {
        return jdbcClient.sql("select * from book")
                .query(Book.class)
                .list();
    }

    public void addBook(Book book) {
        int update = jdbcClient.sql("insert into book values(?,?,?,?)")
                .params(List.of(book.getBookid(), book.getBookname(), book.getAuthor(), book.getPrice()))
                .update();
        Assert.state(update == 1, "Failed to create post " + book.getBookname());
    }

    public void deleteBook(int id) {
        var updated = jdbcClient.sql("delete from book where bookid = :id")
                .param("id", id)
                .update();
        Assert.state(updated == 1, "Failed to delete book " + id);
    }

    public List<Book> getBooksByAuthor(String author) {
        String sql = "select * from book where author=?";
        return jdbcClient.sql(sql)
                .param(author)
                .query(Book.class)
                .list();
    }
}
