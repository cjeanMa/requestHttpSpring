package com.example.consumingHttp.Controllers;

import com.example.consumingHttp.ConsumingHttpApplication;
import com.example.consumingHttp.Entities.Medico;
import com.example.consumingHttp.Utils.RestTemplateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.RestTemplate;

@RestControllerAdvice
@CrossOrigin(origins = "*")
@RequestMapping("/medico")
public class MedicosController {

    @Autowired
    private static final Logger log = LoggerFactory.getLogger(ConsumingHttpApplication.class);

    @Autowired
    public RestTemplateUtil restTemplateUtil;

    @GetMapping()
    public ResponseEntity home(){
        //RestTemplate restTemplate = new RestTemplate();
        Medico[] quote = restTemplateUtil.getForObject("https://5f65661cfb1b5700169c9b4f.mockapi.io/medicos",Medico[].class);
        //Quote quote = restTemplate.getForObject("https://quoters.apps.pcfone.io/api/random", Quote.class);

        return new ResponseEntity(quote, HttpStatus.OK);
    }

}
