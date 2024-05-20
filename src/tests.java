import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class tests {

	public static void main(String[] args) {
	
		//Launch Edge browser
		//System.setProperty("webdriver.edge.driver", "C:\\Selenium Jan 2024\\Selenium\\BrowserDrivers\\edgedriver_win64 (3)\\msedgedriver.exe");
		//WebDriver Driver = new EdgeDriver();
		
		//Add chromedriver path to system var
		//Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jan 2024\\Selenium\\BrowserDrivers\\chromedriver-win64\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		
		
		//Maximize the browser
		Driver.manage().window().maximize();
		
		//Navigate to URL
		Driver.navigate().to("https://magento.softwaretestingboard.com/");

		//CLick concent
		Driver.findElement(By.xpath("//p[text()='Consent']")).click();
		
		
		
		
		
		
		
		
		//Capture the title of the page
		String HomePagetitle = Driver.getTitle();
		System.out.println("Title of the page is -"+HomePagetitle);
		
		if(HomePagetitle.equals("Home Page")) {
			System.out.println("Home page test case - pass");
		}else {
			System.out.println("Home page test case - Fail");
		}
		
		
		String CurrURL = Driver.getCurrentUrl();
		System.out.println(CurrURL);

		//Enter text Automation in search field
		WebElement Sfield = Driver.findElement(By.tagName("input"));
		Sfield.sendKeys("Mounika");
		
		
		
		//CLick on sign-in
		//WebElement SignIn = Driver.findElement(By.xpath("/html/body/div[2]/header/div/div/ul/li[2]/a"));
		//SignIn.click();
		
		
		//Click on shop new yoga button
		//WebElement SNYButton = Driver.findElement(By.xpath("//span[@class='action more button']"));
		//SNYButton.click();
		
		
		
		
		
		
		//Test Case 1.2 - Create an Account title
		WebElement CreateAccount = Driver.findElement(By.linkText("Create an Account"));
		CreateAccount.click();
		
		
		WebElement  FirstNameField = Driver.findElement(By.cssSelector("input#firstname"));
		FirstNameField.sendKeys("Selenium");
		
		
		WebElement  EmailField = Driver.findElement(By.cssSelector("input[title='Email']"));
		
		
		
		
		
		EmailField.sendKeys("Automation@gmail.com");
		
		
		
		
		
		
//
//		//Capture the title now
//		String CRPagetitle = Driver.getTitle();
//		if(CRPagetitle.equals("Create New Customer Account")) {
//			System.out.println("Create an Account title test case - pass");
//		}else {
//			System.out.println("Create an Account title test case - Fail");
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		 Driver.findElement(By.xpath("//*[@id='email_address']")).sendKeys("Mahesh");
		 
		 
		 
			
			//Identifying element
			WebElement EmailID = Driver.findElement(By.xpath("//*[@id='email_address']"));
			
			//Operation - entering mahesh in that field
			EmailID.sendKeys("Mahesh");
		
		
		
		
		
		
		
		
		
		
		

	}

}
