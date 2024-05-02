package vtigerpractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Notepadfetch {


	private static final CharSequence CLK = null;

	public static void main(String[] args) throws Throwable  {
		// TODO Auto-generated method stub
		FileInputStream fisp=new FileInputStream("C:\\Users\\prava\\OneDrive\\Desktop\\CommonData.txt");
		Properties p=new Properties();
		p.load(fisp);
		String URL=p.getProperty("url");
		System.out.println(URL);
		
		String UN=p.getProperty("un");
		System.out.println(UN);
		
		String PWD=p.getProperty("pwd");
		System.out.println(PWD);
		
		String BROWSER=p.getProperty("browser");
		System.out.println(BROWSER);
		String orgname=p.getProperty("orgname");
		System.out.println(orgname);
		
		
		WebDriver driver=new EdgeDriver();
		driver.get(URL);
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(UN);
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(PWD);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		driver.findElement(By.xpath("//a[.='Organizations']")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(orgname);
		driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();


	}
}
