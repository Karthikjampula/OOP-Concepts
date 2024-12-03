import java.util.Scanner;
public class EvenOddCount {
    public static void main(String[] args) {
        int evenCount=0;
        int oddCount=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter "+size+" elements of the array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
        System.out.println("Number of Even numbers in the Array: "+evenCount);
        System.out.println("Number of Odd numbers in the Array: "+oddCount);
        sc.close();
    }    
}
