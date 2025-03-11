package com.ferraz.deployment_e_replicasets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Random;

@SpringBootApplication
public class DeploymentEReplicasetsApplication {

	public static int RANDOM_NUMBER;

	public static void main(String[] args) {
		SpringApplication.run(DeploymentEReplicasetsApplication.class, args);
		RANDOM_NUMBER = new Random().nextInt(100000000);
	}

}
