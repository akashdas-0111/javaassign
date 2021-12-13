import java.util.*;

public class Vehicles {
	String company;
	double price;
	int unique;
	
	public void acceptV() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter name of the company: ");
		company = s.next();
		System.out.println("Enter price of the vehicle: ");
		price = s.nextDouble();
		
	}
	
	public String getUniqueID() {
		Random r = new Random();
		unique = r.nextInt(999999);
		return String.format("%06d", unique);
		
	}
	
	public void displayV() {
		System.out.println("Company: " + company + ", Price: " + price);
	}
}