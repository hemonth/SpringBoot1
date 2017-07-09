package com.hemonth.SpringBoot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SpringBoot1Application extends SpringBootServletInitializer{
    
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
        return application.sources(SpringBoot1Application.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot1Application.class, args);
    }

}
