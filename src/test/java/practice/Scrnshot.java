package practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class Scrnshot {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver d=new EdgeDriver();
		d.get("https://www.google.com");
		 WebElement ele=d.findElement(By.xpath("//img[@class='lnXdpd']"));
		File src=ele.getScreenshotAs(OutputType.FILE);
	    File dest =new File("C:\\Users\\prava\\OneDrive\\Desktop\\scrnshots\\LOGO.png");
        Files.copy(src, dest);
		
		 

	}

}
