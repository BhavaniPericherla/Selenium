package task;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class BasicJava {
public WebDriver driver;
	public WebDriver validateHeader()
	{
		System.setProperty("webdriver.chrome.driver","D://Selenium Projects//FirstGmailProgram//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://edyy-test.login.us2.oraclecloud.com");   
		
		System.out.println("Successfully opened the website");
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getTitle());
		
		return driver;
	}
}
