package com.diegomartinez.springchallengeadmin.service.impl;

import org.springframework.stereotype.Service;

import com.diegomartinez.springchallengeadmin.service.SpringChallengeAdminService;

@Service
public class SpringChallengeAdminServiceImpl implements SpringChallengeAdminService {

	@Override
	public String getRole(String role) {
		return role;
	}

}
