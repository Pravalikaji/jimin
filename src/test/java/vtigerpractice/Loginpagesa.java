package vtigerpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpagesa {
	@FindBy(xpath="//input[@id='user-name']")private WebElement untxt;
	@FindBy(xpath="//input[@id='password']")private WebElement pwdtxt;
	@FindBy(xpath="//input[@id='login-button']")private WebElement loginbtn;
	public Loginpagesa(WebDriver driver ) {
		PageFactory.initElements(driver,this);
	}
	public WebElement getUntxt() {
		return untxt;
	}
	public WebElement getPwdtxt() {
		return pwdtxt;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	
	
}
