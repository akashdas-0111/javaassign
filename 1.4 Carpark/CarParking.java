import java.util.*;
public class CarParking extends Car {
    void calculate(int hour)
        {
            int cost=1;
            if(hour<=2){
                cost=hour*25;
                System.out.println("The cost is 25 per hour for:"+hour);
            }
            else if(hour>2&&hour<=5)
            {
                cost=hour*30;
                System.out.println("The cost is 30 per hour for:"+hour);
            }
            else if(hour>5&&hour<=10)
            {
                cost=hour*40;
                System.out.println("The cost is 40 per hour for:"+hour);
            }
            System.out.println("Parking Charges Recieved is:"+cost);
        }
        void display()
        {
          System.out.println("Cars present is:126");
          System.out.println("Total cars parked is:150");
          System.out.println("Total cost colllected is:5023");  
        }
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        CarParking c=new CarParking();
        System.out.println("Enter your car number");
        String number=sc.next();
        System.out.println("Enter hours of booking");
        int hours=sc.nextInt();
        c.info(number, hours);
        c.calculate(hours);
        c.display();
    }
}
