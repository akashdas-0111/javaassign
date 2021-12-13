import java.util.*;

public class LVehicle extends Vehicles {
	double mileage;
	
	public void acceptLMV() {
		super.acceptV();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter mileage: ");
		mileage = s.nextDouble();
	}
	
	public void displayLMV() {
		super.displayV();
		System.out.print("Unique ID:");
		System.out.println(getUniqueID());
		System.out.println("Mileage: " + mileage);
	}
}