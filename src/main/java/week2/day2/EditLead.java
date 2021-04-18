package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		/*http://leaftaps.com/opentaps/control/main	
		* 1	Launch the browser
		* 2	Enter the username
		* 3	Enter the password
		* 4	Click Login
		* 5	Click crm/sfa link
		* 6	Click Leads link
		* 7	Click Find leads
		* 8	Enter first name
		* 9	Click Find leads button
		* 10 Click on first resulting lead
		* 11 Verify title of the page
		* 12 Click Edit
		* 13 Change the company name
		* 14 Click Update
		* 15 Confirm the changed name appears
		* 16 Close the browser (Do not log out)*/
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
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Jeeva");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("(//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')])[1]/a").click();
		Thread.sleep(2000);
		String s=driver.getTitle();
		if(s.contains("View Lead")) {
			System.out.println("Title of the page is verified: "+s);
		}
		driver.findElementByXPath("//a[text()='Edit']").click();
		Thread.sleep(1000);
		String newCompany = "Axis";
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys(newCompany);
		driver.findElementByXPath("//input[@value='Update']").click();
		String companyname = driver.findElementById("viewLead_companyName_sp").getText();
		if(companyname.contains(newCompany)) {
			System.out.println("Confirming that new company name appearing: "+companyname);
		}
		driver.close();
		driver.quit();

	}

}
