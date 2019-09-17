package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Icici {

	public static void main(String[] args) 
	{
    System.setProperty("webdriver.chrome.driver", "D:/Selenium Projects/FirstGmailProgram/Drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://google.com");
	
	WebElement srch = driver.findElement(By.name("q"));	
	srch.sendKeys("icici login");
	srch.submit();
	driver.findElement(By.xpath("(.//h3[@class='LC20lb'])[1]")).click();
	driver.findElement(By.xpath("(.//div[@id = 'push-modal-close'])[1]")).click();
	driver.findElement(By.xpath(".//li[@class= 'personal-mobile-3 shorter']")).click();

	}
}
