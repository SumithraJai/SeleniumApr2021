package week1.assignments;

public class SumOfDigitsFromString {
	
	/*
	 * Method 1
	 * Pseudo Code
	 
	 * Declare a String text with the following value
		String text = "Tes12Le79af65";
	   Declare a int variable sum
		int sum = 0;
	 * a) using replaceAll(), replace all the non-digits into ""
	 * b) Now, convert the String into array
	 * c) Iterate over the array and get each character
	 * d) Using Character.getNumericValue(), Change the char into int
	 * e) Add the values to sum & print
	 * 
	 */
	
	/*
	 * Method 2
	 * Pseudo Code
	 * Declare a String text with the following value
		String text = "Tes12Le79af65";
	   Declare a int variable sum
		int sum = 0;
	 * a) Iterate an  array over the String
	 * b) Get each character and check if it is a number using Character.isDigit()
	 * c) Now covert char to int using Character.getNumericValue() and add it to sum
	 * d) Now Print the value
	 */
	
	public int method1(String text) {
		text = text.replaceAll("\\D+", ""); //to remove Non-Digits
		//System.out.println(text);
		 int n=0;  int sum = 0;
		char[] ch = text.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			n = Character.getNumericValue(ch[i]);
				//System.out.print(n);
				sum = sum + n;
			
		}
		if(sum > 0) {
			System.out.println(sum);
		}
		return sum;
	}
	public void method2(String text) {
		 int sum = 0;
		char[] ch = text.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(Character.isDigit(ch[i])) {
				sum = sum + Character.getNumericValue(ch[i]);
			}
		}
		if(sum > 0) {
			System.out.println(sum);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "Tes12Le79af65";
		SumOfDigitsFromString sd = new SumOfDigitsFromString();
		sd.method1(text);
		sd.method2(text);
	
		
		
	}

}
