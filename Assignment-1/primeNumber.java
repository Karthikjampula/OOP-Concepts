import java.util.Scanner;
public class primeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        boolean flag=true;
        if(num<2){
            System.out.println("Input must be greater than 1");
        }
        else if(num==2){
            System.out.println(num +" is a prime number");
        }
        else{
        for(int i=2;i<num;i++){
            flag=false;
            if(num%i==0){
                flag=true;
                break;
            }
        }
          if(flag){
                System.out.println(num +" is not a prime number");
            }
            else{
                System.out.println(num + " is a prime number");
            }
            sc.close();
        }
    }
    }

