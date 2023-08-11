package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Cart {
	WebDriver driver;
	By himalayan=By.xpath("//*[@id=\"SiteNavLabel-shop-by-bike\"]/div/ul/li[1]/ul/li[3]/a/span");
	By crashgard=By.xpath("//*[@id=\"usf_container\"]/div/ul/li[3]/div/div[2]/div[2]/a[2]");
	By addcart=By.xpath("//*[@id=\"product_form_6564452106419\"]/div[1]/div/button/span[1]");
	By viewcart=By.xpath("/html/body/div[4]/div/a");
	By plus=By.xpath("//*[@id=\"shopify-section-cart-template\"]/div/div[1]/form/div[1]/div/table/tbody/tr/td[3]/div[1]/div/div[2]");
	By update=By.xpath("//*[@id=\"shopify-section-cart-template\"]/div/div[1]/form/div[1]/div/div[2]/input");
	By clear=By.xpath("//*[@id=\"shopify-section-cart-template\"]/div/div[1]/form/div[1]/div/div[2]/a");
	public Cart(WebDriver driver) {
		this.driver=driver;
		
	}
	public void click3()
	 {
	  driver.findElement(himalayan).click();
	 }
	 public void click4()
	 {
	  driver.findElement(crashgard).click();
	 }
	 public void click5()
	 {
	  driver.findElement(addcart).click();
	 }
	 public void click6()
	 {
	  driver.findElement(viewcart).click();
	 }
	 public void scrolldown()
	 {
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  js.executeScript("window.scrollTo(0,400)");
	 }
	 public void click7()
	 {
	  driver.findElement(plus).click();
	 }
	 public void click8()
	 {
	  driver.findElement(update).click();
	 }
	 public void click9()
	 {
	  driver.findElement(clear).click(); 
	 }
}
