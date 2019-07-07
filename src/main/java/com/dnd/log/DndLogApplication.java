package com.dnd.log;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.dnd.log.player.Player;

@SpringBootApplication
public class DndLogApplication implements CommandLineRunner{
	
	public static final Logger logger = LoggerFactory.getLogger(DndLogApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(DndLogApplication.class, args);
	}
	

}
