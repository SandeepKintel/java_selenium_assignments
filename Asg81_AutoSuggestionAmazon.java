package assignments;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Asg81_AutoSuggestionAmazon 
{
	public static void main(String[] args) throws InterruptedException 
	{
		EdgeDriver driver = new EdgeDriver();
	    driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement searchField= driver.findElement(By.id("twotabsearchtextbox"));
		searchField.sendKeys("shoe");
		Thread.sleep(2000);
		List<WebElement> li= driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div/div"));
		int count = li.size();
		System.out.println(count);
		li.get(10-7).click();

	}

}
