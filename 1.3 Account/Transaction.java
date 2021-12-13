import java.util.*;
class Transaction extends Account{

    public static void main(String[] args) {
        Transaction t=new Transaction();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Account number for vadilation");
        String accountno=sc.next();
        int go=t.info(accountno);
        if(go==0){
        System.out.println("Enter today Date: ");
        String today=sc.next();
        t.updation(today);
        System.out.println("Enter Transaction type 1.Withdraw or 2.Deposit or 3.View Balance");
        int type=sc.nextInt();
        if(type==1){
            System.out.println("Enter amount to be withdrawn");
            double amount=sc.nextDouble();
            t.Withdraw(amount);
        }
        else if(type==2){
            System.out.println("Enter amount to be Deposited");
            double amount=sc.nextDouble();
            t.Desposit(amount);
        }
        else if(type==3){
            t.balanc();
        }
        else
        {
            System.out.println("Invalid type");
        }
    }
    else{
        System.out.println("No Trasaction Allowed");
    }

  }
}
