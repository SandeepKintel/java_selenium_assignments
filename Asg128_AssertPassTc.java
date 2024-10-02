package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Asg128_AssertPassTc 
{
	@Test
	public void Assert_TestCase02()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.xpath("//span[@class='nav-cart-icon nav-sprite']"));
		Assert.assertTrue(e1.isDisplayed());
		driver.close();
		
	}

}
