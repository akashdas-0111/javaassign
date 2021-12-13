import java.util.Scanner;

public class EmpM {

	public static void main(String[] args) {
		int n, res;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no. of details");
		n = s.nextInt();
		Manager m[] = new Manager[n];
		for(int i = 0; i<n ; i++) {
			m[i] = new Manager();
			m[i].acceptParams();
			m[i].acceptBonus();

		}
		res = Manager.max(m, n);
		m[res].displayE();
		m[res].displayM();
	}

}