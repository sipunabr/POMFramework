package uiTests.flipkartTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import basePackage.UIBaseClass;
import pageObjects.flipKartPageObjects.HomePageObjects;
import pageObjects.flipKartPageObjects.LoginPageObjects;

public class FindAllMobileBrands extends UIBaseClass {

	@Test
	public void findAllMobileBrands() {
		
		LoginPageObjects loginPageObjects = new LoginPageObjects(driver);
		loginPageObjects.login("sipun.abr@gmail.com", "P@55word");
		
		HomePageObjects homepage = new HomePageObjects(driver);
		Assert.assertTrue(homepage.pageTitle("FlipKart"));
		
		
		
		
	}
	
	

}
