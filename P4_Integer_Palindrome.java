package Practice;

import java.util.Scanner;

public class P4_Integer_Palindrome
{
    public static boolean isPalindrome(int n)
    {
        int temp=n; int sum=0;

        //Reversing the number

        while(n>0)
        {
            int rev= n%10;
            sum=(sum*10)+rev;
            n=n/10;
        }

        if (sum==temp)
        {
            System.out.println("Palindrome");
            return true;
        }
        else
        {
            System.out.println("Non Palindrome");
            return false;
        }



    }

    public static void main(String[] args)
    {
        // accepting the number to be checked
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number");
        int num= sc.nextInt();

        Boolean Result = isPalindrome(num);
        System.out.println(Result);

    }
}
