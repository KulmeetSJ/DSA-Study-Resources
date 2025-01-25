package com.trg.serverInfo;

import com.trg.book.Book;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ServerMapper implements RowMapper<Server>{
	@Override
	public Server mapRow(ResultSet rs, int index) throws SQLException {
		Server server = new Server();
		server.setServerid(rs.getInt(1));
		server.setServerName(rs.getString(2));
		server.setIpAddr(rs.getString(3));
		server.setLocation(rs.getString(4));
		return server;
	}
}
