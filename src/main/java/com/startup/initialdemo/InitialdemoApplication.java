package com.startup.initialdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoOperations;

@SpringBootApplication
public class InitialdemoApplication implements CommandLineRunner{

	@Autowired
	MongoOperations mongoOperations;
	
	
	public static void main(String[] args) {
		SpringApplication.run(InitialdemoApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		
	}
}
