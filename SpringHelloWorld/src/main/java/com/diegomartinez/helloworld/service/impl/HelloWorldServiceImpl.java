package com.diegomartinez.helloworld.service.impl;
import static com.diegomartinez.helloworld.utils.Constants.BLANK_SPACE;
import static com.diegomartinez.helloworld.utils.Constants.HELLO;
import static com.diegomartinez.helloworld.utils.Constants.AGE;
import org.springframework.stereotype.Service;

import com.diegomartinez.helloworld.dto.User;
import com.diegomartinez.helloworld.service.HelloWorldService;

@Service
public class HelloWorldServiceImpl implements HelloWorldService{

	@Override
	public String getHello(String name) {
		return name.concat(BLANK_SPACE).concat(HELLO);
	}

	@Override
	public String getHelloUser(User user) {
		return user.getName().concat(BLANK_SPACE).concat(HELLO).concat(BLANK_SPACE).concat(AGE).concat(BLANK_SPACE).concat(user.getAge());
	}




}
