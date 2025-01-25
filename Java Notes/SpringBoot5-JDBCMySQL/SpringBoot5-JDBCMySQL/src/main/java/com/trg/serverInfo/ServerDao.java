package com.trg.serverInfo;

import com.trg.book.Book;
import com.trg.book.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;



@Repository("ServerDao")
public class ServerDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public Server getById(int id) {
		String sql = "select * from server where serverid=?";
		Server server = (Server) jdbcTemplate.queryForObject(sql,
				        new Object[] { id }, new ServerMapper());
		return server;
	}

	public List<Server> getServers() {
		String SQL = "select * from Server";
		List<Server> servers = jdbcTemplate.query(SQL, new ServerMapper());
		return servers;
	}
}
