package My_projects;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;

public class Adactin_Hotel {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.edge.driver", 
			"C:\\Users\\Ashok Ranjani\\eclipse-workspace\\Maven_project\\driver\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://adactinhotelapp.com/");
	driver.findElement(By.name("username")).sendKeys("ashokreee");
	driver.findElement(By.name("password")).sendKeys("5YM7ZE");
	driver.findElement(By.id("login")).click();
	Select s=new Select(driver.findElement(By.name("location")));
	s.selectByValue("Paris");
	Select s1=new Select(driver.findElement(By.name("hotels")));
	s1.selectByValue("Hotel Sunshine");
	Select s2=new Select(driver.findElement(By.id("room_type")));
	s2.selectByValue("Super Deluxe");
	Select s3=new Select(driver.findElement(By.id("room_nos")));
	s3.selectByValue("2");
	driver.findElement(By.name("datepick_in")).clear();
	driver.findElement(By.name("datepick_in")).sendKeys("09/07/2022");
	driver.findElement(By.name("datepick_out")).clear();
	driver.findElement(By.name("datepick_out")).sendKeys("11/07/2022");
	Select s4=new Select(driver.findElement(By.id("adult_room")));
	s4.selectByValue("2");
	driver.findElement(By.name("Submit")).click();
	driver.findElement(By.name("radiobutton_0")).click();
	driver.findElement(By.name("continue")).click();
	driver.findElement(By.name("first_name")).sendKeys("Ashok");
	driver.findElement(By.name("last_name")).sendKeys("kumar");
	driver.findElement(By.name("address")).sendKeys("No:12 1st cross street Atlanta PA-53352");
	driver.findElement(By.name("cc_num")).sendKeys("1234567890425457");
	Select s5=new Select(driver.findElement(By.name("cc_type")));
	s5.selectByValue("VISA");
	Select s6=new Select(driver.findElement(By.name("cc_exp_month")));
	s6.selectByValue("6");
	Select s7=new Select(driver.findElement(By.name("cc_exp_year")));
	s7.selectByValue("2022");
	driver.findElement(By.name("cc_cvv")).sendKeys("456");
	driver.findElement(By.name("book_now")).click();
	Thread.sleep(5000);
	driver.findElement(By.name("logout")).click();
	TakesScreenshot ts=(TakesScreenshot) driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	File des=new File("C:\\Users\\Ashok Ranjani\\eclipse-workspace\\Maven_project\\Screenshot\\Hotelapp.png");
	FileHandler.copy(source,des);
	Thread.sleep(5000);
	//driver.close();
	WebElement logo = driver.findElement(By.xpath("//img[@alt='AdactIn Group']"));
    String cssValue = logo.getCssValue("border-collapse");
    System.out.println(cssValue);
//    Color fromString = Color.fromString(cssValue);
//    System.out.println(fromString);
    driver.close();
    
}
}
