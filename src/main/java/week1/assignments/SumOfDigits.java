package week1.assignments;

import java.util.Scanner;

public class SumOfDigits {
	/*
	 * Goal: Find the sum of digits of a given number
	 * 
	 * input: 123
	 * output: 1+2+3 = 6
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a 'while' loop: type 'while', followed by ctrl + space + enter
	 *   
	 * What are my learnings from this code?
	 * 1)
	 * 2)
	 * 3) 
	 * 
	 */
	
/* Pseudocode 1) Declare your input as int 
	   2)Declare 2 more variables as r,s and assign 0 to them
	   3)use while loop using input value greater than 0
	   4)get the mod value of input by 10 and assign to r , r=input%10
	   5)sum the value of r with s s=r+s
	   6)print the final s value (sum of digits of input)*/ 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int input = 145;
		System.out.println("Please provide the input number: ");
		Scanner sc = new Scanner (System.in);
		int input = sc.nextInt();
		int r=0 , s =0;
		while (input > 0) {
			r = input % 10;
			input = input / 10;
			s = s + r;			
		}		
		System.out.println("Sum of digits of a given number: "+s);
	}

}
