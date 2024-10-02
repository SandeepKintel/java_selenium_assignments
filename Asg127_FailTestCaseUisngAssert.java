package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Asg127_FailTestCaseUisngAssert 
{
	@Test
	public void Assert_Check()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.xpath("//span[@class='nav-cart-icon nav-sprite']"));
		Assert.assertFalse(e1.isDisplayed());
		driver.close();

	}

}
