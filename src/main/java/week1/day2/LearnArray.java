package week1.day2;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Array is the collection of same data type
		//Declaring an array with max limit
		int[] num=new int[3]; //all the data are saved with index
		
		//Assign data to the array , index always starts with 0 and and ends with length-1
		num[0] = 10;
		num[1] = 30;
		num[2] = 20;
		//num[3] = 40; Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
			
		System.out.println("Direct order: ");
		for(int i=0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
		System.out.println("Reverse order: ");
		for (int i = num.length-1; i >= 0; i--) {
			System.out.println(num[i]);
		}
		

		//Another way of assigning an array
		int[] n= {10, 20, 12, 40, 35, 61, 70, 50, 90} ;
		
		//to get the length of an array
		int len=n.length;
		int lastindex=len-1;
		
		//to sort the values: Ascending order
		Arrays.sort(n);
		
		System.out.println("Ascending order: ");
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}
		
		System.out.println("Descending order: ");
		for (int i = lastindex; i >=0; i--) {
			System.out.println(n[i]);
		}
		

	}

}
