package com.diegomartinez.helloworld.dto;

public class ResponseDTO<T> {
	private String message;
	private T content;
	
	public ResponseDTO() {
		
	}
	
	public ResponseDTO(String message, T content) {
		this.message = message;
		this.content = content;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public T getContent() {
		return content;
	}
	
	public void setContent(T content) {
		this.content = content;
	}

}
