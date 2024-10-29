package Assignments69_Aug24;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Asg69_AutomateRegistrationPage {
	public static void main(String[] args) {
		EdgeDriver driver  = new EdgeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement e1= driver.findElement(By.id("fname"));
		e1.sendKeys("sandeep");
		WebElement e2= driver.findElement(By.id("fname"));
		e2.sendKeys("sandeep");
		WebElement e3 =driver.findElement(By.id("lname"));
		e3.sendKeys("kumar");
		WebElement e4=driver.findElement(By.id("email"));
		e4.sendKeys("sandeeptest@yopmail.com");
		WebElement e5 =driver.findElement(By.id("password"));
		e5.sendKeys("123456@#");
		WebElement e6 = driver.findElement(By.id("male"));
		e6.click();
		if(e6.isSelected()) {
			System.out.println("Radio button is selected");
		}
		WebElement e7 = driver.findElement(By.name("Skills"));
		Select select = new Select(e7);
		select.selectByVisibleText("Technical Skills");
		//select.selectByValue("select2");
		//select.selectByIndex(1);
		WebElement country = driver.findElement(By.id("Country"));
		Select select2 = new Select(country);
		select2.selectByIndex(8);
		driver.findElement(By.id("Present-Address")).sendKeys("Test Address");
		driver.findElement(By.id("Permanent-Address")).sendKeys("Test Address");
		driver.findElement(By.name("Pincode")).sendKeys("1233");
		WebElement relegion = driver.findElement(By.id("Relegion"));
		Select select3 = new Select(relegion);
		select3.selectByValue("Hindu");
		WebElement relocate = driver.findElement(By.id("relocate"));
		relocate.click();
		if(relocate.isSelected()) {
			relocate.sendKeys(Keys.TAB);
		}
		driver.findElement(By.name("Submit")).click();
		
		
}

	
	

}
