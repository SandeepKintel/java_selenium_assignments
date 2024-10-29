package Assiugnmnet66_Aug24;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFireFox {
	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
	}

}
