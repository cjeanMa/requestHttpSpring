package com.example.consumingHttp.Utils;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateUtil extends RestTemplate{
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
