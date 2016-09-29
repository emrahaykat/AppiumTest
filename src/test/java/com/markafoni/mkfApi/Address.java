package com.markafoni.mkfApi;

public class Address {
	private String AddressTitle;
	private String FirstName;
	private String LastName;
	private String City;
	private String Town;
	private String Ward;
	private String PhoneNumber;
	private String Address;
	public Address(String addressTitle, String firstName, String lastName, String city, String town, String ward,
			String phoneNumber, String address) {
		
		AddressTitle = addressTitle;
		FirstName = firstName;
		LastName = lastName;
		City = city;
		Town = town;
		Ward = ward;
		PhoneNumber = phoneNumber;
		Address = address;
	}
	public String getAddressTitle() {
		return AddressTitle;
	}
	public void setAddressTitle(String addressTitle) {
		AddressTitle = addressTitle;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getTown() {
		return Town;
	}
	public void setTown(String town) {
		Town = town;
	}
	public String getWard() {
		return Ward;
	}
	public void setWard(String ward) {
		Ward = ward;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}

	
}
