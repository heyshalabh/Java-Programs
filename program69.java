/*
Experiment No. 3: Bank Account Management
Aim
To study the use of Access Specifiers (Public, Private, Protected, and Default) in Java.
Problem Statement
Create a BankAccount class with the following data members:
• Account Number – public
• Balance – private
• Branch Name – protected
• Bank Code – default
Create appropriate methods to:
1. Initialize the account details.
2. Access the private member using public methods.
3. Display all account details.
4. Explain the accessibility of each access specifier. 
*/

class BankAccount{

    public int accountNumber;

    private double balance;

    protected String branchName;

    String bankCode;

    BankAccount(int accountNumber, double balance, String branchName, String bankCode){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.branchName = branchName;
        this.bankCode = bankCode;
    }

   public void deposite(double amount){
         balance = balance + amount;
         System.out.println("Amount Deposited : " + amount);

    }

   public void withdrawn(double amount){
        if(amount<=balance){
            balance = balance-amount;
            System.out.println("Amount Withdrawn : " + amount);
        }
        else{
            System.out.println("Insufficient Balance !!!!!");
        }
    }

    public double getBalance(){
        return balance;
    }

    public void displayAccount(){
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Branch Name : " + branchName);
        System.out.println("Bank Code : " + bankCode);
        System.out.println("Balance : " + balance);
    }
}



public class program69{
    public static void main(String[] args) {
        
        BankAccount Acc = new BankAccount(7487488, 25000.54, "Raipur", "IFSC008");
     System.out.println("========Bank Details=========");

     Acc.displayAccount();
     Acc.deposite(5000);
     Acc.withdrawn(1000);

     Acc.getBalance();
        

    }
    
}
