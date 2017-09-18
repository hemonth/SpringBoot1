/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hemonth.controller;

import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.util.JSON;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Hemonth.Mandava
 */
@RestController
public class RecipeShop {
    
    @Autowired
    protected MongoClient mongoClient;
    
    @Autowired
    protected Gson gson;
    
    @GET
    @RequestMapping("/USData")
    public ArrayList<Document> getUsData(){
        MongoDatabase db = mongoClient.getDatabase("test");
        MongoCollection<Document> collection = db.getCollection("zipcodes");
        ArrayList<Document> list = collection.find().into(new ArrayList<>());
        //System.out.println("list"+list.toString());
        return list;
    }
    
}
