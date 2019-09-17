package first;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeClass 
{
	
public static void main(String[] args) 
{	
	System.setProperty("webdriver.chrome.driver","D:\\Selenium Projects\\FirstGmailProgram\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://google.com");
	System.out.println("1'st URL :"+driver.getCurrentUrl());
	System.out.println("Title :"+driver.getTitle());
	driver.navigate().to("http://yahoo.com");
	System.out.println("2'nd URL"+driver.getCurrentUrl());
	System.out.println("Title :"+driver.getTitle());
}
}