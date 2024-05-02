package vtigerpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SERE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.saucedemo.com");
		WebElement UN = driver.findElement(By.xpath("//input[@id='user-name']"));
		driver.navigate().refresh();
		UN.sendKeys("admin");
		
		

	}

}
