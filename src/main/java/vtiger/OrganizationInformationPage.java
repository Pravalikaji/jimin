package vtiger;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

import vtigergeneric.WebDriverUtility;


	public class OrganizationInformationPage extends WebDriverUtility{
		@FindBy(xpath = "//span[@class='dvHeaderText']")
		private WebElement OrgHeaderText;

		public OrganizationInformationPage (WebDriver driver) // test script
		{
			PageFactory.initElements(driver, this);
		}

		public WebElement getOrgHeaderText() {
			return OrgHeaderText;
		}
		//business library
		public String getHeader() {
			return OrgHeaderText.getText();
			
		}
		

}
