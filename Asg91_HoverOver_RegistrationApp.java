package assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Asg91_HoverOver_RegistrationApp 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/automate-me/");
		driver.manage().window().maximize();
		WebElement reg=driver.findElement(By.xpath("//h3[contains(text(),'Registration')]"));
		Actions action = new Actions(driver);
		action.moveToElement(reg).perform();
		
	}

}
