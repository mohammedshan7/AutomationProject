package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Login {
	WebDriver driver;
	 By path1=By.xpath("/html/body/div[4]/div[1]/div[2]/header/div/div[2]/div/div[1]");
	 By path2=By.xpath("/html/body/div[4]/div[1]/div[2]/header/div/div[2]/div/div[1]/div/div[2]/form/input[3]");
	 By path3=By.xpath("/html/body/div[4]/div[1]/div[2]/header/div/div[2]/div/div[1]/div/div[2]/form/input[4]");
	 By path4=By.xpath("/html/body/div[4]/div[1]/div[2]/header/div/div[2]/div/div[1]/div/div[2]/form/div[1]/input");
	 By path5=By.xpath("//*[@id=\"SiteNav\"]/li[1]/button/span");
	 
	 public Login(WebDriver driver) {
		 this.driver=driver;
		
	}

	public void sign()
	 {
	  WebElement s=driver.findElement(path1);
	  Actions act=new Actions(driver);
	  act.moveToElement(s).perform();
	  
	 }
	 
	  public void setvalues(String email, String pass)
	 {
	  driver.findElement(path2).sendKeys(email);
	  driver.findElement(path3).sendKeys(pass);
	 }
	 public void click1()
	 {
	  driver.findElement(path4).click();
	 }
	 
	 public void click2()
	 {
	  driver.findElement(path5).click();
	 }
}
