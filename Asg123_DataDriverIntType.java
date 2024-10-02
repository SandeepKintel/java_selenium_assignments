package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Asg123_DataDriverIntType 
{
	@Test(dataProvider="data1")
	void SearchProductIntType(int input)
	{
		System.out.println(input);
//		ChromeDriver driver=new ChromeDriver();
//		driver.get("https://www.amazon.in/");
//		driver.manage().window().maximize();
//		WebElement searchField= driver.findElement(By.id("twotabsearchtextbox"));
//		searchField.sendKeys(input+Keys.ENTER);
	}
	
	@DataProvider(name="data1")
	public Object[][] datainput(){
		return new Object[][] {{23},{32},{35},{76},{90}};
	}

}
