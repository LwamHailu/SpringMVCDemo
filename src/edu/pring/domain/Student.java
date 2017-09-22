package edu.pring.domain;

import java.util.Date;

import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import edu.pring.validation.IsValidHobby;
@JsonInclude(Include.NON_NULL)//ignore null values
@JsonPropertyOrder("FullName,dateBirth,phoneNumber,hobby")
public class Student {
	@JsonProperty("FullName")
	private String name;
	
	@Size(min=2,max=10 ) @IsValidHobby(listofValidehobbies="Football|Cycling|BollyBall|Music")
	private String hobby;
	
	private Long phoneNumber;
	private Date dateBirth;
	
	 public Student(){}
	
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Date getDateBirth() {
		return dateBirth;
	}
	public void setDateBirth(Date dateBirth) {
		this.dateBirth = dateBirth;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", hobby=" + hobby + ", phoneNumber=" + phoneNumber + ", dateBirth="
				+ dateBirth + "]";
	}
	
	

}
