package com.diegomartinez.springchallengeadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.diegomartinez.springchallengeadmin.dto.ResponseSpringChallengeAdminDTO;



@SpringBootApplication
public class SpringChallengeAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringChallengeAdminApplication.class, args);
	}

}
