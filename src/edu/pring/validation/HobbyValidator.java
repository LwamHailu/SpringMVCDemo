package edu.pring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class HobbyValidator implements ConstraintValidator<IsValidHobby, String> {
 
	
	 private String listOfValidHobbies;
	@Override
	public void initialize(IsValidHobby isValid) {
		this.listOfValidHobbies=isValid.listofValidehobbies();
		
	}

	@Override
	public boolean isValid(String hobby, ConstraintValidatorContext ctx) {
		 if(hobby==null){
		return false;}
		 
		 if(hobby.toLowerCase().matches(listOfValidHobbies.toLowerCase())){
			 
			 return true;
			 
		 }
		 
		 return false;
	}

}
