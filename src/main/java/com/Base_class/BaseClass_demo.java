package com.Base_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass_demo {
public static WebDriver driver;

	
	public WebDriver browserLaunch(String type) throws InterruptedException {
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.edge.driver", 
					"C:\\Users\\Ashok Ranjani\\eclipse-workspace\\Selenium\\Driver\\driver2\\msedgedriver.exe");
			WebDriver driver=new EdgeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
			Thread.sleep(3000);}
			else if (type.equalsIgnoreCase("EDGE")) {
				System.setProperty("webdriver.edge.driver", 
						"C:\\Users\\Ashok Ranjani\\eclipse-workspace\\Selenium\\Driver\\driver2\\msedgedriver.exe");
				WebDriver driver=new EdgeDriver();
				driver.get("https://www.amazon.in/");
				driver.manage().window().maximize();
				//driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
				//Thread.sleep(3000);
			}
		return driver;
		}
		
		
	
	public static WebDriver geturl(String url) {
      driver.get(url);
	return driver;
	}
	public static WebDriver elementclick(WebElement element) {
      element.click();
      return driver;
	}
	}
	
	

