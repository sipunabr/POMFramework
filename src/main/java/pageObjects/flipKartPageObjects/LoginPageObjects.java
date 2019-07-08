package pageObjects.flipKartPageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.qameta.allure.Step;

public class LoginPageObjects {
	
	WebDriver driver;

	public LoginPageObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@class='_2zrpKA _1dBPDZ']")
	WebElement userNameElement;
	
	@FindBy(xpath="//input[@class='_2zrpKA _3v41xv _1dBPDZ']")
	WebElement passwordElement;
	
	@FindBy(xpath="//div[@class='_1avdGP']/button")
	WebElement loginButton;
	
	@Step("verify Slogin")
	public void login(String username, String password) {
		
		userNameElement.click();
		userNameElement.sendKeys(username);
		
		passwordElement.click();
		passwordElement.sendKeys(password);
		
		loginButton.click();
		
	} 
	
	
	
	
	
	
	

}
