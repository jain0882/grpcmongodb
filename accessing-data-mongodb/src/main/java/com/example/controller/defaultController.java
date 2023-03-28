package com.example.controller;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/default")
public class defaultController {

    @GetMapping("/checkConnection")
    public String createConnection(){
        String connectionString = "mongodb://localhost:27017/";//System.getProperty("mongodb+srv://Manjunathajs22:Manju8746!@cluster0.yr8vx.mongodb.net/?retryWrites=true&w=majority");
        try(MongoClient mongoClient = MongoClients.create(connectionString))
        {
            List<Document> databases = mongoClient.listDatabases().into(new ArrayList<>());
            databases.forEach(db -> System.out.println(db.toJson()));
        }
        return "";
    }
}
