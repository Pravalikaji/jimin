package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.get("https:/www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("abc@123.com");
		driver.findElement(By.id("pass")).sendKeys("123456789");
		

	}

}
