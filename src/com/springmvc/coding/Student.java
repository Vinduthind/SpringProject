package com.springmvc.coding;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class Student {
	
	@NotNull(message="is required")
	private String firstname;
	private String lastname;
	
	
	@Max(value=10,message="enter lesser values")
	
	@Min(value=1,message="enter bigger values")
	private Integer freepasses;
	@Pattern(regexp="^[0-9]{10}",message="Must be a valid mobile number")
	private String phonenumber;
	
	public String getPhonenumber() {
		return phonenumber;
	}
	public Integer getFreepasses() {
		return freepasses;
	}
	public void setFreepasses(Integer freepasses) {
		this.freepasses = freepasses;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	@CourseCode(value="LUV",message="Course Code must start with LUV")
	private String coursecode;
	
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getCoursecode() {
		return coursecode;
	}
	public void setCoursecode(String coursecode) {
		this.coursecode = coursecode;
	}
	
	

}
