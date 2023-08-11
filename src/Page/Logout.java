package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Logout {
	WebDriver driver;
	By home=By.xpath("//*[@id=\"shopify-section-header\"]/div[2]/header/div/div[1]");
	By account=By.xpath("//*[@id=\"shopify-section-header\"]/div[2]/header/div/div[2]/div/div[1]");
	By logout=By.xpath("//*[@id=\"customer_logout_link\"]");

	public Logout(WebDriver driver) {
		this.driver=driver;
	}
	public void click11()
	 {
	  driver.findElement(home).click();
	 }
	 public void click12()
	 {
	  driver.findElement(account).click();
	 }
	 public void scrolldown2()
	 {
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  js.executeScript("window.scrollTo(0,400)");
	 }
	 public void click13()
	 {
	  driver.findElement(logout).click();
	 }

}
