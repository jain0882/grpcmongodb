package com.example.accessingdatamongodb;

import org.springframework.boot.SpringApplication;
import com.example.DbConnection;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AccessingDataMongodbApplication {

	public static void main(String[] args) {
		DbConnection dbConnection = new DbConnection();
		dbConnection.createConnection();
		SpringApplication.run(AccessingDataMongodbApplication.class, args);
	}

}
