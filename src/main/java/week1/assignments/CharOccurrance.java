package week1.assignments;

public class CharOccurrance {
	// Check number of occurrences of a char (eg 'e') in a String
	// declare and initialize a variable count to store the number of occurrences
	// convert the string into char array
	//get the length of the array
	// traverse from 0 till the array length
	// Check the char array has the particular char in it 
	// if is has increment the count
	// print the count out of the loop
						

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcome to chennai";
		str=str.replace(" ", "");
		int count=0;
		char[] ch=str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i+1; j < ch.length; j++) {
				if(ch[i] == ch[j]) {
					count++;
				}
			}
		}
		
		System.out.println(count);
	}

}
