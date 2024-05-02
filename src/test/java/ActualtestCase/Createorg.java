package ActualtestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import vtiger.CreateNewOrganizationPage;
import vtiger.Homepage;
import vtiger.OrganizationInformationPage;
import vtiger.OrganizationPage;
import vtigergeneric.Baseclass;

public class Createorg extends Baseclass{


	@Test
	public void createorg() {
		//click on orgmodule
		Homepage hp=new Homepage(driver);
		hp.clickOnOrganizationsLnk();
		//click on lookup image 
		OrganizationPage op=new OrganizationPage(driver);
		op.ClickonorgLookUpImg();
		//give org name
		CreateNewOrganizationPage cnop=new CreateNewOrganizationPage(driver);
		cnop.CreateNewOrganization("Capgemini"+ju.getRandomNum());
		//get the header and verify 
		OrganizationInformationPage oip=new OrganizationInformationPage(driver);
		 String header=oip.getHeader();
		 //verify
		 Assert.assertTrue(header.contains("Capgemini"));
		 System.out.println("====organization is created and tc is pass===");
	}

}
