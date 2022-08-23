package com.Base_class;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Base_class {

	
	@FindBy(xpath="//a[@class='login']")
	public static WebElement signin;
	
	@FindBy(id="email")
	public static WebElement email;
	
	@FindBy(id="passwd")
	public  static WebElement pass;

	@FindBy(id="SubmitLogin")
	public static WebElement submit;
	
	@FindBy(xpath="//a[@title='Women']")
	public static WebElement women;
	
	@FindBy(xpath="(//img[@width='250'])[1]")
	public static WebElement image;
	
	
	
	@FindBy(xpath="//i[@class='icon-plus']")
	public static WebElement qty;	
		
	
	
	}
	
	
	
	
	
	
	
	
	
	
	     

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



