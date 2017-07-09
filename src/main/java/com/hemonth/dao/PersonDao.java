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
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
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
    
    public List<Person> get() throws InterruptedException{
        String queryString = "SELECT p FROM "+Person.class.getCanonicalName()+" p";
        TypedQuery query = em.createQuery(queryString, Person.class);
        List resultList = query.getResultList();
        return resultList;
    }

    @Cacheable("persons")
    public List<Person> find(String user) {
        String queryStr = "SELECT p FROM "+Person.class.getCanonicalName()+" p WHERE p.name=:name";
        TypedQuery query = em.createQuery(queryStr, Person.class);
        query.setParameter("name", user);
        return query.getResultList();
    }
    
}
