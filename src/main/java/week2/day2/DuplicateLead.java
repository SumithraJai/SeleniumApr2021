package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		/*http://leaftaps.com/opentaps/control/main	 
		1	Launch the browser
		2	Enter the username
		3	Enter the password
		4	Click Login
		5	Click crm/sfa link
		6	Click Leads link
		7	Click Find leads
		8	Click on Email 10513 10514
		9	Enter Email
		10	Click find leads button
		11	Capture name of First Resulting lead
		12	Click First Resulting lead
		13	Click Duplicate Lead
		14	Verify the title as 'Duplicate Lead'
		15	Click Create Lead
		16	Confirm the duplicated lead name is same as captured name
		17	Close the browser (Do not log out)
		*/
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
		driver.findElementByXPath("//span[text()='Email']").click();
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("jeeva@gmail.com");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		String str=driver.findElementByXPath("(//div[contains(@class,'x-grid3-cell-inner x-grid3-col-firstName')])[1]/a").getText();
		driver.findElementByXPath("(//div[contains(@class,'x-grid3-cell-inner x-grid3-col-firstName')])[1]/a").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
		String title=driver.getTitle();
		if(title.contains("Duplicate Lead")) {
			System.out.println("Title name - Duplicate Lead is verified");
		}
		//String str2=driver.findElementByXPath("//input[@name='firstName'and@id='createLeadForm_firstName']").getText();
		driver.findElementByXPath("//input[@value='Create Lead']").click();
		Thread.sleep(2000);
		String str1=driver.findElementById("viewLead_firstName_sp").getText();
		if(str.equals(str1))
		{
			System.out.println("Confirming that Duplicate name is same as the Captured name: "+str);
		}
		driver.close();
		driver.quit();

	}

}
