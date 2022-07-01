package core;

import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {
	
	 private static WebDriver driver;	 
	 
	 private static ChromeOptions createChromeOptions() {
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--disable-notifications");
		 options.addArguments("--disable-inforbars");
		 options.addArguments("--start-maximized");
		 options.addArguments("--window-size=1920,1080");
		 
		 HashMap<String, Object> chromePrefs = new HashMap<>();		     
		 chromePrefs.put("profile.default_content_settings.popus", 0);
		 chromePrefs.put("plugins_always_open_pdf_externally", false);		 
		 chromePrefs.put("credentials_enable_service", false);
		 chromePrefs.put("profile.password_manager_enabled", false);
		 chromePrefs.put("profile.exit_type", "normal");
		    
		 options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		 options.setExperimentalOption("prefs", chromePrefs);		 
		 return options;  		 
		 
	 }	
	 
	 public static void setWebDriverProperty() {
		 String webDriverProperty = "webdriver.chrome.driver";
		 String webDriverFileName = "chromedriver_102";
		 String driverPath = System.getProperty("user.dir") + File.separator + "drivers" + File.separator;
		 System.setProperty(webDriverProperty, driverPath + webDriverFileName + ".exe");
	 }
			
	
	public static WebDriver getDriver() {
		if (driver == null || driver.toString().toLowerCase().contains("null")) {
			setWebDriverProperty();
			driver = new ChromeDriver(createChromeOptions());
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
		return driver;		
	}
	
	public static void killDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}

}
