package week1.assignments;

public class ChangeOddIndexToUpperCase {
	
	//Pseudocode 1)Declare test as string and assign value as "changeme" and one more string str=""
	//2)convert test to char[] array and declare as ch
	//3)using for loop check the odd indexes by mod of 2
	//4)if odd index comes, change that char to uppercase and add it to string str
	//5)else leave as such and add it str finally, print the o/p	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		String test = "changeme"; String str=""; 
		char[] ch = test.toCharArray();	
		
		for (int i = 0; i < ch.length; i++) {
			if((i % 2) != 0) {
				ch[i] = Character.toUpperCase(ch[i]);
				str = str + ch[i];
				System.out.println(ch[i]);					
			}		
			else {
				str = str + ch[i];
			}			
		}	
		System.out.println(str);

	}

}
