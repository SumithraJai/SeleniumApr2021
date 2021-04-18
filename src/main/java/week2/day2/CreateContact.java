package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) throws InterruptedException {
		/*Pseudo Code
		 * 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		 * 2. Enter UserName and Password Using Id Locator
		 * 3. Click on Login Button using Class Locator
		 * 4. Click on CRM/SFA Link
		 * 5. Click on contacts Button
		 * 6. Click on Create Contact
		 * 7. Enter FirstName Field Using id Locator
		 * 8. Enter LastName Field Using id Locator
		 * 9. Enter FirstName(Local) Field Using id Locator
		 * 10. Enter LastName(Local) Field Using id Locator
		 * 11. Enter Department Field Using any Locator of Your Choice
		 * 12. Enter Description Field Using any Locator of your choice 
		 * 13. Enter your email in the E-mail address Field using the locator of your choice
		 * 14. Select State/Province as NewYork Using Visible Text
		 * 15. Click on Create Contact
		 * 16. Click on edit button 
		 * 17. Clear the Description Field using .clear
		 * 18. Fill ImportantNote Field with Any text
		 * 19. Click on update button using Xpath locator
		 * 20. Get the Title of Resulting Page. */
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("Demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByXPath("//div[@id='label']//a[1]").click();
		driver.findElementByXPath("//a[text()='Contacts']").click();
		driver.findElementByXPath("//a[text()='Create Contact']").click();
		Thread.sleep(2000);
		driver.findElementById("firstNameField").sendKeys("Shanvi");
		driver.findElementById("lastNameField").sendKeys("J");
		driver.findElementById("createContactForm_firstNameLocal").sendKeys("shannu");
		driver.findElementById("createContactForm_lastNameLocal").sendKeys("j");
		driver.findElementById("createContactForm_departmentName").sendKeys("Automation");
		driver.findElementById("createContactForm_description").sendKeys("abc");
		driver.findElementById("createContactForm_primaryEmail").sendKeys("abc@gmail.com");
		Select d=new Select(driver.findElementById("createContactForm_generalStateProvinceGeoId"));
		d.selectByVisibleText("New York");
		driver.findElementByClassName("smallSubmit").click();
		Thread.sleep(2000);
		//driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Sumithra");
	//	driver.findElementByXPath("//button[text()='Find Contacts']").click();
		//Thread.sleep(3000);
		//driver.findElementByXPath("//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')]/a").click();
		//Thread.sleep(2000);
		driver.findElementByXPath("//a[@class='subMenuButton'and text()='Edit']").click();
		driver.findElementById("updateContactForm_description").clear();
		driver.findElementById("updateContactForm_importantNote").sendKeys("Learning Appium");
		driver.findElementByXPath("//input[@value='Update']").click();
		Thread.sleep(1000);
		System.out.println("Title of the page: "+driver.getTitle());		
		driver.close();
		driver.quit();
	}

}
