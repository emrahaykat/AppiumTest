package com.markafoni.helpers;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.android.AndroidDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.markafoni.pages.MarkafoniSeleniumFunctions;

public class SeleniumHelper {
private static final Logger logger = Logger.getLogger(MarkafoniSeleniumFunctions.class);

	
	public static void RunAction(final AndroidDriver driver, final WebDriverWait waitVar, String path,SeleniumAction act,String expectedText){
		
		try{
			waitVar.until(ExpectedConditions.presenceOfElementLocated(By.xpath(path)));
			if(act.equals(SeleniumAction.isDisplayed)) driver.findElement(By.xpath(path)).isDisplayed();
			else if(act.equals(SeleniumAction.click)) driver.findElement(By.xpath(path)).click();
		}
		catch(Exception ex){
			System.out.println(ex.toString());
		}

		FindInPage(driver, expectedText, expectedText);
		
	}
	
	public static void RunAction(final AndroidDriver driver, final WebDriverWait waitVar, List<GenericTuple<String,String,SeleniumAction>> inputPathArgs, final String expectedText, final String warningText){
		
		Iterator<GenericTuple<String,String,SeleniumAction>> inputPathArgsIt = inputPathArgs.iterator();
		GenericTuple<String,String,SeleniumAction> params;
		String path;
		String text;
		SeleniumAction action;
		while(inputPathArgsIt.hasNext()) {
			
			params = inputPathArgsIt.next();
			path = params.getFirst();
			text = params.getSecond();
			action = params.getThird();
			
			waitVar.until(ExpectedConditions.presenceOfElementLocated(By.xpath(path)));

			if(action == SeleniumAction.click) driver.findElement(By.xpath(path)).click();
			else if(action == SeleniumAction.sendKeys) driver.findElement(By.xpath(path)).sendKeys(text);
			else if(action == SeleniumAction.submit){
			
				driver.findElement(By.xpath(path)).click();
				//IsOnTheRightPage(driver, expectedText, warningText);
			}
			else if(action == SeleniumAction.submitAndFind){
				
				driver.findElement(By.xpath(path)).click();
				//FindInPage(driver, expectedText, warningText);
			}
			else{
				logger.error("Selenium Action Enum Problem");
			}

			//For humanlike simulations
			
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
			 			
		
		
	}
	
	
	public static void FindInPage(final WebDriver driver,String expectedText,String warningText){

		List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'" + expectedText + "')]"));
		
		Assert.assertTrue(warningText, list.size() > 0);
		
		
	}
	

	public static void IsOnTheRightPage(final WebDriver driver,String inTitle,String warningText){

		String actualTitle = driver.getTitle();
		Assert.assertTrue(warningText, actualTitle.contains(inTitle));
		
		
	}

}
