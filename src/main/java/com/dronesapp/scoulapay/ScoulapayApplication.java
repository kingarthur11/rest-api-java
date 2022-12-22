package com.dronesapp.scoulapay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScoulapayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScoulapayApplication.class, args);
		
		Wallet wallet = new Wallet();
		wallet.make_transfer();
	}

}
