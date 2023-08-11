package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Search {
	WebDriver driver;
	By search=By.xpath("//*[@id=\"shopify-section-bottom-bar-section\"]/div/div/div[1]/div/div/form/div/input[1]");
	By searchbutton=By.xpath("//*[@id=\"shopify-section-bottom-bar-section\"]/div/div/div[1]/div/div/form/button");
	 public Search(WebDriver driver) {
		this.driver=driver;
	}
	public void setvalues(String j)
	 {
	  driver.findElement(search).sendKeys( j);
	 }
	 public void click10()
	 {
	  driver.findElement(searchbutton).click();
	 }
}
