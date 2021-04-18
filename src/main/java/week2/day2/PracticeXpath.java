package week2.day2;

public class PracticeXpath {

	public static void main(String[] args) {
		/*No need to write Selenium script - Just find these elements in the DOM using only XPaths
		Try all the xpaths that you've learnt (basic, text-based, axes..)
		1. Launch the URL
		
		2. Enter the username based on its label - //label[@for='username']/following-sibling::input
		
		3. Enter the password based on its label - //label[@for='password']/following-sibling::input
		
		4. Click Login - //input[@class='decorativeSubmit']
		
		5. Click on CRMSFA link - //a[contains(text(),'CRM')]
		
		6. Click on Leads link - //a[contains(text(),'Leads')]
		
		7. Click on Merge Leads link - //a[contains(text(),'Merge Leads')]
		
		8. Click the first img icon - (//img[@alt='Lookup'])[1]
		
		9. Select the first resulting lead - (//td[contains(@class,'x-grid3-col x-grid3-cell')]//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')])[1]
		
		10. Click the second img icon - (//img[@alt='Lookup'])[2]
		
		11. Select the second resulting lead - (//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]
		
		12. Click on Merge Lead (submit) button - //a[@class='buttonDangerous']
		
		13. Get the company name text based on its label - (//label[text()='Company Name:'])[2]/following::input[@name='companyName']
		
		*/


	}

}
