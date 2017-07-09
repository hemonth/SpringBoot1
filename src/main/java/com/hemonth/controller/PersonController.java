/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hemonth.controller;

import com.hemonth.dao.PersonDao;
import com.hemonth.entity.Person;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Hemonth.Mandava
 */
@RestController
public class PersonController {
    
    @Autowired
    PersonDao personDao;
    
    @GET
    @RequestMapping("/persons")
    public List<Person> getPersons(){
        List<Person> people = new ArrayList<>();
        Person p1 = new Person("Hemonth","mhemonth@gmail.com","Dallas");
        Person p2 = new Person("Jethin","mJethin@gmail.com","Houston");
        people.add(p1);
        people.add(p2);
        return people;
    }
    
    @POST
    @RequestMapping("/person/save")
    public Person save(@RequestBody Person person){
        Person person1 = personDao.save(person);
        return person1;
    }
    
    @GET
    @RequestMapping("/person/get")
    public List<Person> get() throws InterruptedException{
        return personDao.get();
    }
    
    @GET
    @RequestMapping("/person/find/{findUser}")
    public List<Person> find(@PathVariable("findUser") String findUser){
        return personDao.find(findUser);
    }
    
}
