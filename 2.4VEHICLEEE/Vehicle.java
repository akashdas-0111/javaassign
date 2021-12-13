import java.util.*;

public class Vehicle {

	public static void main(String[] args) {
		int ch;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter type of vehicle: ");
		System.out.println("1. Light Motor Vehicle");
		System.out.println("2. Heavy Motor Vehicle");
		ch = s.nextInt();
		switch(ch) {
		case 1: System.out.println("Enter no. of light motor vehicles: ");
				int n;
				n = s.nextInt();
				LVehicle[] l = new LVehicle[n];
				for(int i = 0; i< n; i++) {
					l[i] = new LVehicle();
					l[i].acceptLMV();
				}
				for(int i = 0; i<n; i++) {
					l[i].displayLMV();
				}
				break;
		case 2: System.out.println("Enter no. of heavy motor vehicles: ");
				int m;
				m = s.nextInt();
				HVehicle[] h = new HVehicle[m];
				for(int i = 0; i< m; i++) {
					h[i] = new HVehicle();
					h[i].acceptHMV();
				}
				for(int i = 0; i<m; i++) {
					h[i].displayHMV();
				}
				break;
		}

	}

}