package com.diegomartinez.springchallenge.service.impl;
import com.diegomartinez.springchallenge.utils.Constants;

import org.springframework.stereotype.Service;

import com.diegomartinez.springchallenge.dto.Dates;
import com.diegomartinez.springchallenge.service.SpringChallengeService;

@Service
public class SpringChallengeServiceImpl implements SpringChallengeService {
	@Override
	public String setDates(Dates dates) {
		return Constants.BIGGER;
		
		
	}

}
