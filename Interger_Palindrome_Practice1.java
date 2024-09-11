package Practice;

import java.util.Scanner;

public class Interger_Palindrome_Practice1 {

    public static void main(String[] args) {

        //Accepting input for checking palindrome
        System.out.println("Please enter the number for checking Palindrome");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        // reversing teh number
        int temp=n;
        int rev,sum=0;

        while(n>0)
        {
            rev=n%10;
            sum=(sum*10)+rev;
            n=n/10;
        }

        //validating the reverse number
        System.out.println(sum);
        System.out.println(n);

        if (temp == sum)
        {
            System.out.println("The Number is Palindrome");

        }
        else
        {
            System.out.println("The Number is non Palindrome");
        }
    }
}
