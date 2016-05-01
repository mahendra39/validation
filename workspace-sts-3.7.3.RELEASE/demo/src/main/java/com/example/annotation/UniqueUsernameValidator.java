package com.example.annotation;

import java.util.ArrayList;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.model.Account;

public class UniqueUsernameValidator implements ConstraintValidator<UniqueUserName, String>{

	@Override
	public void initialize(UniqueUserName constraintAnnotation) {
    		
	}

	@Override
	public boolean isValid(String username, ConstraintValidatorContext context) {
		if(username==null){
			return false;
		}
		if(username.matches("mahi|ram|ravi")){
			return true;
		}
		else{
		return false;
	}
	}
}
