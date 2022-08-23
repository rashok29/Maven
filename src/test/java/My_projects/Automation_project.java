package My_projects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.Base_class.AP_Base_class;
import com.Base_class.Base_class;
import com.Base_class.ProceedtoCheckout;
import com.Base_class.checkoutPage;
import com.Base_class.frames1;
import com.Base_class.loginpage;

import Data_driven.datadriven_using_inproject;
import Data_driven.read_particular_data_excel;
import testNG.demo1_testNG;
import testNG.testNG_demo;

public class Automation_project extends AP_Base_class {
	public static WebDriver driver = AP_Base_class.getBrowser("edge");

	public static void main(String[] args) throws InterruptedException {
		driver = getUrl("http://automationpractice.com/index.php");
		PageFactory.initElements(driver, Base_class.class);
		PageFactory.initElements(driver, AP_Base_class.class);

		Thread.sleep(3000);
		Base_class.signin.click();
		Thread.sleep(3000);
		Base_class.email.sendKeys("demo112903211111@gmail.com");
		Base_class.pass.sendKeys("123456");
		Base_class.submit.click();
		Base_class.women.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700);");
		Base_class.image.click();
		js.executeScript("window.scrollBy(0,300);");
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
		Frame("element", "1", frame);
		for (int i = 1; i < 6; i++) {
			driver.findElement(By.xpath("//i[@class='icon-plus']")).click();
		}
		Thread.sleep(5000);
		Select size = new Select(driver.findElement(By.name("group_1")));
		size.selectByValue("3");
		driver.findElement(By.name("Submit")).click();
		driver.switchTo().parentFrame();
		ProceedtoCheckout.submit.click();

	}
}
