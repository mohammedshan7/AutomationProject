package Test;

import org.testng.annotations.Test;

import Page.Logout;

public class LogoutTest extends SearchTest {
	@Test(priority=4)
	private void test4() throws InterruptedException {
		Logout ob=new Logout(driver);
		Thread.sleep(3000);
		  ob.click11();
		  Thread.sleep(3000);
		  ob.click12();
		  Thread.sleep(3000);
		  ob.scrolldown2();
		  Thread.sleep(3000);
		  ob.click13();
		  Thread.sleep(3000);
}
}
