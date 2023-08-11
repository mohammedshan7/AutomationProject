package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Page.Login;

public class LoginTest {
	WebDriver driver; 
	@BeforeClass
	public void Setup()
	{
		
		driver=new ChromeDriver();
        driver.get("https://bandidospitstop.com");
	    driver.navigate();
	    driver.manage().window().maximize();
		 
	}
	@Test(priority=1)
	public void test1() throws InterruptedException
	{
		Login ob=new Login(driver);
		ob.sign();
		  Thread.sleep(3000);
		  ob.setvalues("mohammedsha776@gmail.com", "943099");
		  Thread.sleep(3000);
		  ob.click1();
		  Thread.sleep(3000);
		  ob.click2();
		  
	}
}
