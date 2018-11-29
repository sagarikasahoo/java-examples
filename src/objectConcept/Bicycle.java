package objectConcept;

public class Bicycle {

	int speed =0; //Instance Variable
	int gear =1;
	
	void changeSpeed(int newValue){
		speed = newValue;
	}
	void changeGear(int newGear){
		gear = newGear;
	}
	void printDetails(){
		System.out.println("Speed:"+speed + " Gear:"+gear);
	}
		
	public static void main(String[] args) {
		Bicycle b1 = new Bicycle(); //Object creation for Bicycle class
		Bicycle b2 = new Bicycle();
		
		b1.changeSpeed(50);//Initializing value
		b1.changeGear(2);
		b1.printDetails();
		
		b2.changeSpeed(90);
		b2.changeGear(3);
		b2.printDetails();

	}
	}
