package assignments;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Asg105_TakeSsWithDateAndName {
	
	WebDriver driver;
	@Test
	public void ss() throws IOException {
		
		driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
		
		driver.manage().window().maximize();
		WebElement gmailButton=driver.findElement(By.linkText("Gmail"));
		
		Assert.assertTrue(gmailButton.isDisplayed());
		
		Date d1 = new Date();
		Date d2 = new Date(d1.getTime());
		
		String time=d2.toString();
		System.out.println(time);
		
		String date= time.substring(8,10);
		String month=time.substring(4,7);
		String year=time.substring(time.length()-4);
		String timee=time.substring(11,19);
		String exactTime= timee.replace(":", "_");
		
		String dateFormat1= date.concat(month).concat(year).concat(exactTime);
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Automation Project\\Screenshot\\Pass\\googlepass2 "+dateFormat1+".png");
		org.openqa.selenium.io.FileHandler.copy(source,destination);
		
		
	
		
		//String time= d2.toString();
		
	}
}

