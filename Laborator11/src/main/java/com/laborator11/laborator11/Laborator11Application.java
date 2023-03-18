package com.laborator11.laborator11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class Laborator11Application {

    public static void main(String[] args) {
        SpringApplication.run(Laborator11Application.class, args);
    }

}