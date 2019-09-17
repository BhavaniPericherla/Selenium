package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import task.BasicJava;

public class Testing {
	
	public static void login(){
		BasicJava bj = new BasicJava();
		WebDriver d=bj.validateHeader();
		System.out.println(d.getCurrentUrl());
		WebElement element = d.findElement(By.xpath("//input[@name='q']"));
		element.sendKeys("Testing");
	    element.submit();
	    WebElement firstclk = d.findElement(By.xpath("//h3[contains(text(),'What is Software Testing? Introduction, Definition')]"));
	    firstclk.click();
	    d.navigate().back();
	    d.quit();
	}	
	public static void main(String[] args) {
		login();
	}
}
