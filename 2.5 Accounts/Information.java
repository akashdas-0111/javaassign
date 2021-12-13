import java.util.*;

class Information {
    Scanner sc = new Scanner(System.in);
    String name;
    String PAN;
    String Address;
    int unique;
    String accno="";

    Information(String name, String PAN, String Address) {
        this.name = name;
        this.PAN = PAN;
        this.Address = Address;
        System.out.println("Your Entered name is: " + name);
        System.out.println("Your PAN number is: " + PAN);
        System.out.println("Your Address is: " + Address);

    }

    public String getUniqueID() {
        Random r = new Random();
        unique = r.nextInt(999999);
        return String.format("%06d", unique);

    }

    void Nacc() {
        System.out.println("You have Chosen to open an account");
        System.out.println("Which Account do you want to open 1.Savings 2.Demat 3.Home Loan");

        int type = sc.nextInt();
        if (type == 1) {
            accno = getUniqueID();
            System.out.println("Your Savings Account created successfully and your account number is: " + accno);
        } else if (type == 2) {
            accno = getUniqueID();
            System.out.println("Your Demat Account created successfully and your account number is: " + accno);
        } else if (type == 3) {
            accno = getUniqueID();
            System.out.println("Your Home Loan Account created successfully and your account number is: " + accno);
        }

    }

    void update() {
        System.out.println("You have Chosen to update your account");
        System.out.println("What do you want to change 1.Name 2.PAN 3.Address for account" + accno);
        int type = sc.nextInt();
        if (type == 1) {
            String new1 = sc.next();
            name = new1;
            System.out.println("Your Name is Successfully changes to: " + name);
        } else if (type == 2) {
            String new1 = sc.next();
            PAN = new1;
            System.out.println("Your PAN is Successfully changes to: " + PAN);
        } else if (type == 3) {
            String new1 = sc.next();
            Address = new1;
            System.out.println("Your Address is Successfully changes to: " + Address);
        }
    }
}