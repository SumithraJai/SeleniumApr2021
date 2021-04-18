package week1.day2;

import java.util.Scanner;

public class HyundaiCar {
	
	public void getModelPrice(char model, String fuelType) {
		
		
		if(model == 'A') {
			System.out.println("100000");
			System.out.println(fuelType);
		}else if(model == 'B') {
			System.out.println("200000");
			System.out.println(fuelType);
		}else if(model == 'C') {
			System.out.println("300000");
			System.out.println(fuelType);
		} else {
			System.out.println("Not a correct Model");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HyundaiCar hcObj = new HyundaiCar();
		
		Scanner sc=new Scanner(System.in);
		//sc.next(); for string i/p
		sc.nextBoolean(); sc.nextDouble(); sc.nextFloat(); sc.nextInt();
		sc.next().charAt(0);
		
		hcObj.getModelPrice('C',"Petrol");
		
		

		
	}

}
