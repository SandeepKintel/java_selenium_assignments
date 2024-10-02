package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Asg89_AmazonCategoryDropdown 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement category = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select d1= new Select(category);
		d1.selectByIndex(5);	
	}

}
