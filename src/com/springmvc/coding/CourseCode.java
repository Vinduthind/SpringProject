package com.springmvc.coding;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy=CourseCodeConstraintValidator.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)


public @interface CourseCode {
 
	public String value() default "LUV";
	public String message() default "must start with LUV";
		
		//represents group of constraints     
	    public Class<?>[] groups() default {};  
	//represents additional information about annotation  
	    public Class<? extends Payload>[] payload() default {}; 
	
	
	
}
