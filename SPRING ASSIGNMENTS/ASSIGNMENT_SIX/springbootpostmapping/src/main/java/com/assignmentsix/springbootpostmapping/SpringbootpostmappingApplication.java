package com.assignmentsix.springbootpostmapping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootpostmappingApplication {
	
	@PostMapping("/postdata")
    public void postExample(@RequestBody String requestBody) {
        System.out.println("Your post request is received : " + requestBody);
    }

	public static void main(String[] args) {
		SpringApplication.run(SpringbootpostmappingApplication.class, args);
	}

}
