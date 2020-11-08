package com.hcl.emobileconnect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * 
 * @author Gowthami V
 *
 */
@EnableJpaRepositories("com.hcl.emobileconnect.dao")
@EntityScan("com.hcl.emobileconnect.model")
@SpringBootApplication
public class MoblileServiceApp{
	
	public static void main(String[] args) {
		SpringApplication.run(MoblileServiceApp.class, args);
	}
}
