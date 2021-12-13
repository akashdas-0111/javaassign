public class Teacher extends Person{
	String department;
	String course;
	int daysInWeek;
	
	Teacher(String name, int age, String college, String address, String department, String course, int daysInWeek) {
		super(name, age, college, address);
		this.department = department;
		this.course = course;
		this.daysInWeek = daysInWeek;
	}
	
	public String toString() {
		return "Teacher: [" + name + ", " + age + ", " + college + ", " + address + ", " + department + ", " + course + ", and took classes " + daysInWeek + " days a week]";
		
	}
}
