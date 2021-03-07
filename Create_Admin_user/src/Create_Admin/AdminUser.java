package Create_Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AdminUser {
WebDriver obj;
	@Test
	public void ChromeLaunch()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\AmitG\\AG\\chromedriver.exe");
		 obj = new ChromeDriver();
		obj.manage().window().maximize();
		obj.get("https://stag-5-cmo-1.convirza.com/");
		
		 
	}
	@Test
	public void login()
	{
	
		obj.findElement(By.id("email")).sendKeys("snehal.d@moentek.com");
		obj.findElement(By.id("password")).sendKeys("lmc2demo");
		obj.findElement(By.id("b1")).click();
			}
	
}
