package ActualtestCase;

import java.sql.Driver;

import org.testng.Assert;
import org.testng.annotations.Test;

import vtigergeneric.Baseclass;

public class VerifyTitleofHomePage extends Baseclass {
	@Test
	public void TC() {
		String et="vtiger";
		String ht=driver.getTitle();
		Assert.assertEquals(et,ht,"Both are not Matching");
		System.out.println("TC is pass");
	}

}
