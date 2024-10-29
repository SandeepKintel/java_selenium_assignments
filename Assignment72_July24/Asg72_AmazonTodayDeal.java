package Assignment72_July24;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Asg72_AmazonTodayDeal {
	
		public static void main(String[] args) throws InterruptedException
		{
			EdgeDriver driver = new EdgeDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			driver.findElement(By.partialLinkText("Today's")).click();
			Thread.sleep(3000);
			driver.close();
		}

}
