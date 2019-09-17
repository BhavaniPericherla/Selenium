/*Get the bill date from the application and add 3 days to the date*/
package task;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Task3_DateFormat {
	
	@Test
	public void getData() throws ParseException
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Projects\\FirstPracticeProject\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.softwaretestinghelp.com/software-testing-conferences/");
		/*String expectedTitle = "Top 13 Software Testing Conferences in 2019 (The Best QA Events)";
		String actualTitle =driver.getTitle();
		System.out.println(actualTitle);

		if(actualTitle.contentEquals(expectedTitle))
			System.out.println("URL Load Successfully : Pass");
		else
		System.out.println("Unable to Load URL: Fail");*/
		String readDate = driver.findElement(By.xpath("//time[@class='updated']")).getText();
		//System.out.println(readDate);
		DateFormat originalFormat = new SimpleDateFormat("MMMM dd, yyyy", Locale.ENGLISH);
		DateFormat targetFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = originalFormat.parse(readDate);
		String sysDate = targetFormat.format(date); 
		System.out.println("Date before Addition in dd/MM/yyyy Format: "+sysDate);
	
		
		
		//Specifying date format that matches the given date
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Calendar c = Calendar.getInstance();
		try{
		   //Setting the date to the given date
		   c.setTime(sdf.parse(sysDate));
		}catch(ParseException e){
			e.printStackTrace();
		 }
		 
		
		
		//Adding 7 days to system date
		c.add(Calendar.DAY_OF_MONTH, 30);  
		//Date after adding the days to the given date
		String newDate = sdf.format(c.getTime());  
		//Displaying the new Date after addition of Days
		System.out.println("Date after Addition in dd/MM/yyyy Format: "+newDate);
		
		
		
		//Subtracting 7 days to system date
		Calendar c1 = Calendar.getInstance();
		try{
			   //Setting the date to the given date
			   c1.setTime(sdf.parse(sysDate));
			}catch(ParseException e){
				e.printStackTrace();
			 }
		c1.add(Calendar.DAY_OF_MONTH, -7); 
		String newDate1 = sdf.format(c1.getTime());  
		System.out.println("Date after Subtracting in dd/MM/yyyy Format: "+newDate1);
		
		//Adding 2 months to system date
		
		Calendar c2 = Calendar.getInstance();
		try{
			   //Setting the date to the given date
			   c2.setTime(sdf.parse(sysDate));
			}catch(ParseException e){
				e.printStackTrace();
			 }
		c2.add(Calendar.MONTH, 8); 
		String newDate2 = sdf.format(c2.getTime());  
		System.out.println("Date after adding 2 Months in dd/MM/yyyy Format: "+newDate2);
		
		
		
		//Subtracting 2 months to system date
		
				Calendar c3 = Calendar.getInstance();
				try{
					   //Setting the date to the given date
					   c3.setTime(sdf.parse(sysDate));
					}catch(ParseException e){
						e.printStackTrace();
					 }
				c3.add(Calendar.MONTH, -8); 
				String newDate3 = sdf.format(c3.getTime());  
				System.out.println("Date after subtracting 2 Months in dd/MM/yyyy Format: "+newDate3);
		
	}
	
	@Test(enabled=false)
	public void addDate() {

		//https://www.softwaretestinghelp.com/software-testing-conferences/
		SimpleDateFormat obj1 = new SimpleDateFormat("dd/MM/yyyy");
		Calendar c = Calendar.getInstance();
		c.setTime(new Date()); // Now use today date.
		c.add(Calendar.DATE, 7); // Adding 3 days

		String output = obj1.format(c.getTime());
		System.out.println("Current Date + 7days:   "+output);
	}
	@Test(enabled=false)
	public void subDate() {
		SimpleDateFormat obj2 = new SimpleDateFormat("dd/MM/yyyy");
		Calendar c = Calendar.getInstance();
		c.setTime(new Date()); // Now use today date.
		c.add(Calendar.DATE, -7); // Adding 3 days 
		String output = obj2.format(c.getTime());
		System.out.println("Current Date - 7days:   "+output);
	}
	@Test(enabled=false)
	public void addMonth() {
		SimpleDateFormat obj3 = new SimpleDateFormat("dd/MM/yyyy");

		Calendar c = Calendar.getInstance();
		c.setTime(new Date()); // Now use today date.
		c.add(Calendar.MONTH, +2); // Adding 3 days

		String output = obj3.format(c.getTime());
		System.out.println("Current Date + 2Months:   "+output);


	}
	@Test(enabled=false)
	public void subMonth() {
		SimpleDateFormat obj4 = new SimpleDateFormat("dd/MM/yyyy");

		Calendar c = Calendar.getInstance();
		c.setTime(new Date()); // Now use today date.
		c.add(Calendar.MONTH, -2); // Adding 3 days

		String output = obj4.format(c.getTime());
		System.out.println("Current Date - 2Months:   "+output);
	}
}
