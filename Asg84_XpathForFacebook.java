package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Asg84_XpathForFacebook 
{
	public static void main(String[] args) 
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("test@yopmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("india");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
	}

}
