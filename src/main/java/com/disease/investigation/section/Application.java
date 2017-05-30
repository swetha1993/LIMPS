package com.disease.investigation.section;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by TATAVARTHY on 05/28/2017.
 */
@ComponentScan({"com.disease.investigation.section.web",
"com.disease.investigation.section.repository"})
@EnableAutoConfiguration
@SpringBootApplication
public class Application {

    public static void main(String[] args){
        SpringApplication.run(Application.class);
    }
}
