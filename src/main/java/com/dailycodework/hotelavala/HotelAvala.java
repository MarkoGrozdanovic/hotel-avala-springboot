package com.dailycodework.hotelavala;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class HotelAvala {

    public static void main(String[] args) {
        SpringApplication.run(HotelAvala.class, args);
    }

}