package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_Login {
	BasicJava bj;
	Task1_Login()
	{
		bj = new BasicJava();
	}
	public void login_Tc01()
	{
		bj.validateHeader();

		bj.driver.findElement(By.id("userid")).sendKeys("integration_soa_uat@sbgtv.com");
		bj.driver.findElement(By.id("password")).sendKeys("Welcome123!");
		bj.driver.findElement(By.id("btnActive")).click();
		String Logintitle = "Welcome";
		String actualtitle =bj.driver.getTitle();
		System.out.println(actualtitle);
		if(actualtitle.contentEquals(Logintitle))
			System.out.println("Successfully logged in : Pass");
		else
			System.out.println("Unable to login : Fail");
		//bj.driver.quit();
	}
	public void login_Tc02() throws Throwable
	{
		bj.driver.findElement(By.id("userid")).sendKeys("assdfghjkj*hgdfg");
		bj.driver.findElement(By.id("password")).sendKeys("ahggdvdgh");
		bj.driver.findElement(By.id("btnActive")).click();
		String expectedresult = "Authentication failed.";
		String actualResult=bj.driver.findElement(By.xpath("//div[@id='error']")).getText();
		System.out.println("ActualResult is entered");
		if(expectedresult.contentEquals(actualResult))
		{
			System.out.println("Expected error message is dispalyed in login page : Pass");
		}
		else
			System.out.println("fail");
      
       // System.out.println(actualResult);
		Thread.sleep(3000);
		
	}
	public void logout_TC01() throws Exception
	{
		Thread.sleep(5000);
		bj.driver.findElement(By.xpath("//*[@id='pt1:_UIScmil1u::icon']")).click();
		Thread.sleep(2000);
		bj.driver.findElement(By.xpath("//a[@id='pt1:_UISlg1']")).click();
		String actualresult = "Single Sign-Off consent";
		String expectedresult = bj.driver.getTitle();
		
		if(expectedresult.contentEquals(actualresult))
		 System.out.println("Successfully logged out:Pass");
		else 
			System.out.println("Logout : Fail");
		bj.driver.findElement(By.xpath("//button[@id='Confirm']")).click();
		
		//bj.driver.quit();
	}
	public static void main(String[] args) throws Throwable 
	{
		Task1_Login Ln = new Task1_Login();
		Ln.login_Tc01();
		try {
			Ln.logout_TC01();
		} catch (Exception e) {
			System.out.println("Exception: Unable to signout");
			e.printStackTrace();
		}
		Ln.login_Tc02();
		//driver.quit();
		
	}

}


