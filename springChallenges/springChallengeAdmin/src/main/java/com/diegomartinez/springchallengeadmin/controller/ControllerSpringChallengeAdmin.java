package com.diegomartinez.springchallengeadmin.controller;

import com.diegomartinez.springchallengeadmin.dto.ResponseSpringChallengeAdminDTO;
import com.diegomartinez.springchallengeadmin.utils.Constants;
import com.diegomartinez.springchallengeadmin.dto.Role;
import com.diegomartinez.springchallengeadmin.service.SpringChallengeAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerSpringChallengeAdmin {
	@Autowired
	SpringChallengeAdminService SpringChallengeAdminService;
	
	@GetMapping(value = "role/validate", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseSpringChallengeAdminDTO<String>> getRole(@RequestHeader Role role) {
		ResponseSpringChallengeAdminDTO<String> responseDTO = new ResponseSpringChallengeAdminDTO<>(Constants.VERIFIED, SpringChallengeAdminService.getRole(role.getAuth()));
		String s = role.getAuth();
		if (s.equals(Constants.ADMIN) == true) {
		 return new ResponseEntity<>(responseDTO, HttpStatus.OK);
		}else {
			
			return new ResponseEntity<>(HttpStatus.FORBIDDEN);
		}
		
	}

}
