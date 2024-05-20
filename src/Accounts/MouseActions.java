package Accounts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MouseActions {

	public static void main(String[] args) throws Exception {

		
		//Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jan 2024\\Selenium\\BrowserDrivers\\chromedriver-win64\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		
		//add page pageload time
		Driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		//Add implicit wait of 20 secs
		Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Maximize the Browser
		Driver.manage().window().maximize();
		
		//Navigate to URL
		Driver.get("https://magento.softwaretestingboard.com/");
		
		//Click on accept cookies by clicking on Concent
		WebElement ConcentBTN = Driver.findElement(By.cssSelector("button[aria-label='Consent']"));
		ConcentBTN.click();
		
		
		Actions ObjAct = new Actions(Driver);
		//Mouse hover on Men element
		WebElement eWomen = Driver.findElement(By.cssSelector("#ui-id-4"));
		
		ObjAct.moveToElement(eWomen).build().perform();
		
		//Click tops and jackets
		Driver.findElement(By.linkText("Tops")).click();
		//Driver.findElement(By.linkText("Jackets")).click();
		
		
		//Select an item from Drop down
		WebElement eSortBy = Driver.findElement(By.id("sorter"));

		Select ObjSel = new Select(eSortBy);
		
		ObjSel.selectByVisibleText("Price");
		
		
		Driver.switchTo().alert().accept();

		

	}

}
