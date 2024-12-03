import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first value: ");
        int a=sc.nextInt();
        System.out.println("Enter the second value: ");
        int b=sc.nextInt();   
        int gcdValue=findingGCD(a, b);
        System.out.println("GCD of " + a+" and "+b+" is: "+gcdValue); 
        sc.close();
    }    
    public static int findingGCD(int num1,int num2){
        while(num2!=0){
            int temp=num2;
            num2=num1%num2;
            num1=temp;
        }
        return num1;
    }

}
