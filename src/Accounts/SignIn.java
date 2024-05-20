package Accounts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SignIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String EdgDriverPath = "C:\\Selenium Jan 2024\\Selenium\\BrowserDrivers\\edgedriver_win64 (3)\\msedgedriver.exe";
		//Launch the browser - Edge
		System.setProperty("webdriver.edge.driver", EdgDriverPath);
		WebDriver Driver = new EdgeDriver();
		
		//Maximize the Browser
		Driver.manage().window().maximize();
		
		//Navigate to URL
		Driver.get("https://magento.softwaretestingboard.com/");
		
		//Click on accept cookies by clicking on Concent
		WebElement ConcentBTN = Driver.findElement(By.cssSelector("button[aria-label='Consent']"));
		ConcentBTN.click();
		
		//Click on Signin LInk
		WebElement eSignIn = Driver.findElement(By.linkText("Sign In"));
		eSignIn.click();
		
		//Check forgot password link is displaying or not in the webpage
		WebElement eFrgPassword = Driver.findElement(By.xpath("//a[@class='action remind']"));
		boolean ElemDisp = eFrgPassword.isDisplayed();
		
		if(ElemDisp) {
			System.out.println("Forgot password test case - pass");
		}else {
			System.out.println("Forgot password test case - Fail");
		}
		
		

		
		
		
		

	}

}










