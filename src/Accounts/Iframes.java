package Accounts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jan 2024\\Selenium\\BrowserDrivers\\chromedriver-win64\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		
		Driver.manage().window().maximize();
		Driver.get("https://www.leafground.com/frame.xhtml;jsessionid=node010nx464jtc8vzxsmrg4fp0yu9138.node0");
		
		//Switch the focus from main frame to another frame
		
		
		//Switching from using index
		Driver.switchTo().frame(0);
		
		//Switch using ID or class Name
		Driver.switchTo().frame("First");
		
		
		//Switch the focus as webelemnt
		WebElement FirstFrame = Driver.findElement(By.xpath("//*[@id='j_idt88']/div/div[1]/div[1]/iframe"));
		Driver.switchTo().frame(FirstFrame);
		
		
		Driver.findElement(By.cssSelector("#Click")).click();
		
		
		//Selenium focus will be back to default frame
		Driver.switchTo().defaultContent();
		
		

	}

}
