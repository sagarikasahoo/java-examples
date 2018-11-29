package objectConcept;

public interface BicycleIn {

	void changeSpeed(int increment);
	void changeGear(int newValue);
}
class Subbicyle implements BicycleIn{

	int speed = 0;
	int gear = 0;

	@Override
	public void changeSpeed(int increment) {
		speed = increment;
		
	}

	@Override
	public void changeGear(int newValue) {
	gear = newValue;
		
	}
	public void printDetails(){
		System.out.println("Speed: "+ speed + "Gear: " + gear);
	}
}
