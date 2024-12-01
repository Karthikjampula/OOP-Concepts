import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of terms to be printed: ");
        int num=sc.nextInt();
        System.out.print(a+","+b);
        for(int i=0;i<num-2;i++){
            int c=a+b;
            a=b;
            b=c;
            System.out.print("," +c);
        }
        sc.close();
    }
}
