package com.markafoni.pages;


import java.util.LinkedList;
import java.util.List;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.android.AndroidDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.markafoni.helpers.GenericTuple;
import com.markafoni.helpers.Helper;
import com.markafoni.helpers.Pages;
import com.markafoni.helpers.Paths;
import com.markafoni.helpers.SeleniumAction;
import com.markafoni.helpers.SeleniumHelper;
import com.markafoni.mkfApi.Account;
import com.markafoni.mkfApi.Agreement;
import com.markafoni.mkfApi.IUser;
import com.thoughtworks.selenium.Selenium;

public class MarkafoniSeleniumFunctions implements IUser{
	
	private static final Logger logger = Logger.getLogger(MarkafoniSeleniumFunctions.class);
	private LinkedList<GenericTuple<String,String,SeleniumAction>> inputArgs = new LinkedList<>();
	public AndroidDriver driver=null;
	private WebDriverWait waitVar = null;
	public MarkafoniSeleniumFunctions(AndroidDriver driver2){
		BasicConfigurator.configure();
		this.driver=driver2;
		
	}
	protected void cleanUpPage() {
		try {
			Actions actions = new Actions(driver);
			actions.sendKeys(Keys.ESCAPE).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void teardown() {
		driver.quit();
	}
	
	public void goBack(){
		driver.navigate().back();
	}
	
	public void ishomepageDisplayed(){
		
		//SeleniumHelper.RunAction(driver, waitVar, Paths.HomePage.getPath() , SeleniumAction.isDisplayed,"");
	}
public boolean clickAction(Pages linkPath){
		
		final GenericTuple<Paths,String,String> linkPathDetails = linkPath.getPathInfo();
		final Paths path = linkPathDetails.getFirst();
		final String expectedText = linkPathDetails.getSecond();
		
		SeleniumHelper.RunAction(driver, waitVar, path.getPath(), SeleniumAction.click,expectedText);

		return true;
	}


	public boolean login(Account myAccountDetails){
			
			final String expectedText = myAccountDetails.getName();
			final String warningText = "Login attempt failed";
			String myEmail=myAccountDetails.getEmail();
			String password=myAccountDetails.getPassword();
			WebDriverWait waitVar = new WebDriverWait(driver, 0);
			
			inputArgs.clear();
			inputArgs.add(Helper.CreateTuple(Paths.EmailTextBox.getPath(),myEmail,SeleniumAction.sendKeys));
			inputArgs.add(Helper.CreateTuple(Paths.PasswordTextBox.getPath(), password, SeleniumAction.sendKeys));
			inputArgs.add(Helper.CreateTuple(Paths.SignInBtn.getPath(),"",SeleniumAction.submitAndFind));
			
			SeleniumHelper.RunAction(driver, waitVar, inputArgs, expectedText, warningText);
			
			
			return true;
		}
		
	public boolean CreateMember(Account myAccountDetails, Agreement agreement)
	{
		String firstName=myAccountDetails.getName();
		String lastName=myAccountDetails.getLastName();
		String email=myAccountDetails.getEmail();
		String password=myAccountDetails.getPassword();
		String gender=myAccountDetails.getGender();
		String birthDay=myAccountDetails.getBirthDay();
		String birthMonth=myAccountDetails.getBirthMonth();
		String birthYear=myAccountDetails.getBirthYear();
		WebDriverWait waitVar = new WebDriverWait(driver, 0);
		inputArgs.clear();
		inputArgs.add(Helper.CreateTuple(Paths.NamePath.getPath(), firstName,SeleniumAction.sendKeys));
		inputArgs.add(Helper.CreateTuple(Paths.SurnamePath.getPath(), lastName, SeleniumAction.sendKeys));
		inputArgs.add(Helper.CreateTuple(Paths.EmailPath.getPath(), email, SeleniumAction.sendKeys));
		inputArgs.add(Helper.CreateTuple(Paths.PasswordPath.getPath(), password, SeleniumAction.sendKeys));
		inputArgs.add(Helper.CreateTuple(Paths.SignUpDropdownGenderPath.getPath(),"", SeleniumAction.click));
		inputArgs.add(Helper.CreateTuple(Paths.GenderMenPath.getPath(),gender, SeleniumAction.click));
		//inputArgs.add(Helper.CreateTuple(Paths.GenderWomenPath.getPath(),gender, SeleniumAction.click));
		inputArgs.add(Helper.CreateTuple(Paths.SinUpDropdownBirthDatePath.getPath(),"", SeleniumAction.click));
		inputArgs.add(Helper.CreateTuple(Paths.DateBirthDayPath.getPath(), birthDay, SeleniumAction.click));
		inputArgs.add(Helper.CreateTuple(Paths.DateBirthMountPath.getPath(), birthMonth, SeleniumAction.click));
		inputArgs.add(Helper.CreateTuple(Paths.DateBirthYearPath.getPath(), birthYear, SeleniumAction.click));
		
		if(agreement == Agreement.Checked) 
			
			{
			
			inputArgs.add(Helper.CreateTuple(Paths.AgreementCheckBoxPath.getPath(), "", SeleniumAction.click));
			
			}
		inputArgs.add(Helper.CreateTuple(Paths.SmsOptionPath.getPath(), "", SeleniumAction.click));
        inputArgs.add(Helper.CreateTuple(Paths.SignUpButton.getPath(), "", SeleniumAction.submit));

        SeleniumHelper.RunAction(driver, waitVar, inputArgs, null,null);
	   
		
		
		return true;
	}
		


@Override
public boolean logout() {
	
	
	return false;
}
@Override
public boolean forgotPassword() {
	// TODO Auto-generated method stub
	return false;
}
@Override
public boolean cancelMembership() {
	// TODO Auto-generated method stub
	return false;
}
@Override
public boolean cancelOrder(String OrderId) {
	// TODO Auto-generated method stub
	return false;
}
@Override
public boolean delSavedCC(String CCId) {
	// TODO Auto-generated method stub
	return false;
}
@Override
public boolean delSavedAddress(String AddressId) {
	// TODO Auto-generated method stub
	return false;
}
@Override
public boolean updateEmail(String email) {
	// TODO Auto-generated method stub
	return false;
}
@Override
public boolean updatePassword(String newPassword, String newPasswordAgain) {
	// TODO Auto-generated method stub
	return false;
}
@Override
public String getEmail() {
	// TODO Auto-generated method stub
	return null;
}


public void isMenuClick(){
	WebDriverWait waitVar = new WebDriverWait(driver, 0);

	SeleniumHelper.RunAction(driver, waitVar,Paths.Menu.getPath(),SeleniumAction.click,"");
	
}
public void isClickLoginLink(){
	WebDriverWait waitVar = new WebDriverWait(driver, 0);
	SeleniumHelper.RunAction(driver, waitVar,Paths.LoginLink.getPath(), SeleniumAction.click, "");
}
public void logOut(){
	WebDriverWait waitVar = new WebDriverWait(driver, 0);
	SeleniumHelper.RunAction(driver, waitVar,Paths.SignOutLink.getPath(), SeleniumAction.click, "");
	
}

public void isClickRegisterBtn(){
	WebDriverWait waitVar = new WebDriverWait(driver, 0);
	SeleniumHelper.RunAction(driver, waitVar,Paths.OpenRegsterFormBtn.getPath(), SeleniumAction.click, "");
	
	
}




public void MenuItem(){
	//int item = 0;
	WebDriverWait wait = new WebDriverWait(driver, 30); 
	String path="//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/"
			+ "android.widget.ListView[1]/";
	int campaigns = driver.findElements(By.xpath(path)).size();
	
	 for(int item=1; item<campaigns+1; item++){
         campaigns = driver.findElements(By.xpath(path)).size();
           wait.until(ExpectedConditions.elementToBeClickable(By.xpath(path+"android.widget.LinearLayout["+item+"]/android.widget.FrameLayout[1]")));
           driver.findElement(By.xpath(path+"android.widget.LinearLayout["+item+"]/android.widget.FrameLayout[1]")).click();
	       
	 }
}
	
	
}
