package OOP.Encapsulation;

public class Main {
    public static void main(String[] args) {
        BankAccount account=new BankAccount("Varun",5000);
        account.deposit(500);
        account.withdraw(125);
        account.display();
    }
}
