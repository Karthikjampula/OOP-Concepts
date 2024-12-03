import java.util.Scanner;
public class MultiplicationUsingMethod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        printTable(num);
        sc.close();
    }
    static void printTable(int num){
        System.out.println("=====Multiplication Table of "+num+"=====");
        for(int i=1;i<=10;i++){
            System.out.println(num + " X "+ i +" = " + (num*i));
        }
    }
}
