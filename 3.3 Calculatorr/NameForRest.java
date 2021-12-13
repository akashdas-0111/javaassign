import java.util.Scanner;

public class NameForRest implements BasicCalculator {
	int a;
	int b;

	public NameForRest(int a, int b) {
		System.out.println("Welcome to Calculator!\nOperations available to you are:");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Modulo");
		Scanner myObj = new Scanner(System.in); 
		System.out.println("Enter choice");
		int ch = myObj.nextInt();
		switch(ch) {
			case 1: addition(a, b);  
		    break;    
		    case 2: subtraction(a, b);  
		    break;    
		    case 3: multiplication(a, b); 
		    break;    
		    case 4: modulo(a, b);
		    break;
		    default:System.out.println("Invalid!");
	}
	}
	
	public void addition(int a, int b) {
	
		System.out.println(a+b);
		
	}

	public void subtraction(int a, int b) {
		
		System.out.println(a-b);
		
	}

	public void multiplication(int a, int b) {
		
		System.out.println(a*b);
		
	}

	public void modulo(int a, int b) {
		
		System.out.println(a%b);
		
	}

}