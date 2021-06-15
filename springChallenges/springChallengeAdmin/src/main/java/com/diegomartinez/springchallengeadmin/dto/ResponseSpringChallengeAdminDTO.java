package com.diegomartinez.springchallengeadmin.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseSpringChallengeAdminDTO <T>{
	private String message;
	private T content;

}
