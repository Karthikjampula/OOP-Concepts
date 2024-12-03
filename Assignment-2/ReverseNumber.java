import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number=sc.nextInt();
        int lastDigit;
        int reversedNumber=0;
        while(number >0 ){
            lastDigit=number%10;
            reversedNumber=reversedNumber*10+lastDigit;
            number=number/10;
        }
        System.out.println("The Reversed Number is: "+ reversedNumber);
        sc.close();
    }
}
