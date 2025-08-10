package com.example.preprojectopenapi2.config;

import com.example.preprojectopenapi2.exeption.CustomErrorDecoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {

    @Bean
    public CustomErrorDecoder errorDecoder() {
        return new CustomErrorDecoder();
    }
}