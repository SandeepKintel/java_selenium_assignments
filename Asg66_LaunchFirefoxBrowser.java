package assignments;

import org.openqa.selenium.edge.EdgeDriver;

public class Asg66_LaunchFirefoxBrowser 
{
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.close();
		
	}

}
