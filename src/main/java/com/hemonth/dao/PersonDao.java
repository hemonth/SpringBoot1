/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hemonth.dao;

import com.hemonth.entity.Person;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Hemonth.Mandava
 */
@Repository
@Transactional
public class PersonDao {
    
    @PersistenceContext
    EntityManager em;
    
    
    public Person save(Person person){
        em.persist(person);
        return person;
    }
    
    public List<Person> get(){
        String queryString = "SELECT p FROM "+Person.class.getCanonicalName()+" p";
        TypedQuery query = em.createQuery(queryString, Person.class);
        List resultList = query.getResultList();
        return resultList;
    }
    
}
