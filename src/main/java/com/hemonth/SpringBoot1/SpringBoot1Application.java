package com.hemonth.SpringBoot1;

import com.hemonth.dao.PersonDao;
import com.hemonth.entity.Person;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

@SpringBootApplication
@EnableJpaRepositories
public class SpringBoot1Application extends SpringBootServletInitializer {

    private Logger logger = Logger.getLogger(SpringBootApplication.class.getName());

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBoot1Application.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot1Application.class, args);
    }

    @Bean
    public InitializingBean populateAngularAppUserTestData(PersonDao personDao) {
        return () -> {
            final List<Person> people = Arrays.asList(new Person("hemonth", "mhemonth@gmail.com", "Dallas"),
                    new Person("hemonth1", "mhemonth1@gmail.com", "Dallas1"),
                    new Person("hemonth2", "mhemonth2@gmail.com", "Dallas2"),
                    new Person("hemonth3", "mhemonth3@gmail.com", "Dallas3"));
            personDao.savePeople(people);
        };
    }

}
