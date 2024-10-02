package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Asg124_LoginAmazonVariousCred 
{
	@Test(dataProvider="inputs")
	void LoginAmazon(String uname, String psword)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("nav-link-accountList")).click();
		WebElement username= driver.findElement(By.name("email"));
		username.sendKeys(uname);
		driver.findElement(By.id("continue")).click();
		WebElement password = driver.findElement(By.id("ap_password"));
		password.sendKeys(psword);
		WebElement logInbutton = driver.findElement(By.className("a-button-input"));
		logInbutton.click();
		//Thread.sleep(7000);
		driver.close();
	}
	
	@DataProvider(name="inputs")
	public Object[][] dataset()
	{
		Object[][] obj = new Object[4][2];
		obj[0][0]="9716250778";
		obj[0][1]="Intel@22August";
		obj[1][0]="9716250772";
		obj[1][1]="Intel@22Aug";
		obj[2][0]="9716250778";
		obj[2][1]="Intel@22aug";
		obj[3][0]="9716250773";
		obj[3][1]="Intel@22aug";
		
		return obj;
		
		
		
	}

}
