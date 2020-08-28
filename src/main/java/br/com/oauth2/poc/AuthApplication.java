package br.com.oauth2.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = "br.com.oauth2.poc")
public class AuthApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(AuthApplication.class, args);
	}
}
