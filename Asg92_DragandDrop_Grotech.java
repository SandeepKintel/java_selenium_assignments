package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Asg92_DragandDrop_Grotech 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		WebElement source=driver.findElement(By.xpath("//div[@id='container-6']"));
		WebElement target=driver.findElement(By.xpath("//div[@id='div2']"));
		Actions action = new Actions(driver);
		action.dragAndDrop(source, target).perform();
		
	}

}
