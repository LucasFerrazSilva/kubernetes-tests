package com.ferraz.probes;

import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartupController {

    private boolean isStarted = false;

    @PostConstruct  // Executado após a inicialização do Bean
    public void onStartupComplete() {
        isStarted = true;
    }

    @GetMapping("/startup")
    public ResponseEntity<String> startup() {
        if (isStarted) {
            return ResponseEntity.ok("Application started!");
        }
        return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body("Starting...");
    }
}
