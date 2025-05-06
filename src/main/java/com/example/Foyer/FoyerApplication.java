package com.example.Foyer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.Foyer.DAO.Repositories")
@EnableScheduling
public class FoyerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoyerApplication.class, args);
	}

}
