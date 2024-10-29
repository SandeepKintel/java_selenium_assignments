package Assignments68_Aug24;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Asg68_LogIntoFacebook {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/?next=https%3A%2F%2Fwww.facebook.com%2F");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.name("email"));
		e1.sendKeys("wakanda");
		WebElement e2 = driver.findElement(By.name("pass"));
		e2.sendKeys("testonomy");
		WebElement e3 =  driver.findElement(By.id("loginbutton"));
		e3.sendKeys(Keys.ENTER);
		
	}
}
