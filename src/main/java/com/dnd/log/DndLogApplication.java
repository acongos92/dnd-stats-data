package com.dnd.log;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import com.dnd.log.player.Player;


@SpringBootApplication
public class DndLogApplication implements CommandLineRunner{
	
	public static final Logger logger = LoggerFactory.getLogger(DndLogApplication.class);
	

	
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(DndLogApplication.class);
		app.run(args);
	}


	@Value("${spring.datasource.url}")
	private String dbName;
	
	@Autowired
	private JdbcTemplate jdbc;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		logger.info("DB NAME: " + dbName);
		List<Player> players = jdbc.queryForList("SELECT * FROM PLAYER", Player.class);
		for(Player player: players) {
			logger.info("PLAYER: " + player.getName());
		}
		
	}
	

}
