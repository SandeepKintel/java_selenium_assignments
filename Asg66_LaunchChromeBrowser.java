package assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class Asg66_LaunchChromeBrowser 
{
		public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			driver.close();
			
		}

}

