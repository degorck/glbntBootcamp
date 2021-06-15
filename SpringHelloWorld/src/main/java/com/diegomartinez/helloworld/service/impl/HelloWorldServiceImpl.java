package com.diegomartinez.helloworld.service.impl;

import org.springframework.stereotype.Service;

import com.diegomartinez.helloworld.service.HelloWorldService;

@Service
public class HelloWorldServiceImpl implements HelloWorldService{

	@Override
	public String getHello(String name) {
		return name.concat(" Hello");
	}

}
