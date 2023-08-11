package Test;

import org.testng.annotations.Test;

import Page.Search;

public class SearchTest extends CartTest {
	@Test(priority=3)
	private void test3() throws InterruptedException {
		Search ob=new Search(driver);
		Thread.sleep(3000);
		  ob.setvalues("KYT SKYHAWK GLOWING BLUE ORANGE FLUO");
		  Thread.sleep(3000);
		  ob.click10();
		  Thread.sleep(3000);
}
}
