package com.diegomartinez.helloworld.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.diegomartinez.helloworld.dto.ResponseDTO;
import com.diegomartinez.helloworld.dto.User;
import com.diegomartinez.helloworld.service.HelloWorldService;
import com.diegomartinez.helloworld.utils.Constants;

@RestController
public class HelloWorldController {
	@Autowired
	HelloWorldService HelloWorldService;
	
	@GetMapping(value = "diegomartinez/helloworld", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseDTO<String>> getGreetings(@RequestParam String name) {
		ResponseDTO<String> responseDTO = new ResponseDTO<>(Constants.ResponseConstant.SUCCESS.getDescription(), HelloWorldService.getHello(name));
		return new ResponseEntity<>(responseDTO, HttpStatus.OK);	
	}
	
	@GetMapping(value = "diegomartinez/helloworldv2", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseDTO<String>> getGreetings1(@RequestHeader String name) {
		ResponseDTO<String> responseDTO = new ResponseDTO<>(Constants.ResponseConstant.SUCCESS.getDescription(), HelloWorldService.getHello(name));
		return new ResponseEntity<>(responseDTO, HttpStatus.OK);	
	}
	
	@PostMapping(value = "diegomartinez/helloworldv3", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseDTO<String>> getGreetings3(@RequestBody User user) {
		ResponseDTO<String> responseDTO = new ResponseDTO <> (Constants.ResponseConstant.SUCCESS.getDescription(), HelloWorldService.getHelloUser(user));
		return new ResponseEntity<>(responseDTO, HttpStatus.OK);	
	}
	
}
