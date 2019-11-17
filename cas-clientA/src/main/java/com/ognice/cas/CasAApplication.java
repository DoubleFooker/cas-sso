package com.ognice.cas;

import org.jasig.cas.client.boot.configuration.EnableCasClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableCasClient//启用cas client
public class CasAApplication {
    public static void main(String[] args) {
        SpringApplication.run(CasAApplication.class, args);
    }
}
