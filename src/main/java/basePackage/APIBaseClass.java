package basePackage;

import org.testng.annotations.BeforeSuite;

import io.restassured.RestAssured;

public class APIBaseClass {
	
	@BeforeSuite
	public void getBaseURI() {
		
		RestAssured.baseURI = "";
		
	}

}
