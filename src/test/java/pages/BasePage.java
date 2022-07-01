package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import core.DriverFactory;

public class BasePage {
	
	 private WebDriver driver = DriverFactory.getDriver();
	
	 
	 /**
	  * realizará a ação de navegação para a url 
	  * @param url
	  */
	 
	public void navigate (String url) {
		driver.navigate().to(url);
	}
	
	public void click(By locator) {
		driver.findElement(locator).click();
	}
	
	public void sendKeys(By locator, String text) {
		driver.findElement(locator).sendKeys(text);
	}
	
	
}
