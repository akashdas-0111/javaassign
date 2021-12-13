import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the row no. of 1st Matrix: ");
        int r=sc.nextInt();
        System.out.print("Enter the column no. of 1st Matrix: ");
        int c=sc.nextInt();
        matrix m=new matrix(r,c);
        System.out.println("Enter the matrix");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                int v=sc.nextInt();
                m.setElementAt(i,j,v);
            }
        }
        System.out.print("Enter the row no. of 2nd Matrix: ");
        int r1=sc.nextInt();
        System.out.print("Enter the column no. of 2nd Matrix: ");
        int c1=sc.nextInt();
        matrix m1=new matrix(r1,c1);
        System.out.println("Enter the matrix");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                int v=sc.nextInt();
                m1.setElementAt(i,j,v);
            }
        }
        try {
           matrix m2= m.addition(m, m1);
           System.out.println("After Addition");
           m2.print();
        }
        catch(AdditionNotPossibleException e){
            System.out.println(e);
        }


    }
}