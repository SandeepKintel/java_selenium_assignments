package assignments;

import org.openqa.selenium.edge.EdgeDriver;

public class Asg82_NavigateMethod {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.navigate().to("https://www.google.com"); //navigate to the google
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().back(); // backward
		Thread.sleep(2000);
		driver.navigate().forward(); //forward
		Thread.sleep(2000);
		driver.navigate().refresh(); //fresh
	}

	

}
