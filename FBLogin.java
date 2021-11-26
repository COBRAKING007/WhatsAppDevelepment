package FacebookLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FBLogin {
	WebDriver driver;
	@BeforeClass
	public void launch() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void tc01() {
		driver.findElement(By.id("email")).sendKeys("Hi");
		driver.findElement(By.id("pass")).sendKeys("Hello");
		driver.findElement(By.id("u_0_d_zh")).click();
	}
	
//	@Test(priority = 2, dataProvider = "MyData")
//	public void reEnter(String email,String pass) {
//		driver.navigate().refresh();
//		driver.findElement(By.id("email")).sendKeys(email);
//		driver.findElement(By.id("pass")).sendKeys(pass);
//		driver.findElement(By.id("u_0_d_zh")).click();
//		
//	}
	
//	@DataProvider(name = "MyData")
//	public Object[][] getDatas() {
//		return new Object[][] {
//			{"Jack","1234"},{"Michel","5678"},{"Dany","1290"}
//		};
	}
	

