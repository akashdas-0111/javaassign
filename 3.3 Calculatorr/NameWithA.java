import java.util.Scanner;

public class NameWithA implements BasicCalculator {
	int a;
	int b;
	
	public NameWithA(int a, int b) {
		System.out.println("Welcome to Calculator\nOperations available to you are:");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		Scanner myObj = new Scanner(System.in); 
		System.out.println("Enter choice");
		int ch = myObj.nextInt();
		switch(ch) {
			case 1: addition(a, b);  
		    break;    
		    case 2: subtraction(a, b);  
		    break;
		    default:System.out.println("Invalid!"); 
		}
	}
		

	@Override
	public void addition(int a, int b) {
	
		System.out.println(a+b);
		
	}

	@Override
	public void subtraction(int a, int b) {
		
		System.out.println(a-b);
		
	}

	@Override
	public void multiplication(int a, int b) {
		
		
	}

	@Override
	public void modulo(int a, int b) {
		
		
	}
	
}