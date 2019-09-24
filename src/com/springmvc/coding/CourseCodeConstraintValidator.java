package com.springmvc.coding;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {
	private String Courseprefix;

	@Override
	public void initialize(CourseCode theCourseCode) {
		
		Courseprefix = theCourseCode.value();

	}

	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext va1contet) {
		System.out.println(theCode+" : "+Courseprefix);
		boolean result;
		if(theCode!=null)
		//if (theCode.startsWith(Courseprefix)) {
		return theCode.startsWith(Courseprefix);
		//	return true;
		//}
		return false;

	}

}
