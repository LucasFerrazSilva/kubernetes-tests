package com.ferraz.bff_com_api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class BffController {

    @Value("${api.url}")
    private String apiURL;

    @GetMapping
    public String getApiResponse() {
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(apiURL, String.class);
        return "Resposta da API: " + response;
    }

}
