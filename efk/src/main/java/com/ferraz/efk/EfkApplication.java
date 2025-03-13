package com.ferraz.efk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Random;

@SpringBootApplication
public class EfkApplication {

	public static int INSTANCE_ID;

	public static void main(String[] args) {
		SpringApplication.run(EfkApplication.class, args);
		INSTANCE_ID = new Random().nextInt(1000000);
	}

}
