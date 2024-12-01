import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String..!");
        String string1=sc.nextLine();
        String string2="";
        for(int i=string1.length()-1;i>=0;i--){
            char ch= string1.charAt(i);
             string2 +=ch;
        }
        if(string1.equals(string2)){
            System.out.println(string1+ " is a palindrome word");
        }
        else{
            System.out.println(string1 + " is not a palindrome word");
        }
        sc.close();
    }
}