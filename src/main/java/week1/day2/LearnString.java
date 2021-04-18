package week1.day2;

public class LearnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String is class -Non primitive data type 
		
		//declare using literal string
		String str ="Welcome"; //"" value will be stored in string constant pool
		
		String str1 = "Welcome"; // it points to the same memory where str stored. use memory effectively
				
		//declare string using new keyword
		String str2=new String("Welcome"); //It uses the heap memory to store the value
		
		//to compare address
		System.out.println(str == str1); //It prints true since both are literal strings pointing to same memory where "Welcome" is stored
		System.out.println(str == str2); //It prints false since both memories are not same.
		
		//method to compare two string
		System.out.println(str.equals(str1)); // It prints true since values are equal
		System.out.println(str.equals(str2));// It prints true since values are equal
		
		String s = "Welcome";
		String s1 = "welcome";
		
		System.out.println(s == s1); //false since case sensitive values stores in different memories
		
		System.out.println(s.equals(s1)); //press F3 to see the equals method it returns boolean
		
		System.out.println(s.equalsIgnoreCase(s1));
		
		//String is a sequence of characters
		
		String sr="Welcome"; //each character has index and starts with 0
		
		//method to find the no of charaters
		//System.out.println(sr.length());
		
		//to find the last char index
		//System.out.println(sr.length()-1);
		
		//method to get single char from string
		//System.out.println(sr.charAt(3));
		
		String revStr = "";
		for (int i = sr.length()-1; i >= 0; i--) {
			
			revStr = revStr+ sr.charAt(i);
			
		}
		if(sr.equals(revStr)) {
			System.out.println("Given string is a palindrome: "+revStr);
		}
		else {
			System.out.println("Given string is not a palindrome: "+revStr);
		}
		
		//to convert the string to char array
		char[] ch=sr.toCharArray();
		System.out.println(ch[3]);
		
		//to replace char in string
		
		System.out.println(str.replace('e','x'));
		System.out.println(str.replace('e',' '));
		
		System.out.println(str.replace("wel", "be"));
		System.out.println(str.replace("wel", ""));

	}

}
