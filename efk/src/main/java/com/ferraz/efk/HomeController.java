package com.ferraz.efk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class HomeController {

    private final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @GetMapping
    public String home() {
        int rand = new Random().nextInt(1000);
        String response = String.format("Instância %d - Chamada %d", EfkApplication.INSTANCE_ID, rand);
        logger.info(response);
        return response;
    }

}
