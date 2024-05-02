package testngprograms;

import javax.swing.RepaintManager;

import org.checkerframework.common.util.count.report.qual.ReportCall;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Classa {
	@Test
	public void m1()
	{
		Reporter.log("hi bunny",true);
	}

}
