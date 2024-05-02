package group;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FunctionalSmoke {
	@Test(priority=1,groups="smokeTest")
	public void verifylink() {
		Reporter.log("smoketestcases",true);
		
	}
	@Test(priority=3,groups="Functional")
	public void verifylogin() {
		Reporter.log("functionaltestcases",true);
		
	}
	@Test(priority=2,groups="smokeTest")
	public void verifylogo() {
		Reporter.log("smoketestcases",true);
		
	}
	@Test(priority=4,groups="Functional")
	public void veriflogout() {
		Reporter.log("functionaltestcases",true);
		
	}
		}





