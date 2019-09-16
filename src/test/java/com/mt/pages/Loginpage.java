package com.mt.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.mt.config.Config;
import com.mt.utility.LaunchApp;

public class Loginpage {
	@FindBy(how=How.XPATH,using="//input[@name='userName']")
	WebElement objusername;
	
	@FindBy(how=How.XPATH,using="//input[@name='password']")
	WebElement objpassword;
	
	@FindBy(how=How.XPATH,using="//input[@name='login']")
	WebElement objlogin;
	
	public void loadLoginpage()
	{
		PageFactory.initElements(Config.driver,this);
	}

	public void enterUsername(String username)
	{
		objusername.sendKeys(username);
		System.out.println("username open successfully");
	}
	public void enterPassword(String password)
	{
		objpassword.sendKeys(password);
		System.out.println("password open successfully");
	}
	public void clickonLogin()
	{
		objlogin.click();
	}
	
	public static void main(String[] args) throws IOException {
		LaunchApp lp=new LaunchApp();
		lp.openBrowser("chrome");
		lp.EnterApplicationURL("http://www.newtours.demoaut.com/mercurywelcome.php");
		lp.maximizeBrowser();
		lp.waittillLoginpageLoaded(15);
		
		Loginpage lg=new Loginpage();
		lg.loadLoginpage();
		lg.enterUsername("Pratiksha2Bele");
		lg.enterPassword("nidhi@#");
		lg.clickonLogin();
		
		

	}

}


