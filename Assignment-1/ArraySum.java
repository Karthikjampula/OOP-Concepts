import java.util.Scanner;
public class ArraySum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=sc.nextInt();
        int sum=0;
        int[] arr=new int[size];
        System.out.println("Enter "+size+" elements of the array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("The sum of the array elements : "+sum);
        sc.close();
    }
}
