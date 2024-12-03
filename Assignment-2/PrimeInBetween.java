import java.util.Scanner;
public class PrimeInBetween {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the starting number: ");
        int start=sc.nextInt();
        System.out.println("Enter the end number:");
        int end=sc.nextInt();
        System.out.println("The prime numbers in between "+start+" & "+end+" are:");
         for (int num = start+1; num < end; num++) {
            if (num <= 1) {
                continue; 
            }
        boolean isPrime=true;
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(num+" ");
            }
        }
        sc.close();
    }
}
