package com.ferraz.api_do_bff;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class ApiController {

    @GetMapping
    public String getResponse() {
        return String.valueOf(new Random().nextInt(1000000000));
    }

}
