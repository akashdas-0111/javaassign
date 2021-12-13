class Student {
	int roll;
	String name;
	String course;
	int marks[];
	public Student(int roll,String name,String course,int marks[]) {
		this.roll = roll;
		this.name = name;
		this.course = course;
		this.marks = marks.clone();
		
	}
	void changeRoll(int roll) {
		this.roll = roll;
	}
	void changeName(String name) {
		this.name = name;
	}
	void changeCourse(String course) {
		this.course = course;
	}
	void changeMarks(int marks[]) {
		this.marks = marks.clone();

	}
	double avgMarksStuWise() {
		double avg;
		double total = 0;
		for(int i=0; i<5; i++) {
			total += marks[i];
		}
		avg = total/5;
		return avg;
	}
}

public class Testmain{

	public static void main(String[] args) {
		int marks1[] = {100, 75, 66, 100, 91};
		Student s1 = new Student(1,"AKASH","CSE",marks1); 
		int marks2[] = {96, 44, 92, 97, 99};
		Student s2 = new Student(2,"DEBABRATA","ECE",marks2); 
		int marks3[] = {56, 72, 84, 44, 50};
		Student s3 = new Student(3,"RAKESH","IT",marks3); 
		Student students[] = new Student[3];
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		System.out.println("Subject wise average marks: "+avgMarksSubWise(students,3));
		System.out.println("Student wise average wise: "+s1.avgMarksStuWise());
		System.out.println("Student wise average wise: "+s2.avgMarksStuWise());
		System.out.println("Student wise average wise: "+s3.avgMarksStuWise());
	}
	
	static double avgMarksSubWise(Student students[],int sub) {
		double avg;
		double total = 0;
		for(int i=0; i < students.length; i++) {
			total += students[i].marks[sub];
		}
		avg = total/students.length;
		return avg;
	}
}