package week1.day2;

public class LearnJumpStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for( int i = 1; i <= 5; i++)	{
			
			if ( i == 3) {
				System.out.println("Three");
				//continue;//Terminate the current iteration and execute the next iteration
				break; //Stop & come out of the loop will not execute after break statement
			}
			
			System.out.println(i);
			
		/*	else {
			System.out.println(i);
			}
			*/
		}
		
		System.out.println("End of the loop");

	}

}
