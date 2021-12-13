public class School {

	public static void main(String[] args) {
		Teacher[] t;
		Student[] s;
		t = new Teacher[1];
		s = new Student[1];
		t[0] = new Teacher("Akash", 25, "TINT", "Rajarhat", "CSE", "OOPS", 5);
		s[0] = new Student("Raj", 20, "TINT", "Kolkata", "CSE", 12, 2);
		System.out.println(t[0].toString());
		System.out.println(s[0].toString());
	}
}