package com.markafoni.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.android.AndroidDriver;
import org.openqa.selenium.remote.RemoteWebElement;

import com.markafoni.devicesetup.DeviceSetup;
import com.markafoni.helpers.Paths;
import com.markafoni.pages.MarkafoniSeleniumFunctions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import gherkin.formatter.Reporter;

public class CampaingControl {

	public static AndroidDriver driver;
    private DeviceSetup setup;
    MarkafoniSeleniumFunctions MKFSelenium;
    
    ArrayList<Boolean> results = new ArrayList<Boolean>();

    @Given("^User is on Home Page and get count of campaigns$")
    public void user_is_on_Home_Page_and_get_count_of_campaigns() throws Throwable {
    	driver=setup.installApp();
    	
    }
///TEST

    
    
    @Then("^User open campaing$")
    public void user_open_campaing() throws Throwable {
    	
    	MKFSelenium.checkCampaignDetails(driver);
    	/*
    	MarkafoniSeleniumFunctions.scrollDown(driver);
        // Write code here that turns the phrase above into concrete actions
    	int campaigns=MKFSelenium.countItems(Paths.CampaignXPath.getPath());
    	String path = "", warning = "";
		String[] allCampaigns = new String[campaigns];
		boolean fail;
		//take all the urls to campaigns at once
		for(int i=0; i<campaigns; i++){
			allCampaigns[i] = MKFSelenium.getAttributeOfElement(MKFSelenium.addNumToPath(Paths.CampaignXPath.getPath(), i+1) + "/div[1]/a", "href");
		}
		for(int i=0; i<campaigns; i++){
			path = allCampaigns[i];
			//set it as there is no fail in every loop
			fail = false;
			MKFSelenium.goToUrl(path);
			
			//if redirected to "tüm kampanyalar" or 404 page
			if(MKFSelenium.getCurrentUrl().length() < 35){
				warning += "Kampanya anasayfa sırası : " + (i+1) + "\nBeklenen sayfa : " + path + "\nYönlendirilen sayfa : " + MKFSelenium.getCurrentUrl() + "\n\n";
				results.add(false);
				fail = true;
			}
			//if  campaign has no product inside of it
		//	if(MKFSelenium.countItems(Paths.ItemContainer.getPath()) < 1 && fail == false){
			//	warning += "Kampanya anasayfa sırası : " + i + "\nKampanyada ürün bulunmuyor.\nSayfa : " + MKFSelenium.getCurrentUrl() + "\n\n";
				//results.add(false);
			//	GenericLogger.getInstance().addLog(false, warning);
				fail = true;
			//}
				
				
				
				
				
				
		}
		
*/
    }
	
}
