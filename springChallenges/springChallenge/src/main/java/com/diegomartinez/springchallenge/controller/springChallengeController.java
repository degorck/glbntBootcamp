package com.diegomartinez.springchallenge.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.diegomartinez.springchallenge.utils.Constants;
import com.diegomartinez.springchallenge.dto.Dates;
import com.diegomartinez.springchallenge.dto.ResponseDatesDTO;
import com.diegomartinez.springchallenge.service.SpringChallengeService;


@RestController
public class springChallengeController {
	@Autowired
	SpringChallengeService SpringChallengeService;
	
	@PostMapping(value = "springchallenge/validateDates", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseDatesDTO<String>> setDates(@RequestBody Dates dates) {
		try {
			LocalDate toDate = LocalDate.parse(dates.getTo());
			LocalDate fromDate = LocalDate.parse(dates.getFrom());
			String s = Integer.toString(fromDate.compareTo(toDate));
			if (toDate.isAfter(fromDate)) {
				ResponseDatesDTO<String> responseDatesDTO = new ResponseDatesDTO <> (Constants.ResponseConstant.SUCCESS.getDescription(), SpringChallengeService.setDates(dates));
				return new ResponseEntity<>(responseDatesDTO, HttpStatus.ACCEPTED);
			}else {
				
				return new ResponseEntity<>(HttpStatus.CONFLICT);				
			}
			}catch(Exception e){
				return new ResponseEntity<>( HttpStatus.CONFLICT);
			}
		
			
	}

}
