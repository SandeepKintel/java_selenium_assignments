package assignments;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Asg116_LaunchAmazonTestNG 
{
	@Test
	void LaunchAmazon()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
//		String title=driver.getTitle();
//		String expected="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
//		Assert.assertEquals(title, expected);     
		
	}
	
	

}
