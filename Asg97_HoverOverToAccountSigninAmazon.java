package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Asg97_HoverOverToAccountSigninAmazon 
{
	public static void main(String[] args) 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		Actions action=new Actions(driver);
		action.moveToElement(e1).perform();
		WebElement singin = driver.findElement(By.xpath("//div[@id='nav-flyout-ya-signin']/a"));
		singin.click();
		
		
		
	}

}
