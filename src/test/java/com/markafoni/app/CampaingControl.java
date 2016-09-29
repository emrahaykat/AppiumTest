package com.markafoni.app;

import org.openqa.selenium.android.AndroidDriver;

import com.markafoni.devicesetup.DeviceSetup;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CampaingControl {

	public static AndroidDriver driver;
    private DeviceSetup setup;

    @Given("^User is on Home Page and get count of campaigns$")
    public void user_is_on_Home_Page_and_get_count_of_campaigns() throws Throwable {
    	driver=setup.installApp();
    	
         throw new PendingException();
    }

    @Then("^User open campaing$")
    public void user_open_campaing() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	
    	
        throw new PendingException();
    }

	
	
}
