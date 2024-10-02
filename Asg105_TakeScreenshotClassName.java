package assignments;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Asg105_TakeScreenshotClassName 
{
	ChromeDriver driver;
	public void GetScreenShot() throws IOException, InterruptedException
      {
		new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobile");
		Thread.sleep(2000);
		List<WebElement> li=driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		int count = li.size();
		System.out.println(count);
		li.get(3).click();
//		Date d1 = new Date();
//		Date d2 = new Date(d1.getTime());
//		System.out.println(d2);
			
	}

}