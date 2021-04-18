package week1.assignments;

public class RemoveDuplicates {
	/*
	 * Pseudo code 	 
	 * a) Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";		
	 * b) Initialize an integer variable as count	  
	 * c) Split the String into array and iterate over it 
	 * d) Initialize another loop to check whether the word is there in the array
	 * e) if it is available then increase and count by 1. 
	 * f) if the count > 1 then replace the word as "" 	 
	 * g) Displaying the String without duplicate words	
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		int count = 0; String str="";
		String[] s = text.split(" ");
		for (int i = 0; i < s.length; i++) {
			for (int j = i+1; j < s.length; j++) {
				if(s[i].equals(s[j])) {
					s[j] = "";
					//count++;
				}	
			}	
			 if(i==0) {
					str = s[i];
				}
				else  {
					str = str+" "+s[i];
				}
		}
		str = str.replace("  ", " ");
		System.out.println(str);
	}

}
