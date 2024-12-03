import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number=sc.nextInt();
        int num=number;
        int cubeSum=0;
        int count=0;
        while(num >0 ){
            num=num/10;
            count++;
        }
        num=number;
        while(num>0){
            int lastDigit=num%10;
            cubeSum=cubeSum+(int)(Math.pow(lastDigit, count));
            num=num/10;
        }
        if(number==cubeSum){
            System.out.println(number+" is an Armstrong Number");
        }
        else{
            System.out.println(number+" is not an Armstrong Number");
        }
        sc.close();
    }
}
