package com.markafoni.pages;

import java.util.ArrayList;
import java.util.List;

import com.markafoni.helpers.Helper;
import com.markafoni.mkfApi.Account;
import com.markafoni.mkfApi.Address;
import com.markafoni.mkfApi.Agreement;
import com.markafoni.mkfApi.IUser;
import com.markafoni.mkfApi.Notifications;

public class MarkafoniUser implements IUser{
	
	private String email;
	private String password;
	private boolean loginPhaseFlag = false;
	private boolean isLoggedin = false;
	

	public MarkafoniUser(String email, String password){
		
		if(email!=null && email.trim().isEmpty()==false && password!=null && password.trim().isEmpty()==false){
			this.loginPhaseFlag = true;
			this.email = email;
			this.password = password;
		}
	}
	public String getEmail(){
		if(this.loginPhaseFlag == true) return this.email;
		else return "Login-phase disabled for this user";
	}
	
	public boolean login(){
		if(loginPhaseFlag == true){
			//Login action here, response should be checked from the BE!!!
			this.isLoggedin = true;
			return true; //depends on the case !!! There should be a if else conditional here!!!
		}
		else return false;
	}
	
	public boolean logout(){
		if(this.isLoggedin==true){
			//logout action here, response should be checked from the BE!!!
			this.isLoggedin = false;
			return true; //depends on the case !!! There should be a if else conditional here!!!
		}
		else return false;
	}
	public boolean forgotPassword(){
		if(this.isLoggedin==false && this.loginPhaseFlag==true){
			//We need loginPhaseFlag since we need the email details here
			//ForgotPassword action here, response should be checked from the BE!!!
			return true; //depends on the case !!! There should be a if else conditional here!!!
		}
		else return false;
	}
	
	public boolean cancelMembership(){
		if(this.isLoggedin==true){
			//cancelMembership action here, response should be checked from the BE!!!
			this.isLoggedin = false;
			return true; //depends on the case !!! There should be a if else conditional here!!!
		}
		else return false;
	}
	
	public boolean cancelOrder(String OrderId){
		if(this.isLoggedin==true && OrderId!=null && OrderId.trim().isEmpty()==false){
			//cancelOrder action here via OrderId, response should be checked from the BE!!!
			return true; //depends on the case !!! There should be a if else conditional here!!!
		}
		else return false;
	}
	public boolean delSavedCC(String CCId){
		if(this.isLoggedin==true && CCId!=null && CCId.trim().isEmpty()==false){
			//delSavedCC action here, response should be checked from the BE!!!
			return true; //depends on the case !!! There should be a if else conditional here!!!
		}
		else return false;
	}
	
	public boolean delSavedAddress(String AddressId){
		if(this.isLoggedin==true && AddressId!=null && AddressId.trim().isEmpty()==false){
			//delSavedAddress action here, response should be checked from the BE!!!
			return true; //depends on the case !!! There should be a if else conditional here!!!
		}
		else return false;
	}
	
	public boolean addNewAddress(Address myAddressDetails){
		
		List<String> StrArr = new ArrayList<String>();
		StrArr.add(myAddressDetails.getAddressTitle());
		StrArr.add(myAddressDetails.getFirstName());
		StrArr.add(myAddressDetails.getLastName());
		StrArr.add(myAddressDetails.getCity());
		StrArr.add(myAddressDetails.getTown());
		StrArr.add(myAddressDetails.getWard());
		StrArr.add(myAddressDetails.getAddress());
		StrArr.add(myAddressDetails.getPhoneNumber());
		if(this.isLoggedin==true && Helper.StringValidator(StrArr)==true){
			//addNewAddress action here, response should be checked from the BE!!!
				return true; //depends on the case !!! There should be a if else conditional here!!!
		}
		else return false;
	}
	
	public boolean createNewAccount(Account myAccountDetails, Agreement agreement){
		List<String> StrArr = new ArrayList<String>();
		StrArr.add(myAccountDetails.getName());
		StrArr.add(myAccountDetails.getLastName());
		StrArr.add(myAccountDetails.getEmail());
		StrArr.add(myAccountDetails.getPassword());
		StrArr.add(myAccountDetails.getGender());
		StrArr.add(myAccountDetails.getBirthDay());
		StrArr.add(myAccountDetails.getBirthMonth());
		StrArr.add(myAccountDetails.getBirthYear());
		
		if(this.isLoggedin==true && Helper.StringValidator(StrArr)==true){
			//createNewAccount action here, response should be checked from the BE!!!
			//Check for agreementFlag
			return true; //depends on the case !!! There should be a if else conditional here!!!
		}
		else return false;
	}
	
	public boolean updateMyAccountDetails(Account myAccountDetails, Notifications notifyViaEmail, Notifications notifyViaSMS, Notifications notifyViaPhone){
		List<String> StrArr = new ArrayList<String>();
		StrArr.add(myAccountDetails.getName());
		StrArr.add(myAccountDetails.getLastName());
		StrArr.add(myAccountDetails.getGender());
		StrArr.add(myAccountDetails.getBirthDay());
		StrArr.add(myAccountDetails.getBirthMonth());
		StrArr.add(myAccountDetails.getBirthYear());
		
		if(this.isLoggedin==true && Helper.StringValidator(StrArr)==true){
			//updateMyAccountDetails action here, response should be checked from the BE!!!
			//Check for campaignNotification flags
			return true; //depends on the case !!! There should be a if else conditional here!!!
		}
		else return false;
	}
	
	public boolean updateEmail(String email){
		List<String> StrArr = new ArrayList<String>();
		StrArr.add(email);
		//IMPORTANT password info comes from this.password class variable
		StrArr.add(this.password);
		
		if(this.isLoggedin==true && Helper.StringValidator(StrArr)==true){
			//updateEmail action here, response should be checked from the BE!!!
			
			return true; //depends on the case !!! There should be a if else conditional here!!!
		}
		else return false;
	}
	
	public boolean updatePassword(String newPassword, String newPasswordAgain){
		List<String> StrArr = new ArrayList<String>();
		StrArr.add(newPassword);
		StrArr.add(newPasswordAgain);
		
		
		if(this.isLoggedin==true && Helper.StringValidator(StrArr)==true){
			//updatePassword action here, response should be checked from the BE!!!
			return true; //depends on the case !!! There should be a if else conditional here!!!
		}
		else return false;
	}



}
