package Accounts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws Exception {
		
		
		String EdgDriverPath = "C:\\Selenium Jan 2024\\Selenium\\BrowserDrivers\\edgedriver_win64 (3)\\msedgedriver.exe";
		//Launch the browser - Edge
		System.setProperty("webdriver.edge.driver", EdgDriverPath);
		WebDriver Driver = new EdgeDriver();
		//add page pageload time
		Driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
		//Add implicit wait of 20 secs
		Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Maximize the Browser
		Driver.manage().window().maximize();
		
		
		//Navigate to URL
		Driver.get("https://magento.softwaretestingboard.com/");
		
		//Click on accept cookies by clicking on Concent
		WebElement ConcentBTN = Driver.findElement(By.cssSelector("button[aria-label='Consent']"));
		ConcentBTN.click();
		
		
		Thread.sleep(5000);
		
		
		
		
		
		//Click on Signin LInk
		WebElement eSignIn = Driver.findElement(By.linkText("Sign In"));

		//Explicit wait for Signin
		//WebDriverWait ObjExpWait = new WebDriverWait(Driver, 120);
		//ObjExpWait.until(ExpectedConditions.visibilityOf(eSignIn));
		
		
		//Fluent wait for signin
		FluentWait Flwait = new FluentWait(Driver);
		Flwait.withTimeout(120, TimeUnit.SECONDS);
		Flwait.pollingEvery(10, TimeUnit.SECONDS);
		
		Flwait.until(ExpectedConditions.visibilityOf(eSignIn));
		
		
		eSignIn.click();
		
		
		
		
		
		
	

	}

}
