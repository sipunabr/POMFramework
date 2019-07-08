package pageObjects.flipKartPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.qameta.allure.Step;

public class HomePageObjects {

	WebDriver driver;

	public HomePageObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@title='Flipkart']")
	WebElement pageTitle;


	@Step("verify page title")
	public boolean pageTitle(String pageTitleText) {

		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.visibilityOf(pageTitle));
		System.out.println(pageTitle.getText());
		
		if (pageTitle.getText().equals(pageTitleText)) {
			return true;
		}
		else 
			return false;
		

	}

}
