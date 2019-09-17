package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Task4
{
	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver","D:\\Selenium Projects\\FirstPracticeProject\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://edyy-test.login.us2.oraclecloud.com");
    driver.findElement(By.xpath(".//input[contains(@id,'userid')]")).sendKeys("integration_soa_uat@sbgtv.com");
	driver.findElement(By.xpath(".//*[contains(@type,'password')]")).sendKeys("Welcome123!");
	driver.findElement(By.xpath(".//*[contains(@class,'btnActiveChooser signinWidth')]")).click();
	driver.findElement(By.xpath(".//*[contains(@d,'M26.9 35.6V25.5h-5.84v10.1h-8.72V22.55l11.68-7.46 11.57 7.3v13.2h-8.68z')]")).click();
	driver.findElement(By.xpath(".//*[contains(@class,'flat-tabs-text selected')]")).click();
	driver.findElement(By.xpath(".//*[contains(@d,'M13.4 17.85L24 28.63l10.67-10.77a1.57 1.57 0 0 1 2.22.02l.56.63a1.57 1.57 0 0 1 .04 2.23l-13.46 13.3L10.5 20.7a1.57 1.57 0 0 1 .04-2.24l.63-.6a1.57 1.57 0 0 1 2.23 0z')]")).click();
	driver.findElement(By.xpath(".//*[contains(@id,'pt1:_UISlg1')]")).click();
	Thread.sleep(6000);
	driver.close();
	}
}
