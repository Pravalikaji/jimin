package group;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Disable {
	@Test
	public void tc1() {
		Reporter.log("tc1",true);
	}
	@Test
	public void tc2() {
		Reporter.log("tc2",true);
	}
	@Test
	public void tc3() {
		Reporter.log("tc3",true);
	}

}
