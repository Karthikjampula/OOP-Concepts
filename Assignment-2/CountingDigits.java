import java.util.Scanner;
public class CountingDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number=sc.nextInt();
        if(number==0){
            System.out.print("Number of digits: 1");
        }
        else{
            int count=0;
        while(number >0 ){
            number=number/10;
            count++;
        }
        System.out.println("Number of digits: "+count);
        }

        sc.close();
    }
}
