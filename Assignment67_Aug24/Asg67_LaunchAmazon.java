package Assignment67_Aug24;

import org.openqa.selenium.chrome.ChromeDriver;

public class Asg67_LaunchAmazon {
		public static void main(String[] args) {
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
		}

}
