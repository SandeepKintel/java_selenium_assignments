package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Asg88_AutomateDropdown 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registeration-form/");
		driver.manage().window().maximize();
		WebElement gender = driver.findElement(By.xpath("//select[@id='gender']"));
		Select d1= new Select(gender);
		d1.selectByIndex(1);
		WebElement state = driver.findElement(By.xpath("//select[@id='state']"));
		Select d2= new Select(state);
		d2.selectByIndex(4);
		
	}

}
