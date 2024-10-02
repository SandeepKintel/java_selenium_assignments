package assignments;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Asg117_InvocationAccount 
{
	@Test(invocationCount=3)
	void LaunchAmazon()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

}
}
