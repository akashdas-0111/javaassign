public class Student extends Person{
	String department;
	int totalNoOfCourses;
	int daysPresent;
	
	Student(String name, int age, String college, String address, String department, int totalNoOfCourses, int daysPresent) {
		super(name, age, college, address);
		this.department = department;
		this.totalNoOfCourses = totalNoOfCourses;
		this.daysPresent = daysPresent;
	}
	
	public String toString() {
		return "Student: [" + name + ", " + age + ", " + college + ", " + address + ", " + department + ", " + totalNoOfCourses + ", and present " + daysPresent + " days a week]";
		
	}

}