package qaclickacademy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SeleniumTest {
	@Test
	public void sleniumTest()
	{
		System.out.println("Selenium");
		Reporter.log("it is updated one",true);
		Reporter.log("it is updated two",true);
		Reporter.log("it is updated three",true);
	}
	@Test
	public void uiInternal()
	{
		System.out.println("uiInternal");
	}
	@Test
	public void getVideo() {
		Reporter.log("yeah this is new method", true);
	}
}




