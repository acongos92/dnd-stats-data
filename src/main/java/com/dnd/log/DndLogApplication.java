package com.dnd.log;




import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DndLogApplication {
	
	public static final Logger logger = LoggerFactory.getLogger(DndLogApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(DndLogApplication.class, args);
	}
	



	

}
