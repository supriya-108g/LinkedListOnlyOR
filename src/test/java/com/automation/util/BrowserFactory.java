package com.automation.util;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	
	//Start the Application
	 public static WebDriver startApplication(WebDriver driver, String browsername, String appurl)
	 {
	  System.out.println("url: " + appurl);
	  
	  if(browsername.equals("Chrome"))
	  {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Supriya\\eclipse-workspace_202109NN\\Linked_List1\\Driver\\chromedriver.exe");
	     driver = new ChromeDriver();
	  }
	  
	  if(browsername.equals("FireFox"))
	  {
	   System.setProperty("webdriver.gecko.driver", "C:\\Users\\Supriya\\eclipse-workspace_202109NN\\Linked_List1\\Driver\\geckodriver.exe");
	     driver = new ChromeDriver();
	  }
	  else
	  {
	   //System.out.println("Browser is unavailable");
	  }
	  //Launch url
	  driver.get(appurl); 
	  
	   //To maximize the browser
	    driver.manage().window().maximize();
	    //Reporter.log("Page is scrolled by pixel");
	    
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   //  Thread.sleep(2000);  
	  
	  return driver;
	  
	 }
	 
	 
	 
	 //To Close the Browser
	 public static void quitBrowser(WebDriver driver) 
	 {
	  driver.close();
	  driver.quit();
	 }

}
