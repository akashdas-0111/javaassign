import java.util.*;

class Commisson{
    int sales;
    int total;
    Commisson(int sale){
        this.sales=sale;
    }
    int getCommission()
    {
      total=sales*10;
      return total;
    }
   

}
public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of unit sold: ");
        int Sales=sc.nextInt();
        Commisson c=new Commisson(Sales);
        int comm=c.getCommission();
        System.out.println("The Commission calculate Rs 10 per unit is "+comm);
    }
}
