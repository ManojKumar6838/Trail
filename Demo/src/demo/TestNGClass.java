package demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGClass {

	@Test
	public void demoTest() {
		Reporter.log("Hello Test NG", true);
	}
	
	@Test
	public void demoTest2() {
		Reporter.log("Hello Test NG 2", true);
	}
}
