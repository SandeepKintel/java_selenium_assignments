package Assignments73_July24;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Asg73_IdfcBankSIte {
	public static void main(String[] args) throws InterruptedException
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://digital.idfcfirstbank.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("exploreOtherOptionBtn")).click();
		Thread.sleep(5 000);
		driver.close();
	}

}                 
