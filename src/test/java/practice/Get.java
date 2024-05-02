package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Get {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		//driver.get("https://www.amazon.com");
		//Thread.sleep(5000);
		//driver.close();
		driver.navigate().to("https://www.google.com");
		Thread.sleep(5000);
		driver.navigate().to("https://www.amazon.com");
		Thread.sleep(5000);
		
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		//refresh page
	   driver.navigate().refresh();


	}

}
