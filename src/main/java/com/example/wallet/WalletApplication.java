package com.example.wallet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WalletApplication {

	public static void main(String[] args) {
		SpringApplication.run(WalletApplication.class, args);
	}
	
	private boolean result(String test) {
		if(test.equalsIgnoreCase("string")) {
			return true;
		}else {
			return false;
		}
	}
}
