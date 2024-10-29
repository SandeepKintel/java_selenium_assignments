package Assiugnmnet66_Aug24;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdge {
		public static void main(String[] args) {
			EdgeDriver driver = new EdgeDriver();
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
		}

}
