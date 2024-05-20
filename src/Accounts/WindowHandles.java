package Accounts;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		
		//String EdgDriverPath = "C:\\Selenium Jan 2024\\Selenium\\BrowserDrivers\\edgedriver_win64 (3)\\msedgedriver.exe";
		//Launch the browser - Edge
		//System.setProperty("webdriver.edge.driver", EdgDriverPath);
		//WebDriver Driver = new EdgeDriver();
		
		
		//Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jan 2024\\Selenium\\BrowserDrivers\\chromedriver-win64\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		
		//Page load time
		Driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		//Implicit wait
		Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Driver.manage().window().maximize();
		Driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String ParentWinID = Driver.getWindowHandle();

		System.out.println(ParentWinID);
		
		
		//CLick on Org inc link
		Driver.findElement(By.xpath("//div[@class='orangehrm-copyright-wrapper']/p[2]/a")).click();
		
		//Capture all window ids 
		Set<String> AllWinIds =  Driver.getWindowHandles();
		
		System.out.println("All wind ids - "+AllWinIds);
		System.out.println("FOr loop start");

		
		for(String id:AllWinIds) {
			System.out.println(id);
			Driver.switchTo().window(id);
			System.out.println(Driver.getTitle());
			
			if(Driver.getTitle().contains("Human Resources Management")) {
				Driver.findElement(By.xpath("(//button[text()='Book a Free Demo'])[2]")).click();
			}
	
		}

		Driver.quit();
		
		
		
		
		
	}

}
