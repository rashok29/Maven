package My_projects;

import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Automation_practice {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver", 
			System.getProperty("user.dir")+"\\driver\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.get("http://automationpractice.com/index.php");
	driver.manage().window().maximize();//screen maximize
	org.openqa.selenium.Point p=new org.openqa.selenium.Point(180, 180);
	driver.manage().window().setPosition(p);
	Thread.sleep(1000);
	driver.manage().window().maximize();
	Thread.sleep(5000);
	WebElement signin=driver.findElement(By.xpath("//a[@rel='nofollow']"));
	 signin.click();
	 WebElement email=driver.findElement(By.name("email_create"));
	 email.sendKeys("demo112903211111@gmail.com");
	 WebElement create=driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span"));
	 create.click();
	 Thread.sleep(3000);
	 WebElement gender=driver.findElement(By.name("id_gender"));
	 gender.click();
	 WebElement firstname=driver.findElement(By.id("customer_firstname"));
	 firstname.sendKeys("Ashok");
	 WebElement lastname=driver.findElement(By.id("customer_lastname"));
	 lastname.sendKeys("kumar");
	 WebElement pass=driver.findElement(By.id("passwd"));
	 pass.sendKeys("123456");
	 WebElement day=driver.findElement(By.id("days"));
	 Select s=new Select(day);
	 s.selectByValue("29");
	 WebElement month=driver.findElement(By.id("months"));
	 Select s1=new Select(month);
	 s1.selectByValue("5");
	 WebElement year=driver.findElement(By.id("years"));
	 Select s2=new Select(year);
	 s2.selectByValue("1996");
	   driver.findElement(By.name("address1")).sendKeys("20,vinayagar kovil street");
	   driver.findElement(By.name("city")).sendKeys("chennai");
	   WebElement state = driver.findElement(By.name("id_state"));
	   Select s3=new Select(state);
	   s3.selectByValue("32");
	   driver.findElement(By.id("postcode")).sendKeys("10001");
	   driver.findElement(By.id("phone_mobile")).sendKeys("8004579456");
	   driver.findElement(By.name("alias")).sendKeys("20 st thomas newyork");
	   driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span")).click();
	   driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")).click();
	   driver.findElement(By.id("email")).sendKeys("demo112903211111@gmail.com");
	   driver.findElement(By.id("passwd")).sendKeys("123456");
	WebElement sign_in=driver.findElement(By.xpath("//a[@rel='nofollow']"));
	sign_in.click();
	driver.findElement(By.id("email")).sendKeys("demo112903211111@gmail.com");
	   driver.findElement(By.id("passwd")).sendKeys("123456");
	driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();  
	WebElement Dresses = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
	Actions action=new Actions(driver);
	action.moveToElement(Dresses).build().perform();
	driver.findElement(By.xpath("(//a[@title='Evening Dresses'])[2]")).click();;
	JavascriptExecutor js=(JavascriptExecutor) driver;
	Thread.sleep(3000);
	js.executeScript("window.scrollBy(0,650);");
	Thread.sleep(5000);
	WebElement photo=driver.findElement(By.xpath("//img[@title='Printed Dress']"));
	action.moveToElement(photo).perform();
	WebElement quick_view = driver.findElement(By.xpath("//a[@class='quick-view']"));
	action.moveToElement(quick_view).build().perform();
	action.click().perform();
	Thread.sleep(5000);
	WebElement frame=driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
	driver.switchTo().frame(frame);
	for(int i=1;i<5;i++) {
		driver.findElement(By.xpath("//i[@class='icon-plus']")).click();
	}
	Thread.sleep(5000);
	Select size=new Select(driver.findElement(By.name("group_1")));
	size.selectByValue("3");
	driver.findElement(By.id("color_24")).click();
	driver.findElement(By.xpath("//button[@name='Submit']")).click();
	Thread.sleep(3000);
	driver.switchTo().parentFrame();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[contains(text(),'Proceed to checkout')]")).click();
	js.executeScript("window.scrollBy(0,800);");
	driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")).click();
	js.executeScript("window.scrollBy(0,800);");
	driver.findElement(By.name("message")).sendKeys("Mini project");
	driver.findElement(By.name("processAddress")).click();
	js.executeScript("window.scrollBy(0,500);");
	driver.findElement(By.name("cgv")).click();
	driver.findElement(By.name("processCarrier")).click();
	js.executeScript("window.scrollBy(0,500);");
	driver.findElement(By.xpath("//a[@class='cheque']")).click();
	js.executeScript("window.scrollBy(0,500);");
	driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	WebElement confirm=driver.findElement(By.xpath("//h1[@class='page-heading']"));
	js.executeScript("window.scrollBy(0,400);");
	Thread.sleep(3000);
	driver.close();	

}
}
