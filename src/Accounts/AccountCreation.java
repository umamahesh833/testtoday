package Accounts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AccountCreation {

	public static void main(String[] args) {
		
		String Fname = "QA";
		

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
		
		//Click on Create an account link
		WebElement CreateAcntLink = Driver.findElement(By.linkText("Create an Account"));
		CreateAcntLink.click();
		
		//Fill all fileds to create an account
		Driver.findElement(By.id("firstname")).sendKeys(Fname);
		Driver.findElement(By.id("lastname")).sendKeys("Automation");
		
		Driver.findElement(By.name("email")).sendKeys("QAAuto145867@gmail.com");
		Driver.findElement(By.id("password")).sendKeys("Test@12345");
		Driver.findElement(By.name("password_confirmation")).sendKeys("Test@12345");
	
		//Click on Create an account button
		WebElement CreatacntBtn = Driver.findElement(By.xpath("//button[@title='Create an Account']"));
		CreatacntBtn.click();
		
		Driver.findElement(By.linkText("My Orders")).click();
		Driver.findElement(By.xpath("(//button[@class='action switch'])[1]")).click();
		
		Driver.findElement(By.linkText("Sign Out")).click();


		
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
		
		
		
		
		
		
		
		
		
		
		
		
//		//Validate the success message
//		WebElement SuccMessage = Driver.findElement(By.xpath("//div[@role='alert']/div/div"));
//		String sText = SuccMessage.getText();
//		//System.out.println(sText);
//		if(sText.equals("Thank you for registering with Main Website Store.")) {
//			System.out.println("Account creation test case - Pass");
//		}else {
//			System.out.println("Account creation test case - Fail");
//		}
//
//		
		//Driver.close();
	
		
		
	}

}
