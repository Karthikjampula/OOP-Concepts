import java.util.Scanner;
public class LCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1=sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2=sc.nextInt();
        findingLCM(num1, num2);
        sc.close();
    }    
    static void findingLCM(int num1,int num2){
        int val1=num1;
        int val2=num2;
        int gcd;
        while(val2!=0){
            int temp=val2;
            val2=val1%val2;
            val1=temp;
        }
        gcd=val1;
        int lcm=(num1*num2)/gcd;
        System.out.println(lcm);
    }
}
