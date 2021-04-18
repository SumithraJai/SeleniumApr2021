package week2.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		Select d1=new Select(driver.findElementById("dropdown1"));
		System.out.println("Select program using Index");
		d1.selectByIndex(2);
		
		Select d2=new Select(driver.findElementByXPath("//select[@name='dropdown2']"));
		System.out.println("Select program using Text");
		d2.selectByVisibleText("Selenium");
		
		Select d3=new Select(driver.findElementByXPath("//select[@name='dropdown3']"));
		System.out.println("Select program using Value");
		d3.selectByValue("3");
		
		Select d4=new Select(driver.findElementByXPath("//select[@class='dropdown']"));	
		List<WebElement> doptions = d4.getOptions();
		System.out.println("Get the number of Dropdown options"+doptions.size());
		
		Select d5=new Select(driver.findElementByXPath("(//select)[5]"));
		driver.findElementByXPath("(//select)[5]").sendKeys("Appium");
		
		
		
		// /html/body/div[2]/div[2]/div/h2
	}

}
