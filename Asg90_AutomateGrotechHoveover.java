package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Asg90_AutomateGrotechHoveover 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/automate-me/");
		driver.manage().window().maximize();
		WebElement flight = driver.findElement(By.linkText("Flight"));
		Actions action=new Actions(driver);
		action.moveToElement(flight).perform();

	}

}
