/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hemonth.SpringBoot1;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 *
 * @author Hemonth.Mandava
 */
@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.hemonth.entity","com.hemonth.controller"})
@EnableJpaRepositories(basePackages = {"com.hemonth.dao"})
@EnableTransactionManagement
public class RepositoryConfiguration {
}

