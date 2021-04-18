package week1.assignments;

import java.util.Scanner;

public class PrimeNumber {

	// Declare an int Input and assign a value 13
	// Declare a boolean variable flag as false
	// Iterate from 2 to half of the input
	// Divide the input with each for loop variable and check the remainder
	// Set the flag as true when there is no remainder
	// break the iterator
	// Check the flag (Provide a condition)
	// Print 'Prime' when the condition matches
	// Print 'Not a Prime' when the condition doesn't match
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please provide a number: ");
		Scanner sc=new Scanner(System.in);
		int input = sc.nextInt();
		//int input  = 13; 
		int n = 0;
		n=input / 2;
		boolean b = false;
		if(input == 0 || input== 1) {		
			System.out.println(input+" is not a prime number");
			}
		else {
			for (int i = 2; i <= n; i++) {
				if(input % i == 0) {
					System.out.println(input+" is not a prime number");
					b = true;
					break;
				}
			}
			if(b == false) {
				System.out.println(input+" is prime number");
			}
		}
		
	}

}
