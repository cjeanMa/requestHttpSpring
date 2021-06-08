package com.example.consumingHttp;

import com.example.consumingHttp.Entities.Medico;
import com.example.consumingHttp.Utils.RestTemplateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestControllerAdvice
@RequestMapping("/")
public class ConsumingHttpApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumingHttpApplication.class, args);
	}


}
