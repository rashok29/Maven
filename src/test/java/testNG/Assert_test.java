package testNG;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Assert_test {

	public static WebDriver driver;

	@BeforeSuite
	public void setProperty() {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\Ashok Ranjani\\eclipse-workspace\\Maven_project\\driver\\msedgedriver.exe");

	}

	@Test(priority = 1)
	public void browserLaunch() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
	}

	@Test(dependsOnMethods = "browserLaunch")
	private void url() {
		driver.get("https://www.amazon.in/");
	}

	@Test(priority = 2)
	private void searchBox() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung");
		driver.findElement(By.id("nav-search-submit-button")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250);");
		WebElement sam = driver.findElement(By.xpath(
				"/html/body/div[1]/div[2]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span"));
		sam.click();
		String text = sam.getText();
		System.out.println(text);
		Set<String> Allwindow = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(Allwindow);
		driver.switchTo().window(list.get(0));
		WebElement sam1 = driver.findElement(By.xpath(
				"//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[4]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span"));
		sam.click();
		String text2 = sam1.getText();
		System.out.println(text2);
   		driver.quit();
	}

}
