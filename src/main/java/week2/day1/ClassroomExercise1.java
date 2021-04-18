package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassroomExercise1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub		
		//1. Set up the chromedriver
		WebDriverManager.chromedriver().setup();		
		//2. Open the Chrome Browser
		ChromeDriver driver=new ChromeDriver();		
		//3. Load the application url
		driver.get("http://leaftaps.com/opentaps/control/main");		
		//4. Maximize the browser
		driver.manage().window().maximize();		
		Thread.sleep(2000);
		//driver.manage().window().minimize(); 
		//shortcut to save in a variable ctrl+2,L (WD username)
		WebElement username = driver.findElementById("username");
		username.sendKeys("Demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("form"));				
		driver.findElementByLinkText("CRM/SFA").click();
		
		//driver.findElementByName("USERNAME").sendKeys("Demosalesmanager");
		//driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		//driver.findElementByClassName("loginButton").click();
		
		Thread.sleep(2000);
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		
		
		
		driver.findElementById("createLeadForm_companyName").sendKeys("Wipro");
		driver.findElementById("createLeadForm_firstName").sendKeys("Jai");
		driver.findElementById("createLeadForm_lastName").sendKeys("Ganesh");		
		driver.findElementByClassName("smallSubmit").click();
		driver.findElementById("sectionHeaderTitle_leads");
		Thread.sleep(2000);
		//5. Close the browser
		driver.close();		
		driver.quit();


	}

}
