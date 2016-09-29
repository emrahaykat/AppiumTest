package com.markafoni.app;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.android.AndroidDriver;


import com.markafoni.devicesetup.DeviceSetup;
import com.markafoni.mkfApi.Account;
import com.markafoni.mkfApi.Gender;
import com.markafoni.pages.MarkafoniSeleniumFunctions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Login {
	public static AndroidDriver driver;
    private DeviceSetup setup;

	
	MarkafoniSeleniumFunctions MKFSelenium=null;
	Account myAccountDetails=new Account("Emrah","Aykat", "emrah.aykat@markafoni.com","1",Gender.Male, "10","10","1987");
	
	

	 @Given("^User is on Home Page$")
	 public void user_is_on_Home_Page() throws MalformedURLException, InterruptedException  {
		 driver=setup.installApp();
	     // Write code here that turns the phrase above into concrete actions
		 MKFSelenium=new MarkafoniSeleniumFunctions(driver);	
		 MKFSelenium.isMenuClick();
		//driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[2]/android.view.ViewGroup[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ImageView[1]")).click();

	 }

	 @When("^User Navigate to LogIn Page$")
	 public void user_Navigate_to_LogIn_Page()  {
		 MKFSelenium =new MarkafoniSeleniumFunctions(driver);
		
		// MKFSelenium.MenuItem();
		 
	     MKFSelenium.isClickLoginLink();
	 }

	 @When("^User enters UserName and Password$")
	 public void user_enters_UserName_and_Password()  {
	     // Write code here that turns the phrase above into concrete actions
		 MKFSelenium =new MarkafoniSeleniumFunctions(driver);
		 MKFSelenium.login(myAccountDetails);
		 
	 }
	 @Then("^User LogOut from the Application$")
	 public void user_LogOut_from_the_Application() {
		 MKFSelenium =new MarkafoniSeleniumFunctions(driver);
		 MKFSelenium.logOut();
		// tearDown();
	     
	 }
  // Register
	 
	 
	 
	 //
	 
	
	
	 public void tearDown(){
		 
		 driver.quit();
	 }
	 
	 public void waitDelay() {
	        try {
	            Thread.sleep(1000);
	        }
	        catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }

}
