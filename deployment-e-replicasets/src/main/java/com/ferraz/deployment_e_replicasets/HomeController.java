package com.ferraz.deployment_e_replicasets;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public Integer home() {
        return DeploymentEReplicasetsApplication.RANDOM_NUMBER;
    }

}
