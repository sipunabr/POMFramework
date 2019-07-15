package basePackage;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class UIBaseClass {
	
	Log logger = LogFactory.getLog(UIBaseClass.class);
	
	public WebDriver driver ;
	
	@BeforeClass
	@Parameters("browser")
	public void openBrowser(String browserName) {
		
	if(browserName.equalsIgnoreCase("Firefox")) {	
			driver = new FirefoxDriver();
		
			
		}else if (browserName.equalsIgnoreCase("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "resources\\drivers\\chromedriver.exe");
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			LoggingPreferences logPref = new LoggingPreferences();
			logPref.enable(LogType.BROWSER, Level.ALL);
			capabilities.setCapability(CapabilityType.LOGGING_PREFS, logPref);
			driver = new ChromeDriver(capabilities);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get("https://www.flipkart.com/");
		}
	}
	
	@AfterClass
	public void closeBrowser() {
		if (driver!=null) {
			driver.close();
			
		}
	}
	

}
