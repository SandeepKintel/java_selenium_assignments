package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Asg100_AutoSuggestionFlipkart 
{
	public static void main(String[] args) throws InterruptedException 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.xpath(" //input[@class='Pke_EE']"));
		e1.sendKeys("shoe");
		Thread.sleep(5000);
		List<WebElement> l1=(List<WebElement>) driver.findElements(By.xpath("//form[@class='_2rslOn header-form-search']/ul/li"));
		int size = l1.size();
		System.out.println(size);
		l1.get(3).click();
		
	}

}
