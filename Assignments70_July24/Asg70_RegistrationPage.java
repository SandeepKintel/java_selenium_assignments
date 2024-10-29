package Assignments70_July24;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Asg70_RegistrationPage {
	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://grotechminds.com/registeration-form/");
		driver.manage().window().maximize();
		driver.findElement(By.name("firstName")).sendKeys("Raman");
		driver.findElement(By.name("lastName")).sendKeys("Singh");
		driver.findElement(By.id("email")).sendKeys("raman@yopmail.com");
		driver.findElement(By.name("phone")).sendKeys("9879989388");
		WebElement gender = driver.findElement(By.name("gender"));
		Select select2 = new Select(gender);
		select2.selectByValue("male");
		
		WebElement state = driver.findElement(By.id("state"));
		if(state.isDisplayed()) {
			//state.sendKeys(Keys.ARROW_DOWN);
			Select select = new Select(state);
			select.selectByVisibleText("Uttar Pradesh");
		}
		driver.findElement(By.id("aadhaar")).sendKeys("694312238709");
		driver.findElement(By.id("pan")).sendKeys("DQOTK7779A");
		WebElement check = driver.findElement(By.id("terms"));
		check.click();
//		if(check.isSelected()) {
//			check.sendKeys(Keys.TAB);
//		}
		driver.findElement(By.name("Submit")).click();
	}

}
