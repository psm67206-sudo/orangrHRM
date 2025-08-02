package pageObjectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homepage1 {

	WebDriver driver;
	 public homepage1(WebDriver driver){
	this.driver=driver;
	}

	By profile1=By.xpath("//p[@class='oxd-userdropdown-name']");
	By logout1=By.linkText("Logout");
	

	

	 public void profile()
	 {
		 driver.findElement(profile1).click();
		 
	 }
	 public void logout()
	 {
		 driver.findElement(logout1).click();
		 
	 }
}
