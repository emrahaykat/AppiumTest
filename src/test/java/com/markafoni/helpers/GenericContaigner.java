package com.markafoni.helpers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.android.AndroidDriver;

public class GenericContaigner {
	
	private static GenericContaigner instance =new GenericContaigner();
	String str;
	WebElement web;
	int val;
	boolean bool;
	AndroidDriver driver;
    //Get the only object available
    public static GenericContaigner getInstance(){
 	   return instance;
    } 
    
	public void setString(String s){
    	this.str = s;
    }
	
	public void setWebElem(WebElement w){
    	this.web = w;
    }
	
	public void setInteger(int i){
    	this.val = i;
    }
	
	public void setBool(boolean b){
    	this.bool = b;
    }
	
	public void setDriver(AndroidDriver d){
    	this.driver = d;
    }
	
	public String getString(){ return str; }
	public int getInteger(){ return val; }
	public WebElement getWebElem(){ return web; }
	public boolean getBool(){ return bool; }
	public AndroidDriver getAndroidDriver(){return driver;}

}
