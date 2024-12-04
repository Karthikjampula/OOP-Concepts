package OOP.Encapsulation;

public class BankAccount {
    private String fullName;
    private double bankBalance;
    public BankAccount(String fullName,int intitalBalance){
        this.fullName=fullName;
        if(bankBalance>=0){
            this.bankBalance=intitalBalance;
        }else{
            System.out.println("---Balance cannot be negative---");
            this.bankBalance=0;
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
    public void withdraw(double witdrawAmount){
        if(bankBalance>0){
            bankBalance-=witdrawAmount;
            System.out.println("Withdraw Amount: "+witdrawAmount);
        }else{
            System.out.println("Insufficient Balance..!");
        }
    }
    public void display(){
        System.out.println("Person Name: "+fullName);
        System.out.println("Total Balance: "+bankBalance);
    }
}
