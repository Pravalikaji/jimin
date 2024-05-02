package vtigergeneric;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import vtiger.Homepage;
import vtiger.LoginPage;

public class Baseclass {
public PropertyFileUtility pu=new PropertyFileUtility();
public ExcelFIleUtility eu=new ExcelFIleUtility();
public WebDriverUtility wu=new WebDriverUtility();
public Javautility ju=new Javautility();
public WebDriver driver=null;
@BeforeSuite
public void bsconfig() {
	System.out.println("===DB CONNECTIONS==");
}
@AfterSuite
public void asconfig() {
	System.out.println("===DB DISCONNECTION===");
}
@BeforeClass
public void bcconfig() throws Throwable{
	String BROWSER=pu.rfeadDataFromPropertyFile("browser");
	String URL=pu.rfeadDataFromPropertyFile("url");
	if(BROWSER.equalsIgnoreCase("edge")) {
		driver=new EdgeDriver();
		System.out.println("===Edge driver is Launched===");
		
	}
	else if (BROWSER.equalsIgnoreCase("chrome")) {
		driver=new ChromeDriver();
	}
	else {
		System.out.println("===invalid browser name===");
	}
	wu.MaximizeBrowserwindow(driver);
	wu.waitforpageload(driver);
	driver.get(URL);
	System.out.println("===browser is opened====");
	wu.getScreenshot(driver, "HOMEPAGE1");
		
	}
@AfterClass
public void teardown() {
	driver.quit();
	System.out.println("===browser is closed");
}
@BeforeMethod
public void bmconfig() throws Throwable {
	String UN = pu.rfeadDataFromPropertyFile("un");
	String PWD = pu.rfeadDataFromPropertyFile("pwd");
	LoginPage lp=new LoginPage(driver);
	lp.loginToApp(UN, PWD);
	System.out.println("====login is done successfully====");
	wu.getScreenshot(driver,"LOGINPAGE1");
	
	 
}
@AfterMethod
public void amconfig() {
	Homepage hp=new Homepage(driver);
	hp.logoutfromApp(driver);
	System.out.println("===log out is done successfully====");
}
}

