package assignments;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Asg67_AmazonLaunch 
{
	public static void main(String[] args) throws IOException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("nav-link-accountList")).click();
		WebElement username= driver.findElement(By.name("email"));
		username.sendKeys("decentsandy744@gmail.com");
		driver.findElement(By.id("continue")).click();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination = new File ("C:\\Automation Project\\Screenshot\\Pass\\SCPass"+Math.random()+".png");
		FileHandler.copy(source, destination);
		WebElement password = driver.findElement(By.id("ap_password"));
		password.sendKeys("Intel@22August");
		WebElement logInbutton = driver.findElement(By.className("a-button-input"));
		logInbutton.click();
		File source02=ts.getScreenshotAs(OutputType.FILE);
		File destination02 = new File ("C:\\Automation Project\\Screenshot\\Pass\\SCPass"+Math.random()+".png");
		FileHandler.copy(source02, destination02);

		
	}

}
