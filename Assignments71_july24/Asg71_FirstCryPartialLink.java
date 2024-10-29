package Assignments71_july24;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Asg71_FirstCryPartialLink {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.firstcry.com/");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("GIRL")).click();
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
