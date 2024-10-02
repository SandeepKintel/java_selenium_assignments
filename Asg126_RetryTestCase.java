package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Asg126_RetryTestCase 
{
	ChromeDriver driver= new ChromeDriver();
	@Test(retryAnalyzer=assignments.Asg126_Retry_Logic.class)
	void TestCase_Retry()
	{
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//WebElement e1=driver.findElement(By.xpath(" //input[@id='twotabsearchtextbox']"));
		WebElement e1=driver.findElement(By.xpath(" //output[@id='twotabsearchtextbox']"));
		e1.sendKeys("shoe");
	}

}
