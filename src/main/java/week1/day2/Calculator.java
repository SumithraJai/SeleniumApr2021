package week1.day2;

public class Calculator {
	
	public int add(int a, int b) {
		int	sum = a + b;
		return sum;
	}
	
	public double sub(double a , double b) {
		double result = a - b;
		return result;
	}
	
	public double mul(double a , double b) {
		double result = a * b;
		return result;
	}
	
	public int divide(int a , int b) {
		int result = a / b;
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator c = new Calculator();
		System.out.println(c.add(3, 6));	
		System.out.println(c.sub(9.9,3.6));
		System.out.println(c.mul(8.8, 3.56));	
		System.out.println(c.divide(9, 3));

	}

}
