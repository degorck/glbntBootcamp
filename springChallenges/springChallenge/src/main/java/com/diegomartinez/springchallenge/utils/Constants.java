package com.diegomartinez.springchallenge.utils;

public class Constants {
	public static String BIGGER = "To is Bigger";
	public static String NOT_BIGGER = "To is not bigger";
	public static String NOT_ACCEPTED = "Not accepted";
		
		public enum ResponseConstant {
			FAILURE("Executed unsuccess"), 
			SUCCESS("Executed success");
			
			private String description;
			
			ResponseConstant(final String description){
				this.description = description;
			}
			
			public String getDescription() {
				return description;
			}
		}

	}


