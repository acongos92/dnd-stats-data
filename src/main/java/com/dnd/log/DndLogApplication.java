package com.dnd.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class DndLogApplication implements CommandLineRunner{
	
	public static final Logger logger = LoggerFactory.getLogger(DndLogApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(DndLogApplication.class, args);
	}
	
	@Autowired
	public JdbcTemplate jdbc; 
	
	@Override
	public void run(String... args) throws Exception {
		logger.info("Start test");
		jdbc.execute("DROP TABLE IF EXISTS PLAYERS");
		jdbc.execute("CREATE TABLE PLAYERS "
				+ "(name text)");
		
		
	}
	
	

}
