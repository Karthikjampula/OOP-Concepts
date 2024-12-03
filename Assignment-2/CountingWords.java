import java.util.Scanner;
public class CountingWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str=sc.nextLine();
        String[] words =str.split(" ");
        int count= words.length;
        System.out.println("Number of words in the string: "+count);
        sc.close();
    }
}
