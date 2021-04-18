package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		/*http://leaftaps.com/opentaps/control/main	 
		Delete Lead:
		1	Launch the browser
		2	Enter the username
		3	Enter the password
		4	Click Login
		5	Click crm/sfa link
		6	Click Leads link
		7	Click Find leads
		8	Click on Phone
		9	Enter phone number
		10	Click find leads button
		11	Capture lead ID of First Resulting lead
		12	Click First Resulting lead
		13	Click Delete
		14	Click Find leads
		15	Enter captured lead ID
		16	Click find leads button
		17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		18	Close the browser (Do not log out)*/
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("Demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByXPath("//div[@id='label']//a[1]").click();
		driver.findElementByXPath("//a[text()='Leads']").click();
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		Thread.sleep(6000);
		driver.findElementByXPath("//span[text()='Phone']").click();
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("1616");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(6000);
		driver.findElementByXPath("//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')]/a").click();
		driver.findElementByXPath("//a[text()='Delete']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		Thread.sleep(5000);
		driver.findElementByXPath("//label[text()='Lead ID:']//following-sibling::div/input").sendKeys("10509");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(4000);
		String result=driver.findElementByClassName("x-paging-info").getText();
		 if(result.equals("No records to display")) {
			 System.out.println("It Confirms the Successful Deletion");
		 }
		 
		 driver.close();
		 driver.quit();
	}

}
