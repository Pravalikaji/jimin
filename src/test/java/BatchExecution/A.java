package BatchExecution;

import org.checkerframework.common.util.count.report.qual.ReportCall;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class A {
	@Test
	public void tc1()
	{
		Reporter.log("tc1",true);
	}
	@Test
	public void tc2()
	{
		Reporter.log("tc2",true);
	}
	@Test
	public void tc3()
	{
		Reporter.log("tc3",true);
	}
	
	
	

}
