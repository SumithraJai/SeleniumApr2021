package week1.day1;

//AccessSpecifier Classkeyword classname
public class Car {
	
	//datatype variablename value
	long ownerPhno=	1234567890L;
	float fuelCapacity=35.5f;
	double carPrice=800000.25;
	boolean isPuncture=false;
	char fuelType='P';
	String carColour="Red";
	
	//AccessSpecifier returnType methodName()
	public void driveCar() {
		int kmDriven=450;
		System.out.println(kmDriven);
		System.out.println(ownerPhno);
		System.out.println("Driving a Car");		
	}

	public void applyBrake() {
		System.out.println(ownerPhno);
		System.out.println("Applied Brake");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ClassName objName=new Classname();		
		Car myCar=new Car();
		
		//to call the method objname.method()
		myCar.driveCar();
		System.out.println(myCar.ownerPhno);
		
		float fc=myCar.fuelCapacity;
		System.out.println(fc);
	}

}
