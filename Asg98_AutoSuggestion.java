package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Asg98_AutoSuggestion 
{
	public static void main(String[] args) throws InterruptedException 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
		e1.sendKeys("Bangalore");
		Thread.sleep(2000);
		List<WebElement> l1=(List<WebElement>) driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		int size = l1.size();
		System.out.println(size);
		l1.get(0).click();
		
	}

}
