package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class PreConditionForSuit {
  WebDriver driver;
  @BeforeSuite
  public WebDriver setUpBrowser()
  {
	  System.setProperty("webdriver.chrome.driver", "D://Selenium Projects//FirstGmailProgram//Drivers//chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://google.com");
	  String actualTitle = driver.getTitle();
	  String expectedTitle = "Google";
	  if(actualTitle.contentEquals(expectedTitle))
	  {
	  System.out.println("");
	  }
	  return driver;
  }
  @Test
  public void f() {
  }
}
