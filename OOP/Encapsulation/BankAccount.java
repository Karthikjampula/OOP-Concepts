package OOP.Encapsulation;

public class BankAccount {
    private String fullName;
    private double bankBalance;
    public BankAccount(String fullName,int initialBalance){
        this.fullName=fullName;
        if(initialBalance>=0){
            this.bankBalance=initialBalance;
        }else{
            System.out.println("---Balance cannot be negative---");
            this.bankBalance=0;
            System.out.println("Initial Balance set to: "+this.bankBalance);
        }
    }
    public String getFullName(){
        return fullName;
    }
    public void setFullName(String fullName){
        this.fullName=fullName;
    }
    public double getBankBalance(){
        return bankBalance;
    }
    public void deposit(double depAmount){
        if(depAmount>0){
            bankBalance+=depAmount;
            System.out.println("Amount Deposited: "+depAmount);
        }else{
            System.out.println("Deposit amount must be greater than zero");
        }
    }
    public void withdraw(double withdrawAmount){
        if(withdrawAmount<=0){
            System.out.println("Withdrawl amount must be greater than 0");
        }
        else if(withdrawAmount>bankBalance){
            System.out.println("Insufficient Balance..!");
        }else{
            bankBalance-=withdrawAmount;
            System.out.println("Withdraw Amount: "+withdrawAmount);
        }
    }
    public void display(){
        System.out.println("=================");
        System.out.println("Person Name: "+fullName);
        System.out.println("Total Balance: "+bankBalance);
        System.out.println("=================");
    }
}
