
public class Account{
    String accountnumber="12345678";
        double balance=10000;
        String date="15/10/2021";
    int info(String account_number){
        
      if(account_number.equals(accountnumber))
      {   
          System.out.println("Account number matched please proceed");
          System.out.println("Balance is: "+balance);
          System.out.println("Last date of updation: "+date);
          return 0;
      }
      else{
          System.out.println("No Match");
          return 1;
      }
      
    }
    

    
    void Withdraw(double amount){
        if(amount<=balance){
            balance=balance-amount;
           System.out.println("Amount withdrawnn is:"+amount);
           System.out.println("New Balance is:"+balance);
        }
        else{
            System.out.println("Insufficient Amount");
        }
    }
    void Desposit(double amount){
        balance=balance+amount;
        System.out.println("New Balance is: "+balance);
    }
    void balanc()
    {
        System.out.println("Your balance is: "+balance);
    }
    void updation(String Date){
        date=Date;
        System.out.println("The new Date is: "+date);
    }
}
