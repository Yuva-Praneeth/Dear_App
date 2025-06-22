package com.example.dearapp.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.dearapp.exceptionclasses.DuplicateEmailIdException;
import com.example.dearapp.exceptionclasses.DuplicatePhoneException;
import com.example.dearapp.exceptionclasses.InvalidUserIdException;
import com.example.dearapp.util.responseStructure.ResponseStructure;

@RestControllerAdvice
public class UserExceptionHandler {

	@ExceptionHandler(DuplicateEmailIdException.class)
	public ResponseStructure<String> duplicateEmailIdExceptionHandler(DuplicateEmailIdException e) {
		ResponseStructure<String> structure = new ResponseStructure<>();
		structure.setStatus(HttpStatus.BAD_REQUEST.value());
		structure.setMessage("Already Account Exist for the given Email ");
		structure.setBody(e.getMessage());
		return structure;
	}

	@ExceptionHandler(DuplicatePhoneException.class)
	public ResponseStructure<String> duplicatePhoneExceptionHandler(DuplicatePhoneException e) {
		ResponseStructure<String> structure = new ResponseStructure<>();
		structure.setStatus(HttpStatus.BAD_REQUEST.value());
		structure.setMessage("Already Account Exist for the given Phone Number ");
		structure.setBody(e.getMessage());
		return structure;
	}
	@ExceptionHandler(InvalidUserIdException.class)
	public ResponseStructure<String> invalidUserIdExceptionHandler(InvalidUserIdException e) {
		ResponseStructure<String> structure = new ResponseStructure<>();
		structure.setStatus(HttpStatus.NOT_FOUND.value());
		structure.setMessage("Invalid User Id");
		structure.setBody(e.getMessage());
		return structure;
	}
}
