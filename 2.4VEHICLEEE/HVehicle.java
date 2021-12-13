import java.util.*;

public class HVehicle extends Vehicles {
	double capacityInTons;
	
	public void acceptHMV() {
		super.acceptV();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter capacity in tons: ");
		capacityInTons = s.nextDouble();
	}
	
	public void displayHMV() {
		super.displayV();
		System.out.print("Unique ID:");
		System.out.println(getUniqueID());
		System.out.println("Capacity In Tons: " + capacityInTons);
	}
}