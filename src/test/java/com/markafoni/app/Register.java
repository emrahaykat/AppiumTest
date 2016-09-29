package com.markafoni.app;

import java.net.MalformedURLException;

import org.openqa.selenium.android.AndroidDriver;

import com.markafoni.devicesetup.DeviceSetup;
import com.markafoni.mkfApi.Account;
import com.markafoni.mkfApi.Agreement;
import com.markafoni.mkfApi.Gender;
import com.markafoni.pages.MarkafoniSeleniumFunctions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Register {
	public static AndroidDriver driver;
    private DeviceSetup setup;
  
    MarkafoniSeleniumFunctions MKFSelenium=null;
	Account myAccountDetails=new Account("Emrah","Aykat", "emrah.aykat@markafoni.com","1",Gender.Male, "10","10","1987");
    
    @Given("^User Open Home Page$")
    public void user_Open_Home_Page() throws MalformedURLException, InterruptedException  {
    	driver=setup.installApp();
    	MKFSelenium=new MarkafoniSeleniumFunctions(driver);	
		MKFSelenium.isMenuClick();
      
        
    }

    @When("^User Navigate to Register Page$")
    public void user_Navigate_to_Register_Page()  {
    	 MKFSelenium =new MarkafoniSeleniumFunctions(driver);
    	 MKFSelenium.isClickLoginLink();
    	 MKFSelenium.isClickRegisterBtn();
        
    }
    @When("^User enters information for register$")
	 public void user_enters_information_for_register()  {
	     // Write code here that turns the phrase above into concrete actions
    	Account account=new Account("Emrah", "Aykat", "test1@mkf.com", "12345", Gender.Male, "", "", "");
    	Agreement agreement=Agreement.Checked;
    	MKFSelenium.CreateMember(account, agreement);
    	
    	

	 
    }

    @Then("^Registration must be succesful$")
    public void registration_must_be_succesful() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println("Üye ol başarılı");
        throw new PendingException();
    }



}
