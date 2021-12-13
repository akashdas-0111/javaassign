import java.util.*;

class Reservation{
	int ns;
	
	Reservation(int capacity){
		this.ns = capacity;
	}
	
	void reservation() {
		if(ns<=80) {
			System.out.println("Seats reserved successfully!");
			int r = 80 - ns;
			System.out.println("Number of remaining seats: "+ r );
		}
		else {
			System.out.println("Not available this much number of seats.");
		}
	}
}


public class Transport {

	public static void main(String[] args) {
		System.out.println("Total number of seats available: 80");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of seats required: ");
		int capacity = sc.nextInt();
		Reservation s = new Reservation(capacity);
		s.reservation();
	}
}