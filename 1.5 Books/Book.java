import java.util.*;

class Books{
    void display() {
    	System.out.println("Available Books: ");
    	System.out.println("1. NETFLIX");
    	System.out.println("2. PRIME");
    }
}
class Purchase extends Book{
	String name;
	int number;
	
	Purchase(String name, int number){
		this.name = name;
		this.number = number;
		System.out.println("Purchased ");
		System.out.println(name + " is puchased and "+ number + "pieces are sold.");
		
	}
	Purchase(Purchase booknew, String n){
		name = booknew.name;
		number = booknew.number;
		if(n.equals(name)) {
		System.out.println(name + " is already  purchased and  copies sold are " + number);
		}
		else {
			System.out.println(n + " is available");
		}
	}
}


public class Book {

	public static void main(String[] args) {
		Books B1 = new Books();
		B1.display();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Book name for purchase: ");
        String bname = sc.next();
        System.out.println("Enter the number of copy of books needed: ");
        int number = sc.nextInt();
        Purchase b1 = new Purchase(bname, number);
        System.out.println("Enter the name of book for further purchase: ");
        String bookname = sc.next();
        Purchase b2 = new Purchase(b1, bookname);
	}
}