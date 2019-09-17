/*Verify the Button status in application (Enabled/Disabled)*/
package task;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test3_FewMoreTasks_1 
{
   public WebDriver driver;
   @Test (priority =1)
   public void validateHeader() 
   {
	  System.setProperty("webdriver.chrome.driver","D://Selenium Projects//FirstPracticeProject//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://edyy-test.login.us2.oraclecloud.com");   --- for Test Case Task1_Login
		driver.get("https://www.plus2net.com/javascript_tutorial/form-submit-demo.php");
		System.out.println("Successfully opened the website");
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getTitle());
   }
   @Test (priority =2)
   public void verify() throws IOException, InterruptedException
   {
   boolean signupButton=driver.findElement(By.id("btnSignUp")).isDisplayed();
   System.out.println("Signup button is displayed:  "+signupButton);
   
   boolean signupButton_enable = driver.findElement(By.id("btnSignUp")).isEnabled();
   
   String disableAtributevalue = driver.findElement(By.id("btnSignUp")).getAttribute("disabled");
   System.out.println("Value in attribute: "+disableAtributevalue);
   if(disableAtributevalue.contentEquals("true"))
   {
	   System.out.print("\nText box signupButton is disabled. Take your action.");
   
    System.out.println(signupButton_enable);
   }
   else
   {
	   System.out.print("\nText box signupButton is enabled. Take your action.");
    System.out.println(signupButton_enable);
   }
   driver.close();
   }
}

