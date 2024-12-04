package OOP.Encapsulation;

public class Main {
    public static void main(String[] args) {
        BankAccount account=new BankAccount("Tejasree",5000);
        account.display();
        account.deposit(500);
        account.display();
        account.withdraw(300);
        account.display();
    }
}
