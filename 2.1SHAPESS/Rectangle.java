public class Rectangle extends Shapes{
	float length;
	float breadth;
	float area;
	
	Rectangle(float length, float breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	float calculateArea() {
		area = length * breadth;
		return area;
	}
	
	void display() {
		System.out.println("The area of Rectangle is " + area );
	}
	
}