/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hemonth.entity;

import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Hemonth.Mandava
 */
@XmlType
@MappedSuperclass
@XmlRootElement
public abstract class AbstractEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Version
    private Integer version;
    @Id
    @GeneratedValue
    private Long id;

    public Long getId() {
        return id;
    }

    @XmlElement
    public void setId(Long id) {
        this.id = id;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @XmlAttribute
    public Integer getVersion() {
        return version;
    }

    /**
     * override this to show short description of the entity
     *
     * @return
     */
    public String describe() {
        return "";
    }
}

