package com.Base_class;

import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AP_Base_class {
	public static WebDriver driver;
	public static String Value;
	//1
		public static WebDriver getBrowser(String type) {
			if (type.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (type.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
				driver = new FirefoxDriver();
							}
			else if (type.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver",System.getProperty("C:\\Users\\Ashok Ranjani\\eclipse-workspace\\Selenium\\Driver\\driver2\\msedgedriver.exe"));
				driver=new EdgeDriver();
			}
			driver.manage().window().maximize();
			return driver;
		}

	//2		
		public static WebDriver close() {
			driver.close();
			return driver;
		}

	//3	
		public static WebDriver quit() {
			driver.quit();
			return driver;
		}

	//4
		public static WebDriver navigateto(String url) {
			driver.navigate().to(url);
			return driver;
		}

	//5
		public static WebDriver navigateback() {
			driver.navigate().back();
			return driver;
		}

	//6
		public static WebDriver navigateforward() {
			driver.navigate().forward();
			return driver;
		}

	//7
		public static WebDriver navigaterefresh() {
			driver.navigate().refresh();
			return driver;
		}

	//8
		public static WebDriver getUrl(String url) {
			driver.get(url);
			return driver;
		}

	//9
		public static void alert(String type, String value) {
			Alert a = driver.switchTo().alert();
			if (type.equalsIgnoreCase("Ok")) {
				a.accept();
			} else if (type.equalsIgnoreCase("cancel")) {
				a.dismiss();
			} else {
				a.sendKeys(value);
				a.accept();
			}
		}

	//10
		public static void actions(WebElement element, WebElement element1, String type) {
			Actions mouse = new Actions(driver);
			if (type.equalsIgnoreCase("click")) {
				mouse.click(element).build().perform();
			} else if (type.equalsIgnoreCase("Right click")) {
				mouse.contextClick(element).build().perform();
			} else if (type.equalsIgnoreCase("Double click")) {
				mouse.doubleClick(element).build().perform();
			} else if (type.equalsIgnoreCase("Drag and Drop")) {
				mouse.dragAndDrop(element, element1).build().perform();
			} else if (type.equalsIgnoreCase("click and hold")) {
				mouse.clickAndHold(element).build().perform();
			} else if (type.equalsIgnoreCase("release")) {
				mouse.release(element).build().perform();
			}
		}

		// 11
		public static void Frame(String type, String value, WebElement element) {
			if (type.equalsIgnoreCase("index")) {
				int index = Integer.parseInt(value);
				driver.switchTo().frame(index);
			} else if (type.equalsIgnoreCase("default")) {
				driver.switchTo().defaultContent();
			} else if (type.equalsIgnoreCase("element")) {
				driver.switchTo().frame(element);
			}
		}

		// 12

		// 13
		public static void robot(int type) throws Throwable {
			Robot key = new Robot();
			key.keyPress(type);
			key.keyRelease(type);
		}

	//14
		public static void dropdown(WebElement element, String type, String value) {
			Select droplist = new Select(element);
			if (type.equalsIgnoreCase("SelectByValue")) {
				droplist.selectByValue(value);
			} else if (type.equalsIgnoreCase("Selectbyvisibletext")) {
				droplist.selectByVisibleText(value);
			} else if (type.equalsIgnoreCase("selectbyindex")) {
				int data = Integer.parseInt(value);
				droplist.selectByIndex(data);
			}
		}

	//15
		public static void checkbox(String type, WebElement element) {
			if (type.equalsIgnoreCase("selectcheckbox")) {
				element.click();
			} else if (type.equalsIgnoreCase("ischeckboxselected")) {
				boolean selected = element.isSelected();
				System.out.println(selected);
			} else if (type.equalsIgnoreCase("deselectonlychecked")) {
				boolean deselect = element.isSelected();
				System.out.println(deselect);
			} else if (type.equalsIgnoreCase("selectallcheckbox")) {
				element.click();
			}
		}

	//16
		public static void enable(WebElement element) {
			boolean enable = element.isEnabled();
			System.out.println("Enabled element is " + enable);
		}

	//17
		public static void display(WebElement element) {
			boolean display = element.isDisplayed();
			System.out.println("displying element " + display);
		}

	//18
		public static void select(WebElement element, boolean select) {
			select = element.isSelected();
			System.out.println("selected element is " + select);
		}

	//19
		public static void getoption(WebElement element, String variables) {
			Select get = new Select(element);
			List<WebElement> elements = get.getOptions();
			for (WebElement data : elements) {
				variables = data.getText();
				System.out.println(variables);
			}
		}

	//20
		public static WebDriver getTitle(String title) {
			driver.getTitle();
			return driver;
		}

	//21
		public static WebDriver getCurrentUrl(String Currenturl) {
			driver.getCurrentUrl();
			return driver;
		}

	//22
		public static void getText(WebElement element, String text) {
			text = element.getText();
			System.out.println(text);
		}

	//23
		public static void getAttribute(WebElement element, String attributename) {
			element.getAttribute(attributename);
		}

	//24
		public static void wait(String type, WebElement element) {
			if (type.equalsIgnoreCase("implicitlywait")) {
				driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
			} else if (type.equalsIgnoreCase("Explicitlywait")) {
				WebDriverWait waiting = new WebDriverWait(driver, 30);
				waiting.until(ExpectedConditions.visibilityOf(element));
			}
		}

	//25
		public static void getScreenshotAs(String name) throws Throwable {
			TakesScreenshot ss = (TakesScreenshot) driver;
			File source = ss.getScreenshotAs(OutputType.FILE);
			File destiny = new File("C:\\Users\\admin\\eclipse-workspace\\MavenProj\\Screenshot//" + name + ".png");
			FileUtils.copyFile(source, destiny);
		}

	//26
		public static void scroll(String type, String x, String y) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			if (type.equalsIgnoreCase("scrolldown")) {
				int parseint1 = Integer.parseInt(x);
				int parseint2 = Integer.parseInt(y);
				js.executeScript("window.scrollBy(" + parseint1 + "," + parseint2 + ");");
			} else if (type.equalsIgnoreCase("scrollup")) {
				int parseint1 = Integer.parseInt(x);
				int parseint2 = Integer.parseInt(y);
				js.executeScript("window.scrollBy(" + parseint1 + "," + parseint2 + ");");
			} else if (type.equalsIgnoreCase("bottom")) {
				js.executeScript("window.scroll(0,document.body.scrollHeight)", "");
			} else if (type.equalsIgnoreCase("top")) {
				js.executeScript("window.scroll(0,0)", "");
			}
		}

	//27
		public static void inputValueElement(WebElement element,String value) {
			element.sendKeys(value);
		}

	//28
		public static void getFirstSelectedOptions(WebElement element, WebElement firstoption, String variable) {
			Select option = new Select(element);
			firstoption = option.getFirstSelectedOption();
			variable = firstoption.getText();
			System.out.println(variable);
		}

	//29
		public static void getAllSelectedOptions(WebElement element, String allselected) {
			Select all = new Select(element);
			List<WebElement> allopt = all.getAllSelectedOptions();
			for (WebElement selected : allopt) {
				allselected = selected.getText();
				System.out.println(allselected);
			}
		}

	//30
		public static void isMultiple(WebElement element, boolean multiple) {
			Select m = new Select(element);
			multiple = m.isMultiple();
			System.out.println(multiple);
		}

	//31
		public static void clickOnElement(WebElement element) {
			element.click();
		}

	//32
		public static void radioButton(String type, WebElement element) {
			if (type.equalsIgnoreCase("selectradiobutton")) {
				element.click();
			} else if (type.equalsIgnoreCase("finddefaultradiobutton")) {
				boolean preselect = element.isSelected();
				System.out.println(preselect);
			}
		}
		
		
		private String read_data(String path, int RowIndex,int columIndex) throws IOException {
			File f =new File(path);
			FileInputStream fis=new FileInputStream(f);
			Workbook wb=new XSSFWorkbook(fis);
			Sheet sheetAt = wb.getSheetAt(1);
			Row row = sheetAt.getRow(RowIndex);
			Cell cell = row.getCell(columIndex);
			CellType cellType = cell.getCellType();
			if (cellType.equals(cellType.STRING)) {
				Value = cell.getStringCellValue();
				System.out.println(Value);

			}else if (cellType.equals(CellType.NUMERIC)) {
				double numericCellValue = cell.getNumericCellValue();
				int data=(int) numericCellValue;
				Value = String.valueOf(data);
				System.out.println(data);
				
			}wb.close();
			return Value;
		}
		
		}

	



