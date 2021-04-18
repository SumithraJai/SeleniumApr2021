package week1.day1;

public class OddNumber_HW2 {
	/*
	 * Goal: Find the odd numbers in the specific range of numbers
	 * 
	 * Input: range of numbers (starting to end) [1 to 20]
	 * Output: Printing only odd numbers [1,3,5,7,9...,19]
	 * 
	 * Shortcuts:
	 * 1) Print : type 'syso', followed by ctrl + space + enter
	 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
	 * 3) To create an 'if' condition: type 'if', followed by ctrl + space +down arrow + enter
	 * 
	 * What are my learnings from this code?
	 * 
	 * 1)Pseudocode Understanding
	 * 2)Steps to be followed
	 * 3)Effective use of for and If loop
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		System.out.println("Printing only the odd numbers from 1 to 20");
		
		for (int i = 1; i <= 20 ; i++) {
			
			if( (i % 2) != 0 ) {
				System.out.println(i);
			}
		}

		//	Iterate from 1 to 20 (tip: using loop concept)

		//	Within loop -> check whether the integer is odd (tip: use mod operator % )

		//	Within loop -> print the odd integer	

	}

}
