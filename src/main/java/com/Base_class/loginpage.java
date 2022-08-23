package com.Base_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
public static WebDriver driver;
	@FindBy(id="email")
private WebElement email;

@FindBy(id="passwd")
private WebElement pass;

@FindBy(xpath="//*[@id=\\\"SubmitLogin\\\"]/span")
private WebElement submit;

public loginpage(WebDriver lp) {
this.driver=lp;
PageFactory.initElements(driver, this);
}

public WebElement getEmail() {
	return email;
}

public WebElement getPass() {
	return pass;
}

public WebElement getSubmit() {
	return submit;
}




}
