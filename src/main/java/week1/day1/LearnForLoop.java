package week1.day1;

public class LearnForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initialization ;	Condition ;	Increment/Decrement 
		
		for(int i =	1; i <= 10; i++) {
			
			System.out.println(i);
		}
		
		for(int i =	5; i > 0; i--) {
			
			System.out.println(i);
		}
		
		for(int i = 1; i <= 10; i++) {
			if ( i % 2 != 0) {
				System.out.println(i);
			}
			
		}

	}

}
