package Test;

import org.testng.annotations.Test;

import Page.Cart;

public class CartTest extends LoginTest{
	@Test(priority=2)
	private void test2() throws InterruptedException {
		Cart ob=new Cart(driver);
		  Thread.sleep(3000);
		  ob.click3();
		  Thread.sleep(3000);
		  ob.click4();
		  Thread.sleep(3000);
		  ob.click5();
		  Thread.sleep(3000);
		  ob.click6();
		  Thread.sleep(3000);
		  ob.scrolldown();
		  Thread.sleep(3000);
		  ob.click7();
		  Thread.sleep(3000);
		  ob.click8();
		  Thread.sleep(3000);
		  ob.click9();
		  Thread.sleep(3000);
}
}
