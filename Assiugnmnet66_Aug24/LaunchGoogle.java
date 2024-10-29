package Assiugnmnet66_Aug24;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchGoogle {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
	}

}
