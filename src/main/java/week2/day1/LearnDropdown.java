package week2.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropdown {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();		
		ChromeDriver driver=new ChromeDriver();		
		driver.get("http://leaftaps.com/opentaps/control/main");		
		driver.manage().window().maximize();		
		Thread.sleep(2000);

		WebElement username = driver.findElementById("username");
		username.sendKeys("Demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("form"));				
		driver.findElementByLinkText("CRM/SFA").click();
		
		Thread.sleep(2000);
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Wipro");
		
		//step 1:locate the parent element (with select tag)
		WebElement source = driver.findElementById("createLeadForm_datasourceId");
		
		//step 2 : create object for select class and pass the parent element as argument
		Select dd = new Select(source);
		
		//new Select(driver.findElementById("createLeadForm_datasourceId")).selectByVisibleText("Conference");
		
		//step 3 : Select using VisibleText
		//dd.selectByVisibleText("Conference");
		
		//Select using index		
		//dd.selectByIndex(1);
		
		//select by using value
		//dd.selectByValue("LEAD_CONFERENCE");
		
		//to get all the options in a list
		List<WebElement> alloptions = dd.getOptions();
		
		//to get the number of items in the list
		int size = alloptions.size();
		//identify the index for the last item
		int lastindex = size-1;
		dd.selectByIndex(lastindex);
		
		WebElement mc = driver.findElementById("createLeadForm_marketingCampaignId");
		Select dd1 = new Select(mc);
		dd1.selectByVisibleText("Automobile");
		

	}

}
