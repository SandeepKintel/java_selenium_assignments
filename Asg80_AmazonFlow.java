package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Asg80_AmazonFlow 
{
	public static void main(String[] args)
	{
		EdgeDriver driver = new EdgeDriver();
		
		    driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			WebElement searchField= driver.findElement(By.id("twotabsearchtextbox"));
			searchField.sendKeys("shoe"+Keys.ENTER);
			WebElement firstprod = driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
			firstprod.click();
			WebElement e1=driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
			e1.click();
			
		}
		
	}

