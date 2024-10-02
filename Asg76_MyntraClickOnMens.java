package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Asg76_MyntraClickOnMens {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.className("desktop-navLink")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
