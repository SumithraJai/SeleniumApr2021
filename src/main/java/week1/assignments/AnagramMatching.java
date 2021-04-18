package week1.assignments;

import java.util.Arrays;

public class AnagramMatching {

	/*
	 * Pseudo Code

	 *Declare a String 
		String text1 = "stops";
	 *Declare another String
		String text2 = "potss"; 
	 * a) Check length of the strings are same then (Use A Condition)
	 * b) Convert both Strings in to characters
	 * c) Sort Both the arrays
	 * d) Check both the arrays has same value
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "stops";
		String text2 = "potss";

		if(text1.length() == text2.length()) {
			char[] ch1 = text1.toCharArray();
			char[] ch2 = text2.toCharArray();

			Arrays.sort(ch1);
			System.out.println(ch1);
			Arrays.sort(ch2);
			System.out.println(ch2);

			if(Arrays.equals(ch1, ch2)) {
				System.out.println("Given string is anagram");
			}
		}


	}

}
