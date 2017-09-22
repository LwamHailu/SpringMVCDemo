package edu.pring.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy=HobbyValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)

public @interface IsValidHobby {
	String listofValidehobbies() default "Football|Cycling|BollyBall|Music";
	String message() default "please provid a valid hobby :" + " accepted hobbies are-Football,Music,Cycling,BollyBall";
	
	Class<?> [] groups() default{};
	Class<? extends Payload>[] payload() default {};
	

}
