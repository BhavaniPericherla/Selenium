package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googleapps {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D://Selenium Projects//FirstGmailProgram//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		//driver.findElement(By.name("q")).sendKeys("");
        driver.navigate().to("http://yahoo.com");
        driver.navigate().back();
		WebElement ele = driver.findElement(By.xpath("//a[@class='gb_x gb_4b']"));
	    driver.close();
		ele.click();
	}
}





