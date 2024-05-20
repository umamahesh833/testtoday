package Accounts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws Exception {
		
		
		
	//Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jan 2024\\Selenium\\BrowserDrivers\\chromedriver-win64\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		
		//Maximize the Browser
		Driver.manage().window().maximize();
		
		//Navigate to URL
		Driver.get("http://primusbank.qedgetech.com/");
		
		//Login to the application
		Driver.findElement(By.id("txtuId")).sendKeys("xyzabs");
		Driver.findElement(By.id("txtPword")).sendKeys("test123");
		

		
		Driver.findElement(By.id("login")).click();
		
		
		//Capture the text on the alert
		String Alttext = Driver.switchTo().alert().getText();
		System.out.println(Alttext);
		
		//CLick okay on the alert
		Driver.switchTo().alert().accept();
		
		//To click on cancel on the alert
		Driver.switchTo().alert().dismiss();
		
		//Enter some value on the alert
		Driver.switchTo().alert().sendKeys("mahesh");
		
		
		


	}

}
