package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import net.bytebuddy.build.ToStringPlugin.Exclude;

public class testNG_demo {
	
	static WebDriver driver;
	
	@Test
	private void browserlaunch() {

	
	System.setProperty("webdriver.edge.driver",
			"C:\\Users\\Ashok Ranjani\\eclipse-workspace\\Selenium\\Driver\\driver2\\msedgedriver.exe");
	driver = new EdgeDriver();
	driver.get("https://adactinhotelapp.com/");
	driver.manage().window().maximize();
	driver.findElement(By.name("username")).sendKeys("ashokreee");
	driver.findElement(By.name("password")).sendKeys("5YM7ZE");
	driver.findElement(By.id("login")).click();
}
	@Test
	private void browserlaunch1() {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\Ashok Ranjani\\eclipse-workspace\\Selenium\\Driver\\driver2\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("ashokreee");
		driver.findElement(By.name("password")).sendKeys("5YM7ZE");
		driver.findElement(By.id("login")).click();
		
		
	}
}

