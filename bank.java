import java.util.*;
public class bank {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    BankAccount Bank1 = new BankAccount("xyz","01");
    Bank1.showmenu();
  }   
}
class BankAccount{
    int balance;
    int previoustransaction;
    String customername;
    String customerid;

    BankAccount(String cname,String cid){
        customername=cname;
        customerid=cid;
    }
    
    void deposit(int amount){
        if(amount!=0){
            balance=balance+amount;
            previoustransaction=amount;
        }
    }
    void withdrawn(int amount){
        if(amount!=0){
            balance -= amount;
            previoustransaction= -amount;
        }
    }

void getprevioustransaction(){
    if(previoustransaction>0){
        System.out.println("Desposited:"+previoustransaction);
    }
    else if(previoustransaction<0){
        System.out.println("withdrawn: "+Math.abs(previoustransaction));
    }else{
        System.out.println("No transaction is occured!");
    }
  } 

  void showmenu(){
       char option ='\0';
       Scanner sc=new Scanner(System.in);

       System.out.println("Welcome "+customername);
       System.out.println("Your ID is: "+customerid);
       System.out.println();
       System.out.println("A. Check Balance");
       System.out.println("B. Deposit");
       System.out.println("C. Withdraw");
       System.out.println("D. Previous Transaction");
       System.out.println("E. Exit");

       do{
        System.out.println("=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=");
        System.out.println("Enter the option");
        System.out.println("=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=");
        option = sc.next().charAt(0);
      // problem here !!!! a b c d  
       // Character.toUpperCase(option);

        switch(option){
          case 'A': 
          System.out.println("=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=");
          System.out.println("Balance is: "+balance);
          System.out.println("=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=");
          System.out.println();
          break;

          case 'B':
          System.out.println("=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=");
          System.out.println("Enter the amount to deposit");
          System.out.println("=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=");
          int amount = sc.nextInt();
          deposit(amount);
          System.out.println();
          break;

          case 'C':
          System.out.println("=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=");
          System.out.println("Enter the amount to withdraw");
          System.out.println("=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=");
          int amount2 =sc.nextInt();
          withdrawn(amount2);
          System.out.println();
          break;

          case 'D':
          System.out.println("=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=");
          getprevioustransaction();
          System.out.println("=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=");
          System.out.println();
          break;

          case 'E':
          System.out.println("=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=.=");
          break;

          default:
          System.out.println("Invalid option! Please try again");
          break;
        }
       }while(option != 'E');
    }
}