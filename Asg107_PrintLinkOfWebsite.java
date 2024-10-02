package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Asg107_PrintLinkOfWebsite 
{
	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		
		    driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			List<WebElement> l1=driver.findElements(By.tagName("a"));
			int count = l1.size();
			System.out.println(count);
//			WebElement e1=l1.get(1);
//			System.out.println(e1);
			for(int i=0; i<l1.size(); i++)
			{
				WebElement e1 =l1.get(i);
				String url=e1.getAttribute("href");
				String text=e1.getText();
				System.out.println(url);
				System.out.println(text);
			}

		}

}
