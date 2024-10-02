package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AmazonDataProvider 
{
	@Test(dataProvider = "inputs")
	public void AmazonData(String input) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("nav-link-accountList")).click();
		WebElement username= driver.findElement(By.name("email"));
		username.sendKeys("decentsandy744@gmail.com");
		driver.findElement(By.id("continue")).click();
		WebElement password = driver.findElement(By.id("ap_password"));
		password.sendKeys("Intel@22August");
		WebElement logInbutton = driver.findElement(By.className("a-button-input"));
		logInbutton.click();
		WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys(input+Keys.ENTER);
	}
	
	@DataProvider(name="inputs")
	public Object[][] data1()
	{
		return new Object[][] {{"shoe"}, {"slippers"}, {"shirts"}, {"jeans"}, {"trousers"}, {"shorts"}, {"tshirts"}, {"headphone"}, {"mobile"}, {"charger"}};
		
	}

}
