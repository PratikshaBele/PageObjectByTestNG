package com.mt.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.mt.config.Config;

public class LaunchApp {
	Properties prop=new Properties();
	public void openBrowser(String browsernm) throws IOException 
	{
		FileInputStream fis=new FileInputStream("F:\\oxygenWorkSpace\\PageObjectModelDesignPattern\\src\\test\\resources\\config.properties");
		prop.load(fis);
	
		if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",prop.getProperty("chromeexepath")); 	
			Config.driver=new ChromeDriver();
			System.out.println("chrome browser is opened successfully");
		}
		else if(prop.getProperty("browser").equalsIgnoreCase("ie"))
				{
			System.setProperty("webdriver.ie.driver", prop.getProperty("ieexepath"));
			Config.driver=new InternetExplorerDriver();
			System.out.println("IE browser open successfully");
			}
		else {
			System.setProperty("webdriver.gecko.driver",prop.getProperty("firefoxexepath"));
			Config.driver=new FirefoxDriver();
			System.out.println("firefox browser open successfully");
		}
		}
	public void EnterApplicationURL(String url)
	{
		Config.driver.get(url);
		System.out.println("ApplicationURL enetr successfully");
	}
	public void maximizeBrowser()
	{
		Config.driver.manage().window().maximize();
	}
	public void waittillLoginpageLoaded(int timeoutseconds)
	{
		Config.driver.manage().timeouts().pageLoadTimeout(timeoutseconds,TimeUnit.SECONDS);
	}
	public static void main(String[] args) throws IOException {
	LaunchApp lp=new LaunchApp();
	lp.openBrowser("chrome");
	lp.EnterApplicationURL("http://www.newtours.demoaut.com/mercurywelcome.php");
	lp.maximizeBrowser();
	lp.waittillLoginpageLoaded(15);
	}

}


