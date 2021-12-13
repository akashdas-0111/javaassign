import java.util.Scanner;

public class Manager extends Employee{
	private double bonus;
	
	public void acceptBonus() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter bonus: ");
		bonus = s.nextDouble();
	}
	
	public void displayM() {
		System.out.println("Bonus: " + bonus);
	}
	
	static int max(Manager[] m, int n) {
		double max = 0;
		int temp = 0;
		for(int i = 0; i<n; i++ ) {
			if(max < m[i].getSal() + m[i].bonus) {
				max = m[i].getSal() + m[i].bonus;
				temp = i;
			}
		}
		System.out.println("Max salary is: " + max);
		return temp;
	}

}