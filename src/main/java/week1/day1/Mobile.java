package week1.day1;

//Creating the class Mobile
public class Mobile {
	
	String mobileModel="OnePlus";
	int mobileWeight=100;
	boolean	isFullCharge=true;
	double mobileCost=15000.09;
	
	//Creating the makecall method
	public void makeCall() {
		System.out.println("Making a Call");
	}	
	//Creating the sendMsg method
	public void sendMsg() {
		System.out.println("Message sending");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating the Object for a class Mobile
		Mobile mobObj=new Mobile();
		
		//Calling the methods using class object
		mobObj.makeCall();
		mobObj.sendMsg();
		
		System.out.println("\n"+"Mobile Model: "+mobObj.mobileModel);
		System.out.println("Mobile Weight: "+mobObj.mobileWeight);
		System.out.println("Mobile fully charged: "+mobObj.isFullCharge);
		System.out.println("Mobile Cost: "+mobObj.mobileCost);
	}

}
