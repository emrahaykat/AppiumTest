package com.markafoni.mkfApi;

public class Account {
	
	private String name;
	private String lastName;
	private String email;
	private String password;
	private Gender gender;
	private String birthDay;
	private String birthMonth;
	private String birthYear;
	
	
	public Account(String name, String lastName, String email, String password, Gender gender, String birthDay,
			String birthMonth, String birthYear) {
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.birthDay = birthDay;
		this.birthMonth = birthMonth;
		this.birthYear = birthYear;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getGender() {
		
		String genderToReturn="Female";
		if(this.gender.equals(Gender.Male)) genderToReturn="Male";
		
		return genderToReturn;
	}


	public void setGender(Gender gender) {
		this.gender = gender;
	}


	public String getBirthDay() {
		return birthDay;
	}


	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}


	public String getBirthMonth() {
		return birthMonth;
	}


	public void setBirthMonth(String birthMonth) {
		this.birthMonth = birthMonth;
	}


	public String getBirthYear() {
		return birthYear;
	}


	public void setBirthYear(String birthYear) {
		this.birthYear = birthYear;
	}
	
	
	
}
