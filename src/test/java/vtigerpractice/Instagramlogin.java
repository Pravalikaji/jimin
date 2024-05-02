package vtigerpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

public class Instagramlogin {
	@FindBy(xpath="//input[@name='username']")private WebElement phntxt;
	@FindBy(xpath="//input[@name='password']")private WebElement pwdtxt;
	@FindBy(xpath="//div[@class='x9f619 xjbqb8w x78zum5 x168nmei x13lgxp2 x5pf9jr xo71vjh x1xmf6yo x1e56ztr x540dpk x1m39q7l x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1']")private WebElement loginbtn;
	public Instagramlogin(WebDriver driver ) {
		PageFactory.initElements(driver,this);
		}
	public WebElement getPhntxt() {
		return phntxt;
	}
	public WebElement getPwdtxt() {
		return pwdtxt;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	}


