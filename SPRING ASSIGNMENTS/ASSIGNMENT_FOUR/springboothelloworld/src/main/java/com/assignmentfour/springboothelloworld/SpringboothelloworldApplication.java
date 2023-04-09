package com.assignmentfour.springboothelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
@ResponseBody
public class SpringboothelloworldApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringboothelloworldApplication.class, args);
	}
	
	@RequestMapping("/hello")
	public String printHelloWorld() {
		return "Hello World";
	}

}
