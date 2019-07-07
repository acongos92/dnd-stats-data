package com.dnd.log.player;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class PlayerRowMapper implements RowMapper<Player>{

	@Override
	public Player mapRow(ResultSet rs, int rowNum) throws SQLException {
		Player player = new Player(rs.getString("name"));
		return player;
	}

}
