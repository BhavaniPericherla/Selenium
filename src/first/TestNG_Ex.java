package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG_Ex {
  @Test
  public void f() 
  {
	  WebDriver driver;
	  System.setProperty("webdriver.chrome.driver","D://Selenium Projects//FirstGmailProgram//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://edyy-test.login.us2.oraclecloud.com");
		System.out.println("Successfully opened the website");
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getTitle());

		driver.findElement(By.id("userid")).sendKeys("integration_soa_uat@sbgtv.com");
		driver.findElement(By.id("password")).sendKeys("Welcome123!");
		driver.findElement(By.id("btnActive")).click();
		String Logintitle = "Welcome    cvv";
		String actualtitle =driver.getTitle();
		System.out.println(actualtitle);
		try{
		assert(actualtitle.contentEquals(Logintitle));
			System.out.println("Successfully logged in : Pass");
		}
		catch(Exception e){
			 
			   System.out.println("Unable to login : Fail");
			 
			} 
			
		driver.close();
  }
  
}
