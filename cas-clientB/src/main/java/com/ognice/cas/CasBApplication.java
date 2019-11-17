package com.ognice.cas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableCasClient//启用cas client
public class CasBApplication {

    public static void main(String[] args) {
        SpringApplication.run(CasBApplication.class, args);
    }
}
