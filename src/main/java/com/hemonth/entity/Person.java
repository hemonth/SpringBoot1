/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hemonth.entity;

import javax.persistence.Entity;

/**
 *
 * @author Hemonth.Mandava
 */
@Entity
public class Person extends AbstractEntity{

protected String name;

protected String email;

protected String place;

    public Person(){}

    public Person(String name, String email, String place) {
        this.name = name;
        this.email = email;
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }


}
