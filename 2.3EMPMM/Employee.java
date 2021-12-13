import java.util.Scanner;
public class Employee {
	private int id;
	private String name; 
	private String department;
	private double salary;
	
	Employee() {
		id = 0;
		name = null;
		department = null;
		salary = 0.0;
	}
	
	Employee(int id, String name, String department, double salary) {
		this.id = id;
		this.name = name;
		this.department = department; 
		this.salary = salary;
	}
	
	public void acceptParams() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter id: ");
		id = s.nextInt();
		System.out.println("Enter name: ");
		name = s.next();
		System.out.println("Enter department");
		department = s.next();
		System.out.println("Enter salary: ");
		salary = s.nextDouble();
	}
	
	public void displayE() {
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Department: " + department);
		System.out.println("Salary: " + salary);
	}
	
	public double getSal() {
		return salary;
	}
}