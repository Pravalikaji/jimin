package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetTitle {
	
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");
		//take the title of page
		String tit=driver.getTitle();
		System.out.println(tit);
		
	}

}
