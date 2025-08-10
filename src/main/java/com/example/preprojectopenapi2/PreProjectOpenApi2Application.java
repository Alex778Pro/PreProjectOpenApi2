package com.example.preprojectopenapi2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class PreProjectOpenApi2Application {

    public static void main(String[] args) {
        SpringApplication.run(PreProjectOpenApi2Application.class, args);
    }

}
