package com.assignmentfive.springbootgetmapping;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootgetmappingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootgetmappingApplication.class, args);
	}
	
	@GetMapping("/getdata")
    public Map<String, String> getExample() {
        Map<String, String> response = new HashMap<>();
        response.put("Name", "Consult Add!");
        return response;
    }


}
