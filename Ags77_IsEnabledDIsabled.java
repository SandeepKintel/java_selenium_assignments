package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Ags77_IsEnabledDIsabled 
{
	public static void main(String[] args) 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement searchField= driver.findElement(By.id("twotabsearchtextbox"));
		
		if(searchField.isDisplayed() && searchField.isEnabled()) 
		{
			searchField.sendKeys("shoe"+Keys.ENTER);
		}
	}
	
}

