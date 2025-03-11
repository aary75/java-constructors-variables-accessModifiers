// Creating the class BankAccountManagement to manage bank account
import java.util.Scanner;

// BankAccountManagement class to run the program
public class BankAccountManagement {
     public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in); // scanner class to get user's input

        String space = "true";

         while(space.equals("true")) {
          System.out.print("Enter account number: ");
          Long accountNumber = scanner.nextLong();

          scanner.nextLine();
          System.out.print("Enter account holder's name: ");
          String accountHolder = scanner.nextLine();

          System.out.print("Enter balance: ");
          int balance = scanner.nextInt();

          // Creating a BankAccount object
          BankAccount account1 = new BankAccount(accountNumber, accountHolder, balance);
         
          // Updating balance
           scanner.nextLine();
          System.out.print("How balance change? By ");
          String balanceChange = scanner.nextLine();

          
          System.out.print("Amount change: ");
          int amount = scanner.nextInt();
          account1.setbalance(balanceChange.toLowerCase(),amount);

         System.out.println("Updated balance: " + account1.getbalance());
          System.out.println();

          // Creating a SavingsAccount object
          SavingsAccount svAccount = new SavingsAccount(accountNumber, accountHolder, balance);
          
          svAccount.displayAccountInfo();
         scanner.nextLine();

         System.out.print("Do you want to add more student(true/false): ");
         space = scanner.nextLine();
   }
}}

// BankAccount class
class BankAccount{

     public long accountNumber; // Public attribute
     protected String accountHolder; // Protected attribute
     private int balance;  // Private attribute

     // Constructor
     public BankAccount(long accountNumber, String accountHolder, int balance){
         this.accountNumber = accountNumber;
         this.accountHolder = accountHolder;
         this.balance = balance;
    }

    // Getter method for balance
    public int getbalance(){
        return balance;
    }

    // setter method for balance
     public void setbalance(String balanceChange, int amount) {
          
         if(balanceChange.equals("deposits")){
              this.balance = balance + amount;
          }
          else{
               if(amount > balance) System.out.print("Cannot withdraw");
               else this.balance = balance - amount;
           }
      }

}

// subclass SavingsAccount use of protected member
class SavingsAccount extends BankAccount {
    
     // Constructor
     public SavingsAccount(long accountNumber, String accountHolder,int balance){
        super(accountNumber, accountHolder, balance);
        
     }

     // Method to display accountNumber and accountHolder
     public void displayAccountInfo(){
        System.out.println("Account Number " + accountNumber);
        System.out.println("Account's Holder name: " + accountHolder);
        System.out.println();
    }
}
 
// Input:
// Enter account number: 30060405221001
// Enter account holder's name: Aaryan
// Enter balance: 20000
// How balance change? By Deposits
// Amount change: 2000

// Output:
// Updated balance: 22000

// Account Number 30060405221001
// Account's Holder name: Aaryan

// Do you want to add more student(true/false): true
// Input:
// Enter account number: 300604521100012
// Enter account holder's name: Hitesh
// Enter balance: 52200
// How balance change? By Withdraw
// Amount change: 3000

// Output:
// Updated balance: 49200

// Account Number 300604521100012
// Account's Holder name: Hitesh

// Do you want to add more student(true/false): false
