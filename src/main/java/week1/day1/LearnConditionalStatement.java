package week1.day1;

public class LearnConditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int voterAge=25;
		
		if(voterAge < 18) {
			System.out.println("Minor");
		}
		else if(voterAge >= 18 && voterAge <= 60) {
			System.out.println("Adult");
		}
		else if(voterAge >= 60) {
			System.out.println("Senior Citizen");
		}
		
		
		
		//Shortcuts for block Comment- ctrl+shift+/  block Uncomment- ctrl+shift+\
		/*if(voterAge>=28)
			System.out.println("Eligible to vote"); // immediate statement of if will execute/not based on condition
		System.out.println("End of the program"); //it will execute because its not based on if condition
*/
		if(voterAge>=18) {
			System.out.println("Eligible to vote");
		}
		else {
			System.out.println("Not eligible to vote");
		}
		
		
	}

}
