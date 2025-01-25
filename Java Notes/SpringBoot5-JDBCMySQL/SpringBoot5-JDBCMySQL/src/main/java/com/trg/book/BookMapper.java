package com.trg.book;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class BookMapper implements RowMapper<Book>{
	@Override
	public Book mapRow(ResultSet rs, int index) throws SQLException {
		Book book = new Book();
		book.setBookid(rs.getInt(1));
		book.setBookname(rs.getString(2));
		book.setAuthor(rs.getString(3));
		book.setPrice(rs.getDouble(4));
		return book;
	}
}
