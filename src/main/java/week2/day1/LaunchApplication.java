package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Step1: Setup the driver
		WebDriverManager.chromedriver().setup();
		
		//step2: open the chrome browser - create object for ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		
		//step3: Load the application URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//step4: To maximize the window
		driver.manage().window().maximize();
		
		//step5: To close the browser
		driver.close();
	}

}
