package com.diegomartinez.helloworld.utils;

public class Constants {
	public enum ResponseConstant{
		FAILURE(description 'Executed unsuccess'), 
		SUCCESS('Executed success');
		
		private String description;
		
		ResponseConstant(final String description){
			this.description = description;
		}
		
		public String getDescription() {
			return description;
		}
	}

}
