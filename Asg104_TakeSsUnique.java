package assignments;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;

public class Asg104_TakeSsUnique 
{
	public static void main(String[] args) throws IOException 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobile"+Keys.ENTER);
		Assert.assertEquals(driver.getTitle(), "Amazon.in : mobile");
		TakesScreenshot ts =(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Automation Project\\Screenshot\\Pass\\AmazonPass"+Math.random()+".png");
		FileHandler.copy(source, destination);
	}

}
