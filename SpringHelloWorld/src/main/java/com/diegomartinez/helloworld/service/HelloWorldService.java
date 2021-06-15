package com.diegomartinez.helloworld.service;

import com.diegomartinez.helloworld.dto.User;

public interface HelloWorldService {
	String getHello(String name);
	String getHelloUser(User user);
}
