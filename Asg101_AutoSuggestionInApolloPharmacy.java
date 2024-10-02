package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Asg101_AutoSuggestionInApolloPharmacy 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.apollopharmacy.in/");	
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.xpath("//div[@class='Home_searchSelectMain__VL1lN']"));
		e1.click();
		WebElement e2=driver.findElement(By.xpath("//input[@id='searchProduct']"));
		e2.sendKeys("PCM");
		Thread.sleep(2000);
		List<WebElement> li= driver.findElements(By.xpath("//div[@class='MedicineAutoSearch_searchList___m_g7 null']/ul/li"));
		int count = li.size();
		System.out.println(count);
		li.get(3).click();
		
	}
	
	

}
