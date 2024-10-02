package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Asg141_Listners.class)
public class Asg141_LoginAmazonwithListner 
{
	WebDriver driver;
	@Test
	public void AmazonLoginPassed()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("nav-link-accountList")).click();
		WebElement username= driver.findElement(By.name("email"));
		username.sendKeys("9716250778");
		driver.findElement(By.id("continue")).click();
		WebElement password = driver.findElement(By.id("ap_password"));
		password.sendKeys("Intel@22August");
		WebElement logInbutton = driver.findElement(By.className("a-button-input"));
		logInbutton.click();
	}
	
	@Test
	public void AmazonLoginFailed()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("nav-link-accountList")).click();
		WebElement username= driver.findElement(By.name("email"));
		username.sendKeys("9716250778");
		driver.findElement(By.id("continue")).click();
		WebElement password = driver.findElement(By.id("api_password"));
		password.sendKeys("Intel@22August");
		WebElement logInbutton = driver.findElement(By.className("a-button-input"));
		logInbutton.click();
	}


}
