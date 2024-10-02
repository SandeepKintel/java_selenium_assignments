package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Asg87_AutomateDropdown 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement skills = driver.findElement(By.id("Skills"));
		Select dd=new Select(skills);
		dd.selectByVisibleText("Technical Skills");
		WebElement country = driver.findElement(By.name("Country"));
		Select d3=new Select(country);
		d3.selectByIndex(7);
		WebElement relegion=driver.findElement(By.id("Relegion"));
		Select d4=new Select(relegion);
		d4.selectByVisibleText("Sikh");
	
		
		
	}


	

}
