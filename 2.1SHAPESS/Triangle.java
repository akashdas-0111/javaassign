public class Triangle extends Shape{
	double base;
	double height;
	double area;
	
	Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	float calculateArea() {
		area = 0.5 * base * height;
		return (float) area;
	}
	
	void display() {
		System.out.println("The area of triangle is " + area);
	}
	
}