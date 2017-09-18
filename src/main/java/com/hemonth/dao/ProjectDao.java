/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hemonth.dao;

import com.hemonth.entity.Project;
import java.io.Serializable;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.context.annotation.Scope;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Hemonth.Mandava
 */
@Repository
@Scope("prototype")
@Transactional
public class ProjectDao {
    
    public static ProjectDao instance(){
        return new ProjectDao();
    }
    
    @PersistenceContext
    EntityManager em;


    public Project save(Project project) {
        em.persist(project);
        return project;
    }
    
}
