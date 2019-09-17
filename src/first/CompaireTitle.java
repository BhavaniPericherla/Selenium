package first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CompaireTitle {

	
	
	
    public static void main(String[] args) {
       
    	System.setProperty("webdriver.gecko.driver","D:\\Selenium Projects\\FirstGmailProgram\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
        String baseUrl = "http://demo.guru99.com/test/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";
        driver.get(baseUrl);
        actualTitle = driver.getTitle();
        
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
        driver.close();
       
    }

}