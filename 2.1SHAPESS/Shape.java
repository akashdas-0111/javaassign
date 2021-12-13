public class Shape {

	public static void main(String[] args) {

		Rectangle r = new Rectangle(4, 5);
		Triangle t = new Triangle(3, 4);
		System.out.println(r.calculateArea());
		r.display();
		System.out.println(t.calculateArea());
		t.display();
	}
}