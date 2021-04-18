package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();	
		driver.get("http://leaftaps.com/opentaps/control/main");	
		driver.manage().window().maximize();		
		Thread.sleep(2000);
		driver.findElementByXPath("//input[@id='username']").sendKeys("Demosalesmanager");
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@value='Login']").click();
		
		Thread.sleep(2000);
		driver.findElementByXPath("//a[contains(text(),'CRM')]").click();
		
		Thread.sleep(2000);
		
		driver.findElementByXPath("//a[contains(text(),'Leads')]").click();
		driver.findElementByXPath("//a[contains(text(),'Create Lead')]").click();
		driver.findElementByXPath("//input[@id='createLeadForm_companyName']").sendKeys("HCL");
		driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys("Jai");
		driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys("Ganesh");
		driver.findElementByXPath("//input[@class='smallSubmit']").click();
		
		Thread.sleep(2000);
		driver.findElementById("sectionHeaderTitle_leads");

		
		//5. Close the browser
		driver.close();		
		driver.quit();

	}

}
