package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Asg122_SearchAmazon10input 
{
	@Test(dataProvider="inputs")
	void SearchProduct(String input)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement searchField= driver.findElement(By.id("twotabsearchtextbox"));
		searchField.sendKeys(input+Keys.ENTER);
	}
	
	@DataProvider(name="inputs")
	public Object[][] data1(){
		return new Object[][] {{"shoes"},{"Pen"},{"Mobile"},{"jackets"},{"Shirts"},{"TShirt"},{"Jeans"},{"Trouser"},{"Sandals"},{"Kurta"}};
		
	}

}
