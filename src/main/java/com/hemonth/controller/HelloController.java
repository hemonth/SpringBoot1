/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hemonth.controller;

import com.hemonth.dao.ProjectDao;
import com.hemonth.entity.Project;
import com.hemonth.entity.Task;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.GET;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * @author Hemonth.Mandava
 */
@RestController
public class HelloController {

    private Logger logger = Logger.getLogger(HelloController.class.getName());

    @Autowired
    ProjectDao projectDao;

    @Autowired
    SimpMessagingTemplate messaging;

    @RequestMapping("/hello")
    public String hello() {
        List<Task> tasks = Arrays.asList(new Task("task 1", new Date(), new Date()), new Task("task 2", new Date(), new Date()), new Task("task 3", new Date(), new Date()), new Task("task 4", new Date(), new Date()));
        Project project1 = new Project();
        project1.setId(new Long(1));
        project1.setName("project 2");
        for (Task task : tasks) {
            project1.addTask(new Task("task 1", new Date(), new Date()));
        }
        projectDao.save(project1);
        return "Hello World!!";
    }

    @GET
    @RequestMapping("/wish")
    public String goodMorning() {
        //Gson gson = new Gson();
        //return gson.toJson("Good Morning");
        messaging.convertAndSend("/topic/alarms", Collections.singletonMap("Wishing Hemonth: ", "Good Morning"));
        return "Good Morning";
    }
}
