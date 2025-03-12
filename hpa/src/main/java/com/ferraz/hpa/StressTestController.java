package com.ferraz.hpa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class StressTestController {

    @GetMapping
    public Long execute() throws InterruptedException {
        long x = 0;
        Random random = new Random();
        for(int i = 0; i < 9999999; i++) {
            x += random.nextInt(100);
        }
        Thread.sleep(1000);
        return x;
    }

}
