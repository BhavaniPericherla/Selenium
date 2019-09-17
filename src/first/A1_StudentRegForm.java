package first;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A1_StudentRegForm {
	public void StudentRegUI()
	{	
		System.out.println("Testing");
		System.out.println("Testing");
	}
	public static void main(String[] args) {
	//TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", "D:\\Selenium Projects\\FirstGmailProgram\\Drivers\\chromedriver.exe");
	WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://demo.stqatools.com/");
	System.out.println("1'st URL :"+d.getCurrentUrl());
	System.out.println("Title :"+d.getTitle());
	d.findElement(By.xpath("(.//input[@type='text'])[1]")).sendKeys("Sruthi");;
	d.findElement(By.xpath(".//input[@id='fathername']")).sendKeys("Raju");;
	d.findElement(By.xpath(".//input[@id='paddress']")).sendKeys("Hitech City");;
	d.findElement(By.xpath(".//input[@id='personaladdress']")).sendKeys("Bhimavaram");
	//d.findElement(By.xpath(".//input[@name='sex'][2]")).click();
	d.findElement(By.xpath("//body//input[2]")).click();
	
	//Count of options
	
	//List<WebElement> elementCount = objselect.getOptions();
	//System.out.println(elementCount.size());
	//-----Print all options
	// int iSize = elementCount.size();
	// String sValue = elementCount.get(i).getText();
	//System.out.println(sValue);
	//}
	 
	 Select objcity = new Select(d.findElement(By.xpath(".//select[@name='City']")));
	 objcity.selectByIndex(2);
	 Select objCourse = new Select(d.findElement(By.xpath(".//select[@name='Course']")));
	 objCourse.selectByVisibleText("MCA");
	 Select objDistrict = new Select(d.findElement(By.xpath(".//select[@name='District']")));
	 objDistrict.selectByIndex(2);
	 Select objState = new Select(d.findElement(By.xpath(".//select[@name='State']")));
	 objState.selectByIndex(2);
	 d.findElement(By.xpath(".//input[@id='pincode']")).sendKeys("456566");
	 d.findElement(By.xpath(".//input[@id='emailid']")).sendKeys("sri@gmail.com");
	 d.findElement(By.xpath(".//input[@type = 'submit']")).click();
	 d.quit();
	}
}
