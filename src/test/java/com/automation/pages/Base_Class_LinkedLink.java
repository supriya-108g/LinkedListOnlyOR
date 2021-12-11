package com.automation.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import com.automation.util.RespositoryParser;

public class Base_Class_LinkedLink  {
		
		public RespositoryParser parser;
		public WebDriver driver;

@BeforeTest

	public void setUp() throws IOException
	{
		
		parser = new RespositoryParser("C:\\Users\\Supriya\\eclipse-workspace_202109NN\\Linked_List1\\application.properties");
		System.setProperty("webdriver.chrome.driver","C:/Drivers/chromedriver.exe");
		driver= new ChromeDriver();
	   
	    driver.get(parser.propertyFile.getProperty("base_url"));
	  
	    WebElement Login_1 = driver.findElement(parser.getObjectLocator("login"));
		 Login_1.click();
       
		 WebElement Username_1 = driver.findElement(parser.getObjectLocator("username"));
		 Username_1.sendKeys("SupriyaG");
         
		 WebElement Password_1 = driver.findElement(parser.getObjectLocator("password"));
		 Password_1.sendKeys("Password123@");
		 
		 WebElement Login_Button_1 = driver.findElement(parser.getObjectLocator("login_button"));
		 Login_Button_1.click();
		 
		 WebElement Linked_List_1 = driver.findElement(parser.getObjectLocator("link_list"));
		 Linked_List_1.click();
		
	}
}


