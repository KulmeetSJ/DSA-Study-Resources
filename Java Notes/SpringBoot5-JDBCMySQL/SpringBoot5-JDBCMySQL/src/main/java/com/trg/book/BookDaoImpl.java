package com.trg.book;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

@Repository("bookDao")
public class BookDaoImpl implements BookDao {

	private static final Logger log = LoggerFactory.getLogger(BookDaoImpl.class);

	@Autowired
	JdbcTemplate jdbcTemplate;

	public Optional<Book> getBookById(int id) {
		String sql = "select * from book where bookid=?";
		Book book = null;
		try{
			book = jdbcTemplate.queryForObject(sql,
					new Object[] { id }, new BookMapper());
		}
		catch (DataAccessException ex) {
			log.info("Book not found: " + id);
		}
		return Optional.ofNullable(book);
	}

	public List<Book> getBooks() {
		String SQL = "select * from book";
		List<Book> books = jdbcTemplate.query(SQL, new BookMapper());
		return books;
	}

	public void addBook(Book book) {
		String sql = "insert into book values(?,?,?,?)";
		int count = jdbcTemplate.update(sql, book.getBookid(), book.getBookname(), book.getAuthor(), book.getPrice());
	    if(count > 0) log.info("Added successfully");
	}

	public void deleteBook(int id) {
		int count = jdbcTemplate.update("delete from book where bookid = ?", id);
		if(count == 1)
			log.info("Book Deleted: " + id);
	}

	public List<Book> getBooksByAuthor(String author) {
		String sql = "select * from book where author=?";
		List<Book> books = jdbcTemplate.query(sql, new Object[] { author }, new BookMapper());
		return books;
	}

}
