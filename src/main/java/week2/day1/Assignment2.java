package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		/*Assignment 2:
			===========
			1. Load url "https://acme-test.uipath.com/login"
			2. Enter email as "kumar.testleaf@gmail.com"
			3. Enter Password as "leaf@12"
			4. Click login button
			5. Get the title of the page and print
			6. Click on Log Out
			7. Close the browser*/
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().window().maximize();
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
		driver.findElementById("password").sendKeys("leaf@12");
		driver.findElementByXPath("//*[contains(@type,'submit')]").click();;
		Thread.sleep(2000);
		
		System.out.println("Title of the page: "+driver.getTitle());
		driver.findElementByLinkText("Log Out").click();
		driver.close();
				

	}

}
