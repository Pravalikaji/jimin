package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Meesho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.get("https:/www.gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("abc@gmail.com");
		

	}

}
