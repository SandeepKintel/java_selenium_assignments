package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Asg74_ClickOnYotutbeSignIn {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.className("yt-spec-touch-feedback-shape__fill")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
