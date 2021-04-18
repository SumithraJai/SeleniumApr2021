package week1.day1;

public class FibonacciSeries_HW3 {
	/*
	 * Goal: To find Fibonacci Series for a given range
	 * 
	 * input(range): 8 output: 0, 1, 1, 2, 3, 5, 8, 13
	 * 
	 * Shortcuts: 1) Print : type: syso, followed by: ctrl + space + enter 2) To
	 * create a 'for' loop: type 'for', followed by ctrl + space + down arrow +
	 * enter
	 * 
	 * What are my learnings from this code?
	 *  1)Understanding the logic is must
	 *  2)Deriving Pseudocode is also must 
	 *  3)Use appropriate methods/conditions
	 * 
	 */
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			int range = 8;
			int firstNum = 0 , secNum = 0;
			int sum = 1;
			
			
			for (int i = 1; i < range; i++) {
				
				firstNum = secNum;
				secNum = sum;
				sum = firstNum + secNum;
				
				System.out.println("Fibonacci series: "+firstNum);
				
			}
			
		
		/*	int n1=0,n2=0,n3=1;
			
			System.out.print("Fibonacci Series: ");
			
			while(n2<=89)
			{
				n1=n2;
				n2=n3;
				n3=n1+n2;
				System.out.print(n1+ " ");
				
			}
*/
		// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)

		// Print first number
		
		// Iterate from 1 to the range
		
		// add first and second number assign to sum

		// Assign second number to the first number

		// Assign first number to the sum
		
		// print sum



	}

}
