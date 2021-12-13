import java.util.*;

public class Accountopen{
    public static void main(String[] args) {
        System.out.println("Welcome To Bank of IIT Narkelbagan");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name:");
        String name = sc.nextLine();
        System.out.println("Enter your PAN");
        String PAN = sc.nextLine();
        System.out.println("Enter your Address");
        String Address = sc.nextLine();
        Information f1 = new Information(name, PAN, Address);
        System.out.println("If you want to open an account press 1");
        int choice = sc.nextInt();
        int c=0;
        if(choice==1)
        {   c++;
            f1.Nacc();
            System.out.println("Do want End press 1 or Update 2");
                int cho=sc.nextInt();
                if(cho==1)
                {
                    System.out.println("Thanks for Coming");
                }
                else if(cho==2)
                {
                    f1.update();
                }
        }
        else if(choice==2){
            if(c!=1)
            {
                System.out.println("Make an account first");
                f1.Nacc();
                System.out.println("Do want End press 1 or Update 2");
                int cho=sc.nextInt();
                if(cho==1)
                {
                    System.out.println("Thanks for Coming");
                }
                else if(cho==2)
                {
                    f1.update();
                }
            }
            else{
            f1.update();
            }
        }

        }
    }




