package com.usermanagement.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class UserManagementUtils {

	public static ResponseEntity<String> getResponseEntity(String responseMessage,HttpStatus httpstatus){
		
		
		return new ResponseEntity<String>("{\"message\":\""+responseMessage+"\"}",httpstatus);
	}	
	
}
