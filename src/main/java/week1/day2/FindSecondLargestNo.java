package week1.day2;

import java.util.Arrays;

public class FindSecondLargestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Here is the input
				int[] data = {3,2,11,4,6,7};
				
				Arrays.sort(data);
				int	lastInd = data.length - 1;
				
				System.out.println("Second Largest No: "+ data[lastInd - 1]);
				
			
				
					
				
				
				
				/*for(int i= lastInd-1; i >=0 ; i--) {
					System.out.println("Second Largest No: "+ data[i]);
					break;
				}*/

				
				/*
				 Pseudo Code:
				 1) Arrange the array in ascending order
				 2) Pick the 2nd element from the last and print it
				 */

	}

}
