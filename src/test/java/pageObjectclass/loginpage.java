package pageObjectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {
	//constructor
	WebDriver driver;
	 loginpage(WebDriver driver){
	this.driver=driver;
	}

	 //locators or pageElements
	 By user=By.xpath("//input[@name='username']");
	 By pass=By.name("password");
	 By cl=By.xpath("//button[@type='submit']");
	 
	 //action methods
	 public void username(String un)
	 {
		 driver.findElement(user).sendKeys(un);
		 
	 }
	 public void password(String pw)
	 {
		 driver.findElement(pass).sendKeys(pw);
		 
	 }
	 public void clbtn()
	 {
		 driver.findElement(cl).click();
		 
	 }
	 
	 
}
