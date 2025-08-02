package pageObjectclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActualTestCase {
     WebDriver driver;
	@BeforeClass
	void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amarpatil\\AppData\\Local\\Programs\\Chromedriver\\chromedriver-win64\\chromedriver.exe");
		 driver = new ChromeDriver();

	 
	 WebDriverManager.chromedriver().setup();
     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
     
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  }
	
	@Test
	void test1()
	{
		loginpage pg=new loginpage(driver);
		pg.username("Admin");
		pg.password("admin123");
		pg.clbtn();
	}
	
	@Test
	void test2(){
		homepage1 pg1=new homepage1(driver);
		pg1.profile();
		pg1.logout();
	}
	
	@AfterClass
	void teardown()
	{
		driver.close();
	}
}
